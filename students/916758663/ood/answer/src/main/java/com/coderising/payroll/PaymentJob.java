package com.coderising.payroll;

import java.util.Date;

/**
 * Created by qilei on 17/7/5.
 */
public class PaymentJob {

  public static void main(String[] args) {
    Employee employee = new Employee("ql", "my address");
    employee.setSchedule(new MonthlySchedule());
    employee.setClassification(new SalariedClassification(10000d));
    employee.setPaymentMethod(new BankMethod("招行", "123456"));
    employee.setAffiliation(new NonAffiliation());
    Date today = new Date();
    if (employee.isPayDay(today)) {
      Paycheck paycheck = new Paycheck(employee.getPayPeriodStartDate(today), today);
      if (!exist(paycheck, "ql")) {
        employee.payDay(paycheck);
      }
    }
  }

  private static boolean exist(Paycheck paycheck, String employeeName) {
    return false;
  }

}
