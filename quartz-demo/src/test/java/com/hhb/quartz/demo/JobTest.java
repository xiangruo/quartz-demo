package com.hhb.quartz.demo;

import java.util.Date;

import org.junit.Test;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

public class JobTest extends SpringTestCase {

	@Autowired
	SchedulerFactoryBean schedulerFactoryBean;

	@Test
	public void test1() throws SchedulerException, InterruptedException {

		Scheduler scheduler = schedulerFactoryBean.getScheduler();

		JobDetail jobDetail = JobBuilder.newJob(MyJob.class).build();

		Date startDate = new Date(System.currentTimeMillis() + 10000);
		System.out.println(startDate);
		Trigger trigger = TriggerBuilder.newTrigger().forJob(jobDetail.getKey().getName()).startAt(startDate)
				.withSchedule(SimpleScheduleBuilder.simpleSchedule()).build();
		Date value = scheduler.scheduleJob(jobDetail, trigger);

		System.out.println("date:" + value);

		for (;;) {
			Thread.sleep(1000);

		}
	}

}
