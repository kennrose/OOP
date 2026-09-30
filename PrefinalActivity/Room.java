/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class Room {
    
   
    protected int roomNumber;
    protected String roomType;
    protected String guestName;
    protected int numberOfNights;

    public Room(int roomNumber, String roomType, String guestName, int numberOfNights) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.guestName = guestName;
        this.numberOfNights = numberOfNights;
    }

    public double calculateBookingCost() {
        return 0;
    }

    public void displayBooking() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Guest: " + guestName);
        System.out.println("Nights: " + numberOfNights);
        System.out.printf("Booking Cost: ₱%.2f%n", calculateBookingCost());
        System.out.println();
    }

   
}

// Standard Room
class StandardRoom extends Room {
    public StandardRoom(int roomNumber, String guestName, int nights) {
        super(roomNumber, "Standard", guestName, nights);
    }

    @Override
    public double calculateBookingCost() {
        return 1500 * numberOfNights;
    }
}

// Deluxe Room
class DeluxeRoom extends Room {
    public DeluxeRoom(int roomNumber, String guestName, int nights) {
        super(roomNumber, "Deluxe", guestName, nights);
    }

    @Override
    public double calculateBookingCost() {
        return (2500 + 300) * numberOfNights;
    }
}

// Suite Room
class SuiteRoom extends Room {
    public SuiteRoom(int roomNumber, String guestName, int nights) {
        super(roomNumber, "Suite", guestName, nights);
    }

    @Override
    public double calculateBookingCost() {
        return (4000 * numberOfNights) + 1000;
    }
}



