package com.abner.baseTest;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by abner chow on 2017/10/20.
 */
@ContextConfiguration(locations = "classpath*:application.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public abstract  class SpringTestCase extends AbstractJUnit4SpringContextTests {
    private Logger logger = LoggerFactory.getLogger(getClass());
}