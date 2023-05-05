package org.example.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Log4jDemoTest {

    @Test
    void main() {
        Log4jDemo.main(new String[]{"args"});
    }

    @Test
    void testLog() {
        Log4jDemo.testLog();
    }
}