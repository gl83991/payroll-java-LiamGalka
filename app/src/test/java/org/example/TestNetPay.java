package org.example;

public class TestNetPay {
    public static void main(String[] args) {
        double gross1 = Payroll.calculateGrossPay(40);
        double gross2 = Payroll.calculateGrossPay(45);
        System.out.println("40 hours, 2 dependents -> " + Payroll.calculateNetPay(gross1, 2));
        System.out.println("45 hours, 3 dependents -> " + Payroll.calculateNetPay(gross2, 3));
    }
}
