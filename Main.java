/**
 * Airline Reservation System
Scenario:
Create a system to book airline tickets. Each passenger has a name and seat number (instance variables), and the airline has a limited number of seats (static). If seats are available, booking is confirmed.

Requirements:
Use a static variable availableSeats.
When a booking is done, use local variables to temporarily validate and confirm.
Reject booking if no seats left.

Sample Input:
Airline.setAvailableSeats(2);
Airline.bookTicket("John", "A1");
Airline.bookTicket("Emma", "A2");
Airline.bookTicket("Robert", "A3");

Expected Output:
Ticket booked for John in seat A1
Ticket booked for Emma in seat A2
Booking failed for Robert: No seats available
Examples
Example 1:

Input

Enter number of available seats: 2
Enter number of passengers to book: 3
John
A1
Emma
A2
Robert
A3
Output

Ticket booked for John in seat A1 
Ticket booked for Emma in seat A2 
Booking failed for Robert: No seats available
Example 2:

Input

Enter number of available seats: 1
Enter number of passengers to book: 2
Alice
B1
Bob
B2
Output

Ticket booked for Alice in seat B1 
Booking failed for Bob: No seats available
Explanation

Static variable tracks available seats; local variable checks booking
Constraints
Use static variable, instance variables, and local variable to validate booking

 * 
 */

import java.util.*;

class Airline{
    static int availableSeats;

    // Instance variable (Unique for each vaiable)
    String passengerName;
    String seatNumber;

    // static method to set seats
    static void setAvailableSeats(int seats){
        availableSeats = seats;
    }

    // static booking method
    static void bookTicket(String name, String seat){
        // local variable for validation
        boolean seatAvailable = availableSeats > 0;
        if(seatAvailable){
            Airline passenger = new Airline();
            passenger.passengerName = name;
            passenger.seatNumber = seat;

            availableSeats--;  // Decrease static seat count

            System.out.println("Ticket booked for " + passenger.passengerName + " in seat " + passenger.seatNumber);
        }else{
            System.out.println("Booking failed for "+ name + ": No seats available");
        }
    }
}


public class Main {
    


    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number of available seats: ");
        int seats = sc.nextInt();
        Airline.setAvailableSeats(seats);

        // System.out.println("Enter number of passengers to book: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            String name = sc.nextLine();
            String seat = sc.nextLine();

            Airline.bookTicket(name,seat);
        }
        sc.close();
    }
}