package com.coderising.payroll;

import java.util.Date;

/**
 * Created by qilei on 17/7/5.
 */
public class MonthlySchedule implements PaymentSchedule {

  @Override
  public boolean isPayDate(Date date) {
    return DateUtils.isLastDayOfMonty(date);
  }

  @Override
  public Date getPayPeriodStartDate(Date payPeriodEndDate) {
    return DateUtils.getFirstDayOfMonty(payPeriodEndDate);
  }
}
