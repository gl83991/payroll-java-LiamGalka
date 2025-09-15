package org.example;

import org.junit.jupiter.api.Test;

class TestSocialSecurity {
  @Test
  public static void main(String[] args) {
    double grossPay1 = Payroll.calculateGrossPay(38);
    double grossPay2 = Payroll.calculateGrossPay(45);
   System.out.println("Gross " + grossPay1 + " --> " + Payroll.caculateSocialSecurity(grossPay1));
   System.out.println("Gross " + grossPay2 + " --> " + Payroll.caculateSocialSecurity(grossPay2));
  }
}
