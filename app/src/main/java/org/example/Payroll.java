package org.example;

import java.util.Scanner;

public class Payroll {
  public static final double Rate = 16.78;
  public static final int RegHours = 40;
  public static final double OTRate = Rate * 1.5;
  public static final double SocialSecurityRate = 0.06;
  public static final double FederalIncomeTaxRate = 0.14;
  public static final double StateIncomeTaxRate = 0.05;
  public static final double UnionDues = 10.00;

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.println("Welcome to the Payroll Program!");
  System.out.println();
  
  System.out.print("Enter Number of Hours Worked This Week: ");
  double hoursWorked = scanner.nextDouble();
  
  System.out.print("Enter Number of Dependents: ");
  int dependents = scanner.nextInt();
  System.out.println();

  printPayStub(hoursWorked, dependents);

  System.out.println("Thank you for using the Payroll Program!");
  scanner.close();
  }

  public static double calculateGrossPay(double hoursWorked) {
    if (hoursWorked <= RegHours) {
      return hoursWorked * Rate;
    } else {
      double overtimeHours = hoursWorked - RegHours;
      return (RegHours * Rate) + (overtimeHours * OTRate);
    }
  }

  public static double caculateSocialSecurity(double grossPay) {
    return grossPay * SocialSecurityRate;
  }
  public static double calculateFederalIncomeTax(double grossPay) {
    return grossPay * FederalIncomeTaxRate;
  }
  public static double calculateStateIncomeTax(double grossPay) {
    return grossPay * StateIncomeTaxRate;
  }
  public static double calculateInsurance(int dependents) {
    return (dependents >= 3) ? 35.00 : 15.00;
  }
  public static double calculateNetPay(double grossPay, int dependents) {
    double socialSerurity = caculateSocialSecurity(grossPay);
    double federalTax = calculateFederalIncomeTax(grossPay);
    double stateTax = calculateStateIncomeTax(grossPay);
    double insurance = calculateInsurance(dependents);
    return grossPay - (socialSerurity + federalTax + stateTax + insurance + UnionDues);
  }

  public static void printPayStub(double hoursWorked, int dependents) {
    double grossPay = calculateGrossPay(hoursWorked);
    double socialSecurity = caculateSocialSecurity(grossPay);
    double federalTax = calculateFederalIncomeTax(grossPay);
    double stateTax = calculateStateIncomeTax(grossPay);
    double insurance = calculateInsurance(dependents);
    double netPay = calculateNetPay(grossPay, dependents);

    System.out.printf("Hours Worked: %.2f\n", hoursWorked);
    System.out.printf("Number of Dependents: %d\n", dependents);
    System.out.printf("Gross Pay: $%.2f\n", grossPay);
    System.out.printf("Social Security Deduction: $%.2f\n", socialSecurity);
    System.out.printf("Federal Income Tax Deduction: $%.2f\n", federalTax);
    System.out.printf("State Income Tax Deduction: $%.2f\n", stateTax);
    System.out.printf("Insurance Deduction: $%.2f\n", insurance);
    System.out.printf("Union Dues Deduction: $%.2f\n", UnionDues);
    System.out.printf("Net Pay: $%.2f\n", netPay);
    System.out.println();
  }
}
