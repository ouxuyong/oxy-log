package com.oxygen.log;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 测试类
 *
 * @author oxygen
 */
public class LogbackTest {
    private final static Logger logger = LoggerFactory.getLogger(LogbackTest.class);
    @Test
    public void test() {
        while (true){
            logger.trace("你干嘛！！！！！");
            logger.debug("你干嘛！！！！！");
            logger.info("你干嘛！！！！！");
            logger.warn("你干嘛！！！！！");
            logger.error("你干嘛！！！！！");
        }

    }
}
