package ca.uhn.fhir.jpa.batch.api;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;

public interface IBatchJobSubmitter {

	JobExecution runJob(Job theJob, JobParameters theJobParameters);
}