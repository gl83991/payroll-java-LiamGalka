package org.example;

public class TestInsurance {
    public static void main(String[] args) {
        System.out.println("2 dependents: " + Payroll.calculateInsurance(2));
        System.out.println("4 dependents: " + Payroll.calculateInsurance(4));
        System.out.println("0 dependents: " + Payroll.calculateInsurance(0));
    }
}
