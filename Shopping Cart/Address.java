package com.company;

//create an address class
public class Address {//create address class with four properties: street, city. zipCode and country

    //declare all variables in the address class
    private String street;
    private String city;
    private String zipCode;
    private String country;


    //Create a class constructor for Address class
    public Address(String street, String city, String zipCode, String country)
    {
        //reference the object classes constructors
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }


    public String getStreet() //getter method for street
    {
        return street; //returns string in street
    }

    public String getCity() //getter method for city
    {
        return city; //returns string in city
    }

    public String getZipCode()//getter method for zip code
    {
        return zipCode; //returns string in zipCode
    }

    public String getCountry() //getter method for country
    {
        return country; //returns string in country
    }



    @Override
    public String toString() // prints out the string contents
    {
        String out = " " + street + ", " + city + ", " + zipCode + ", " +country;

        return out;
    }





}
