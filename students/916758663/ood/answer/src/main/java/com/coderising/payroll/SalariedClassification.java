package com.coderising.payroll;

/**
 * Created by qilei on 17/7/5.
 */
public class SalariedClassification implements PaymentClassification {

  private double salary;

  public SalariedClassification(double salary) {
    this.salary = salary;
  }

  @Override
  public double calculatePay(Paycheck pc) {
    return salary;
  }
}
