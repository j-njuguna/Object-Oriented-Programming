package com.company;

public class Travel_Ireland {

    public static void main(String[] args) {

        //create a new BusEireann object
        BusEireann busEireann = new BusEireann();
        //prints out the vendor company name
        System.out.println(busEireann.company);
        //displays all the trips in the BusEireann class
        busEireann.getAllTrips();


        //create a new booking object
        Booking booking = new Booking(5005,10);
        //display the booking details
        busEireann.booking(booking);


        System.out.println("Number of passengers:"+ booking.getNoBookings() );
        System.out.println("Trip ID: "+ booking.getTripId());
        System.out.println("Total Fare: "+ busEireann.getTotalFare());
        System.out.println("Seats left: "+ busEireann.getSeatsLeft()+"\n\n\n");

        //create a new GoBus object
        GoBus goBus = new GoBus();
        //prints out the vendor company name
        System.out.println(goBus.company);
        //displays all the trips in the GoBus class
        goBus.getAllTrips();

        //create a new booking object
        Booking booking1 = new Booking(7007,10);
        //display the booking details
        goBus.booking(booking1);

        System.out.println("Number of passengers:"+ booking.getNoBookings() );
        System.out.println("Trip ID: "+ booking.getTripId());
        System.out.println("Total Fare: "+ goBus.getTotalFare());
        System.out.println("Seats left: "+ goBus.getSeatsLeft()+"\n\n\n");


        //create a new CityLink object
        CityLink cityLink = new CityLink();
        //prints out the vendor company name
        System.out.println(cityLink.company);
        //displays all the trips in the CityLink class
        cityLink.getAllTrips();


        //create a new booking object
        Booking booking2 = new Booking(3003, 10);
        //display the booking details
        cityLink.booking(booking2);

        System.out.println("Number of passengers:"+ booking.getNoBookings() );
        System.out.println("Trip ID: "+ booking.getTripId());
        System.out.println("Total Fare: "+ cityLink.getTotalFare());
        System.out.println("Seats left: "+ cityLink.getSeatsLeft()+"\n\n\n");


    }

}
