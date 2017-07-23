package com.coderising.payroll;

/**
 * Created by qilei on 17/7/5.
 */
public class BankMethod implements PaymentMethod {

  private String bank;
  private String account;

  public BankMethod(String bank, String account) {
    this.bank = bank;
    this.account = account;
  }

  @Override
  public void pay(Paycheck pc) {
    System.out.println("银行：" + bank + "，账户：" + account + "，转账金额：" + pc.getNetPay());
  }
}
