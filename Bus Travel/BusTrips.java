package com.company;

public class BusTrips {
    //declare all fields inherited by all vendor classes
    int tripId;
    String startingLocation;
    String destination;
    String departureDate;
    String departureTime;
    String arrivalDate;
    String arrivalTime;
    int seats;
    double fare;

    //create a BusTrips object that takes in all the fields as parameters
    public BusTrips(int tripId, String startingLocation, String destination, String departureDate, String departureTime, String arrivalDate, String arrivalTime, int seats,double fare)
    {

        // assigns the value of the parameters to the field of the same name
        this.tripId = tripId;
        this.startingLocation = startingLocation;
        this.destination = destination;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.seats = seats;
        this.fare = fare ;


    }

    //getter method for trips to be inherited by all three vendor classes
    public int getTripId()
    {
        return tripId;
    }


}
