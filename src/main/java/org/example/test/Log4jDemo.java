package org.example.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
    static Logger logger = LogManager.getLogger(Log4jDemo.class);

    public static void main(String[] args) {
        System.out.println("Started.................");
        testLog();
    }

    public static void testLog() {
        logger.trace("This is trace Level");
        logger.debug("This is debug level");
        logger.info("This is info level");
        logger.warn("This is warn level");
        logger.error("This is error level");
        logger.fatal("This is fatal level");
    }
}
