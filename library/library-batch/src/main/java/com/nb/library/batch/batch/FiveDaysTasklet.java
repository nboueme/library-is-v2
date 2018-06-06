package com.nb.library.batch.batch;

import com.nb.library.batch.service.AbstractService;
import com.nb.library.batch.service.EmailService;
import com.nb.library.client.borrowing.Borrowing;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class FiveDaysTasklet extends AbstractService implements Tasklet {

    private static final Logger LOGGER = LogManager.getLogger(FiveDaysTasklet.class);

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        List<Borrowing> borrowings = getManagerFactory().getBorrowingManager().listBorrowingsByUserIsReminder();
        List<Borrowing> userBorrowings = new ArrayList<>(0);

        String currentUserEmail = "";

        for (Borrowing borrowing : borrowings) {
            String email = borrowing.getUser().getEmail();

            if (currentUserEmail.equals("")) {
                currentUserEmail = email;
            }

            if (currentUserEmail.equals(email)) {
                userBorrowings.add(borrowing);
            }
            else if (!currentUserEmail.equals(email)) {
                if (checkDaysBetween(userBorrowings)) {
                    sendEmail(userBorrowings);
                }
                userBorrowings.clear();
                userBorrowings.add(borrowing);

                currentUserEmail = email;
            }
        }

        if (checkDaysBetween(userBorrowings)) {
            sendEmail(userBorrowings);
        }

        return RepeatStatus.FINISHED;
    }

    private boolean checkDaysBetween(List<Borrowing> userBorrowings) {
        LocalDate currentDate = LocalDate.now();
        LocalDate returnDate;

        for (Borrowing borrowing : userBorrowings) {
            returnDate = LocalDate.from(borrowing.getReturnDate().toGregorianCalendar().toZonedDateTime().toLocalDate());
            if (DAYS.between(returnDate, currentDate) == 5) return true;
        }

        return false;
    }

    private void sendEmail(List<Borrowing> userBorrowings) {
        EmailService service = new EmailService();

        LocalDate borrowingDate;
        LocalDate returnDate;

        String to = "";
        String subject = "Reminder for your borrowings";
        StringBuilder text = new StringBuilder();

        for (Borrowing borrowing : userBorrowings) {
            to = borrowing.getUser().getEmail();

            borrowingDate = LocalDate.from(borrowing.getBorrowingDate().toGregorianCalendar().toZonedDateTime().toLocalDate());
            returnDate = LocalDate.from(borrowing.getReturnDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

            text.append("- \"")
                    .append(borrowing.getBook().getWork().getTitle())
                    .append("\" that you borrowed on ")
                    .append(borrowingDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")))
                    .append("\" and expires on ")
                    .append(returnDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd")))
                    .append("\n");
        }

        service.sendSimpleMessage(to, subject, text.toString());
        LOGGER.info("Message correctly sent to the user: " + to);
    }
}
