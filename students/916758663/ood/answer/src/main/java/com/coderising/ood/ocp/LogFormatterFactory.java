package com.coderising.ood.ocp;

/**
 * Created by qilei on 17/6/29.
 */
public class LogFormatterFactory {

  public static LogFormatter create(LogFormatterEnum logFormatterEnum){
    return logFormatterEnum.getInstance();
  }

}
