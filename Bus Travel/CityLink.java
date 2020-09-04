package com.company;

import java.util.ArrayList;

public class CityLink extends Bus {

    //create a BusTrips array list
    ArrayList<BusTrips> busTrips;
    //initialise the total fare to zero
    double totalFare =0;

    //create booking object
    Booking booking2;


    //create CityLink object
    public CityLink()
    {
        super();
        seats = 50;//total no of seats on the bus
        company = "City Link";//assign the name of the vendor company
        busTrips = new ArrayList<>();//create a new array list
        BusTrips trip1 = new BusTrips(5005, "Galway", "Dublin", "9/12/2019","10.00 a.m.","9/12/2019", "12.30 p.m.", 50, 500);
        busTrips.add(trip1);//add new trip to the array list
        BusTrips trip2 = new BusTrips(5498, "Sligo", "Dublin","10/12/2019", "5.00p.m.", "11/12/2019", "8.00 p.m.", 50, 500);
        busTrips.add(trip2);//add second bus trip to array list
    }

    @Override//override method from Bus
    public void getAllTrips()
    {

        //goes through array list
        for(BusTrips trip : busTrips)
        {
            //prints out all trips in the array list
            System.out.println("Trip ID: "+ trip.tripId+ "\nStarting location: "+ trip.startingLocation+ "\nDestination: " +trip.destination + "\nDeparture Date : " + trip.departureDate + "\nDeparture Time: " + trip.departureTime + "\nArrivalDate: "+ trip.arrivalDate + "\nArrivalTime: "+ trip.arrivalTime + "\nFare: "+ trip.fare + "\nSeats :"+ trip.seats+"\n\n");
        }
    }

    @Override//override method from Bus
    public void booking(Booking booking2)
    {
        BusTrips findTheTrip = getTripId(booking2.getTripId());

        //if there are available seats it prints out a successful booking
        if(booking2.noBookings <= seats){
            System.out.println("Booking successful");

        }else {
            System.out.println("Unable to book");
        }

        //find number of seats left after seats have been booked
        seatsLeft= seats-booking2.noBookings;

    }


    //getter method to get number of seats left
    public int getSeatsLeft()
    {
        return seatsLeft;
    }

    //getter method to find the total fare
    public double totalFare()
    {
        for (BusTrips trip: busTrips){
            //calculate total fare
            totalFare = (trip.fare* booking2.getNoBookings());//need to change
        }
        return totalFare;
    }

    //getter method for total fare
    public double getTotalFare()
    {
        return totalFare;
    }


    public BusTrips getTripId(int tripId)
    {
        //when trip id is '0000' and all other trip fields are null
        BusTrips nullTrip = new BusTrips(0000, "null", "null","null", "null", "null", "null", 00, 0);

        //goes through bus trips array list
        for (BusTrips trip :busTrips){
            if(trip.getTripId()== nullTrip.tripId){
                nullTrip = trip;
            }
        }

        return nullTrip;
    }



}
