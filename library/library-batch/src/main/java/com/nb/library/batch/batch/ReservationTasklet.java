package com.nb.library.batch.batch;

import com.nb.library.batch.service.AbstractService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class ReservationTasklet extends AbstractService implements Tasklet {

    private static final Logger LOGGER = LogManager.getLogger(ReservationTasklet.class);

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        System.out.println("RESERVATION");
        return RepeatStatus.FINISHED;
    }
}
