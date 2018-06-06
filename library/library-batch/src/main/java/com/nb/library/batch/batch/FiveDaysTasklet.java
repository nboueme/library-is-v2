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
import java.util.Map;

import static java.time.temporal.ChronoUnit.DAYS;

public class FiveDaysTasklet extends AbstractService implements Tasklet {

    private static final Logger LOGGER = LogManager.getLogger(FiveDaysTasklet.class);

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        Map<String, List<Borrowing>> borrowings = getManagerFactory().getBorrowingManager().listBorrowingsByUserIsReminder();
        borrowings.entrySet().iterator().forEachRemaining(userBorrowings -> sendEmail(userBorrowings.getValue()));

        return RepeatStatus.FINISHED;
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
