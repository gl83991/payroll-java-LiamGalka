package org.example;

import org.junit.jupiter.api.Test;

class TestStateTax {
  @Test
  public static void main(String[] args) {
    double gross = Payroll.calculateGrossPay(42);
    System.out.println("Gross: " + gross + " --> State Tax: " + Payroll.calculateStateIncomeTax(gross));
  }
}
