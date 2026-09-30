/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class StandardRoom extends Room {
    
// Constructor
    public StandardRoom(int roomNumber, String guestName, int numberOfnights) {
        super(roomNumber, "Standard", guestName, numberOfnights);
    }
    
// Method overriding 
    @Override
    public double calculateBookingCost() {
        int numberOfNights = 0;
        return 1500 * numberOfNights;
    }
}

