/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class Employee_Test {
    
    
    public static void main(String[] args) {

        Employee employee1 = new Employee(
            "EMP-001", "Maria Cruz", "IT", 25, 700);

        Employee employee2 = new Employee(
            "EMP-002", "Juan Santos", "HR", 22, 650);

        Employee employee3 = new Employee(
            "EMP-003", "Pedro Reyes", "Finance", 18, 600);

        employee1.displayPayroll();
        employee2.displayPayroll();
        employee3.displayPayroll();
    }
}

    

