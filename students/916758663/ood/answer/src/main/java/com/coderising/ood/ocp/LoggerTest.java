package com.coderising.ood.ocp;

/**
 * Created by qilei on 17/6/26.
 */
public class LoggerTest {

  public static void main(String[] args) {
    LogFormatter formatter = LogFormatterFactory.create(LogFormatterEnum.SIMPLE);
    LogHandler handler = new ConsoleLogHandler();
    Logger logger = new Logger(formatter, handler);
    logger.log("this is log");
  }
}
