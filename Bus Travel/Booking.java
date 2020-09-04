package com.company;

import java.util.ArrayList;

public class Booking {

    //declare all fields
    int tripId;
    int noBookings;

    public Booking(int tripId, int noBookings)
    {
        // assigns the value of the parameters to the field of the same name
        this.tripId = tripId;
        this.noBookings = noBookings;

    }



    //getter method for trip Id
    public int getTripId()
    {
        return tripId;
    }

    //getter method for number of passengers(bookings)
    public int getNoBookings()
    {
        return noBookings;
    }

}
