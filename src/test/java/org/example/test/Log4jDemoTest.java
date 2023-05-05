package org.example.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

class Log4jDemoTest {

    @Test
    void testLog() {
        Logger logger = LogManager.getLogger(Log4jDemoTest.class);
        logger.trace("This is trace Level");
        logger.debug("This is debug level");
        logger.info("This is info level");
        logger.warn("This is warn level");
    }
}