package com.oxygen.log;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试类
 *
 * @author oxygen
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@ActiveProfiles
public class LogbackSpringTest {
    private final static Logger logger = LoggerFactory.getLogger(LogbackSpringTest.class);

    @Test
    public void test() {
        for (int i = 0; i < 10000; i++) {
            logger.trace("你干嘛！！！！！");
            logger.debug("你干嘛！！！！！");
            logger.info("你干嘛！！！！！");
            logger.warn("你干嘛！！！！！");
            logger.error("你干嘛！！！！！");
        }


    }
}
