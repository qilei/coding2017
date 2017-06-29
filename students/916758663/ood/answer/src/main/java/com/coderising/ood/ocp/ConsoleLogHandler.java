package com.coderising.ood.ocp;

/**
 * Created by qilei on 17/6/26.
 */
public class ConsoleLogHandler implements LogHandler {

  @Override
  public void handle(String msg) {
    System.out.println(msg);
  }
}
