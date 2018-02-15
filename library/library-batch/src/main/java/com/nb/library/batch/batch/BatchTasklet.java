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
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;

public class BatchTasklet extends AbstractService implements Tasklet {

    private static final Logger LOGGER = LogManager.getLogger(BatchTasklet.class);

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        List<Borrowing> borrowings = getManagerFactory().getBorrowingManager().listBorrowingByPeriodsExceeded();
        EmailService service = new EmailService();

        LocalDate currentDate = LocalDate.now();
        LocalDate borrowingDate;
        LocalDate returnDate;

        for (Borrowing borrowing : borrowings) {
            String to = borrowing.getUser().getEmail();

            borrowingDate = LocalDate.from(borrowing.getBorrowingDate().toGregorianCalendar().toZonedDateTime().toLocalDate());
            returnDate = LocalDate.from(borrowing.getReturnDate().toGregorianCalendar().toZonedDateTime().toLocalDate());

            String subject = "Borrowing : return date exceeded ("
                    + returnDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"))
                    + ") by "
                    + DAYS.between(returnDate, currentDate)
                    + " days";

            String text = "Return date exceeded for the book \""
                    + borrowing.getBook().getWork().getTitle()
                    + "\" that you borrowed on "
                    + borrowingDate.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));

            service.sendSimpleMessage(to, subject, text);
            LOGGER.info("Message correctly sent to the user: " + borrowing.getUser().getFirstName() + " " + borrowing.getUser().getLastName());
        }

        return RepeatStatus.FINISHED;
    }
}
