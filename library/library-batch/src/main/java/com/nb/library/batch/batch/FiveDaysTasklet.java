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
import java.util.List;

public class FiveDaysTasklet extends AbstractService implements Tasklet {

    private static final Logger LOGGER = LogManager.getLogger(FiveDaysTasklet.class);

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        List<Borrowing> borrowings = getManagerFactory().getBorrowingManager().listBorrowingByPeriodsExceeded();
        EmailService service = new EmailService();

        LocalDate currentDate = LocalDate.now();
        LocalDate borrowingDate;
        LocalDate returnDate;

        return RepeatStatus.FINISHED;
    }
}
