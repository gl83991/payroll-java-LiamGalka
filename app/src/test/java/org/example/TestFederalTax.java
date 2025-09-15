package org.example;

import org.junit.jupiter.api.Test;

class TestFederalTax {
  @Test
  public static void main(String[] args) {
   double gross = Payroll.calculateGrossPay(40);
   System.out.println("Gross: " + gross + " --> Federal Tax: " + Payroll.calculateFederalIncomeTax(gross));
  }
}
