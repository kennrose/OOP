/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class Test_HotelBooking {
    
    
    public static void main(String[] args) {

        // Polymorphism
        Room[] rooms = {
            new StandardRoom(101, "Pedro Cruz", 3),
            new DeluxeRoom(202, "Ana Reyes", 2),
            new SuiteRoom(301, "Carlo Santos", 2)
        };

        System.out.println("===== HOTEL BOOKING =====");
        System.out.println();

        for (Room room : rooms) {
            room.displayBooking();
        }
    }
}
    

