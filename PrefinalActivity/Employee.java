/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class Employee {
    
   
    private String employeeId;
    private String name;
    private String department;
    private int daysWorked;
    private double dailyRate;

    // Constructor
    public Employee(String employeeId, String name, String department,
                    int daysWorked, double dailyRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.daysWorked = daysWorked;
        this.dailyRate = dailyRate;
    }

    // Calculate regular pay
    public double calculateRegularPay() {
        int regularDays = Math.min(daysWorked, 22);
        return regularDays * dailyRate;
    }

    // Calculate overtime pay
    public double calculateOvertimePay() {
        if (daysWorked > 22) {
            int overtimeDays = daysWorked - 22;
            return overtimeDays * dailyRate * 1.25;
        }
        return 0;
    }

    // Calculate gross pay
    public double calculateGrossPay() {
        return calculateRegularPay() + calculateOvertimePay();
    }

    // Calculate deduction
    public double calculateDeduction() {
        if (calculateGrossPay() <= 15000)
            return calculateGrossPay() * 0.05;
        else
            return calculateGrossPay() * 0.08;
    }

    // Calculate net pay
    public double calculateNetPay() {
        return calculateGrossPay() - calculateDeduction();
    }

    // Attendance classification
    public String getAttendanceClassification() {
        if (daysWorked < 15)
            return "Poor Attendance";
        else if (daysWorked <= 21)
            return "Incomplete Attendance";
        else if (daysWorked == 22)
            return "Complete Attendance";
        else
            return "Overtime Worker";
    }

    // Display payroll
    public void displayPayroll() {
        System.out.println("===== EMPLOYEE PAYROLL =====");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Days Worked: " + daysWorked);
        System.out.printf("Daily Rate: ₱%.2f%n", dailyRate);
        System.out.printf("Regular Pay: ₱%.2f%n", calculateRegularPay());
        System.out.printf("Overtime Pay: ₱%.2f%n", calculateOvertimePay());
        System.out.printf("Gross Pay: ₱%.2f%n", calculateGrossPay());
        System.out.printf("Deduction: ₱%.2f%n", calculateDeduction());
        System.out.printf("Net Pay: ₱%.2f%n", calculateNetPay());
        System.out.println("Classification: " + getAttendanceClassification());
        System.out.println();
    }
}


