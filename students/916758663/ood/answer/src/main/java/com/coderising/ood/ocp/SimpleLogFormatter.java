package com.coderising.ood.ocp;

/**
 * Created by qilei on 17/6/26.
 */
public class SimpleLogFormatter implements LogFormatter {

  @Override
  public String format(String msg) {
    return msg;
  }
}
