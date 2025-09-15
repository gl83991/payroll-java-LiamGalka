package org.example;

import org.junit.jupiter.api.Test;

class TestGrossPay {
  @Test
  public static void main(String[] args) {
   System.out.println("38 hours worked: " + Payroll.calculateGrossPay(38));
   System.out.println("42 hours worked: " + Payroll.calculateGrossPay(42));
  }
}
