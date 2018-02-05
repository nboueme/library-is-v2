package com.nb.library.batch.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;

import javax.annotation.Resource;

public class BatchLauncher {

    @Resource
    private Job scheduledJob;

    @Resource
    private JobLauncher jobLauncher;

    public void run() {
        JobParameters parameters = new JobParametersBuilder()
                .addLong("currentTime", System.currentTimeMillis())
                .toJobParameters();

        try {
            jobLauncher.run(scheduledJob, parameters);
        } catch (JobExecutionAlreadyRunningException e) {
        } catch (JobRestartException e) {
        } catch (JobInstanceAlreadyCompleteException e) {
        } catch (JobParametersInvalidException e) {
        }
    }
}
