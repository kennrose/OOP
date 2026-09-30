/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class DeluxeRoom extends Room {
    
    

    public DeluxeRoom(int roomNumber, String guestName, int nights) {
        super(roomNumber, "Deluxe", guestName, nights);
    }

    @Override
    public double calculateBookingCost() {
        return (2500 + 300) * numberOfNights;
    }
}

