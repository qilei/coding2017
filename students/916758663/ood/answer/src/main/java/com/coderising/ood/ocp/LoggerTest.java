package com.coderising.ood.ocp;

import java.util.logging.*;

/**
 * Created by qilei on 17/6/26.
 */
public class LoggerTest {

  public static void main(String[] args) {
    LogFormatter formatter = new SimpleLogFormatter();
    LogHandler handler = new ConsoleLogHandler();
    Logger logger = new Logger(formatter, handler);
    logger.log("this is log");
  }
}
