package com.coderising.payroll;

/**
 * Created by qilei on 17/7/5.
 */
public class NonAffiliation implements Affiliation {

  @Override
  public double calculateDeductions(Paycheck pc) {
    return 0;
  }
}
