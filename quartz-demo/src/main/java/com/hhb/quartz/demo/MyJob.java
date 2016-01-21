package com.hhb.quartz.demo;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
@DisallowConcurrentExecution
public class MyJob implements Job {
	private Logger LOG = LoggerFactory.getLogger(MyJob.class);

	public void execute(JobExecutionContext context) {
		System.out.println("job.......start..............");

	}
}
