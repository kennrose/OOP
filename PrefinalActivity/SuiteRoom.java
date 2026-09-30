/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class SuiteRoom extends Room {

    public SuiteRoom(int roomNumber, String guestName, int numberOfnights) {
        
        super(roomNumber, "Suite", guestName, numberOfnights);
    }

    @Override
    public double calculateBookingCost() {
        int numberOfNights = 0;
        return (4000 * numberOfNights) + 1000;
    }
}

