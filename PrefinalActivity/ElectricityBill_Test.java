/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class ElectricityBill_Test {
    
   
    public static void main(String[] args) {

        ElectricityBill bill1 = new ElectricityBill(
            "EL-1001", "Juan Santos", "Residential", 1250, 1475);

        ElectricityBill bill2 = new ElectricityBill(
            "EL-1002", "Maria Cruz", "Commercial", 2000, 2120);

        ElectricityBill bill3 = new ElectricityBill(
            "EL-1003", "Pedro Reyes", "Residential", 3000, 3350);

        bill1.displayBill();
        bill2.displayBill();
        bill3.displayBill();
    }
}

    

