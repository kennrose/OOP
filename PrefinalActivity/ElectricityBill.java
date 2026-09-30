/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class ElectricityBill {
    
    
    private String accountNumber;
    private String customerName;
    private String customerType;
    private double previousReading;
    private double currentReading;

    // Constructor
    public ElectricityBill(String accountNumber, String customerName,
                           String customerType, double previousReading,
                           double currentReading) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerType = customerType;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    // Calculate consumption
    public double calculateConsumption() {
        return currentReading - previousReading;
    }

    // Get rate
    public double getRate() {
        double consumption = calculateConsumption();

        if (customerType.equalsIgnoreCase("Residential")) {
            if (consumption <= 100)
                return 10;
            else if (consumption <= 200)
                return 12;
            else
                return 15;
        } else {
            if (consumption <= 100)
                return 15;
            else if (consumption <= 200)
                return 18;
            else
                return 22;
        }
    }

    // Calculate bill
    public double calculateBill() {
        return calculateConsumption() * getRate();
    }

    // Get classification
    public String getClassification() {
        double consumption = calculateConsumption();

        if (consumption < 100)
            return "Low Consumption";
        else if (consumption <= 200)
            return "Moderate Consumption";
        else
            return "High Consumption";
    }

    // Display bill
    public void displayBill() {
        System.out.println("===== ELECTRICITY BILL =====");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Type: " + customerType);
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading: " + currentReading);
        System.out.printf("Consumption: %.0f kWh%n", calculateConsumption());
        System.out.printf("Rate: ₱%.2f%n", getRate());
        System.out.printf("Total Bill: ₱%.2f%n", calculateBill());
        System.out.println("Classification: " + getClassification());

        if (calculateConsumption() > 300) {
            System.out.println("WARNING: VERY HIGH ELECTRICITY CONSUMPTION");
        }

        System.out.println();
    }
}


