package com.hhb.quartz.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Spring加载完后设置定时任务需要的service
 *
 */
public class ScheduleContext implements ApplicationListener<ContextRefreshedEvent> {
	private Logger LOG = LoggerFactory.getLogger(ScheduleContext.class);

	public void onApplicationEvent(ContextRefreshedEvent event) {
		// 保存一个触发任务时用的无需持久化service
		System.out.println("start.................................");
	}

}
