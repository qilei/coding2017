package com.coderising.ood.srp;

/**
 * Created by qilei on 17/6/29.
 */
public class Mail {

  private String toAddr;
  private String subject;
  private String content;

  public String getToAddr() {
    return toAddr;
  }

  public void setToAddr(String toAddr) {
    this.toAddr = toAddr;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
