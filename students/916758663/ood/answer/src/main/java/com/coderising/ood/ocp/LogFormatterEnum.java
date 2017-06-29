package com.coderising.ood.ocp;

/**
 * Created by qilei on 17/6/29.
 */
public enum LogFormatterEnum {
  SIMPLE {
    @Override
    public LogFormatter getInstance() {
      return new SimpleLogFormatter();
    }
  };

  public abstract LogFormatter getInstance();
}
