package com.nb.library.batch.batch;

import com.nb.library.batch.service.AbstractService;
import com.nb.library.batch.service.EmailService;
import com.nb.library.client.borrowing.Book;
import com.nb.library.client.borrowing.Borrowing;
import com.nb.library.client.borrowing.Work;
import com.nb.library.client.reservation.Reservation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import javax.xml.datatype.DatatypeFactory;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class ReservationTasklet extends AbstractService implements Tasklet {

    private static final Logger LOGGER = LogManager.getLogger(ReservationTasklet.class);

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        List<Reservation> reservations = getManagerFactory().getReservationManager().listAllReservations();
        List<Reservation> distinctReservations = new ArrayList<>(0);

        Integer workId = 0;

        for (Reservation reservation : reservations) {
            if (workId.equals(0)) {
                workId = reservation.getWork().getId();
                distinctReservations.add(reservation);
            }

            if (!workId.equals(reservation.getWork().getId())) {
                workId = reservation.getWork().getId();
                distinctReservations.add(reservation);
            }
        }

        LocalDate currentDate = LocalDate.now();
        LocalDate notificationDate;
        GregorianCalendar calendar = new GregorianCalendar();

        for (Reservation reservation : distinctReservations) {
            Work work = new Work();
            work.setId(reservation.getWork().getId());
            Book book = new Book();
            book.setWork(work);
            Borrowing borrowing = new Borrowing();
            borrowing.setBook(book);

            if (reservation.getWork().getBooks().size() != getManagerFactory().getBorrowingManager().listBorrowingsByWorkId(borrowing).size()) {
                if (reservation.getNotificationDate() == null) {
                    reservation.setNotificationDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar));
                    getManagerFactory().getReservationManager().update(reservation);

                    sendEmail(reservation);
                }
                else {
                    notificationDate = LocalDate.from(reservation.getNotificationDate().toGregorianCalendar().toZonedDateTime().toLocalDate());
                    if (DAYS.between(notificationDate, currentDate) == 2) {
                        getManagerFactory().getReservationManager().deleteReservation(reservation);

                        com.nb.library.client.reservation.Work workReservation = new com.nb.library.client.reservation.Work();
                        workReservation.setId(reservation.getWork().getId());

                        Reservation reservationToUpdate = getManagerFactory().getReservationManager().listReservationsByWork(workReservation).get(0);
                        reservationToUpdate.setNotificationDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar));
                        getManagerFactory().getReservationManager().update(reservationToUpdate);

                        sendEmail(reservationToUpdate);
                    }
                }
            }
        }

        return RepeatStatus.FINISHED;
    }

    private void sendEmail(Reservation reservation) {
        EmailService service = new EmailService();

        LocalDate reservationDate = LocalDate.from(reservation.getReservationDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

        String to = reservation.getUser().getEmail();
        String subject = "One exemplary of the book that you reserved is available";
        String text = "You reserved at the date of " +
                reservationDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")) +
                " the following book: \"" +
                reservation.getWork().getTitle() +
                "\". You have 48 hours to borrow him.";

        service.sendSimpleMessage(to, subject, text);
        LOGGER.info("Message correctly sent to the user: " + reservation.getUser().getFirstName() + " " + reservation.getUser().getLastName());
    }
}
