# Logging Framework(Log4j 2)

## Introduction
Log4j is a Java-based logging utility that allows developers to log messages from their applications.​

It is an open-source framework that provides highly configurable logging through a wide range of appenders, filters, and layouts.​

Log4j is capable of logging at multiple levels of granularity, including trace, debug, info, warn, error, and fatal.​

It supports different logging destinations, such as console, file, database, email, and more.​

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

You will need to add the following dependency.

```
<!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.20.0</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api -->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-api</artifactId>
            <version>2.20.0</version>
        </dependency>
```

##### Sample Code
```
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
```

##### Sample output
```
# Started.................
# 17:14:43:779 TRACE This is trace Level
# 17:14:43:781 DEBUG This is debug level
# 17:14:43:781 INFO  This is info level

```
