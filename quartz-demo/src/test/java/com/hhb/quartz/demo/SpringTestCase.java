package com.hhb.quartz.demo;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
public abstract class SpringTestCase extends AbstractJUnit4SpringContextTests {

}
