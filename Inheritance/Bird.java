package com.company;


public class Bird extends Animal
{
    //instance variables (fields)
    boolean hasFeathers;
    boolean hasWings;
    boolean flies;
    String name;

    /**
     * Constructor for objects of class Bird
     */
    public Bird(String name)
    {
        super(); //calls the constructor of its superclass  - Animal
        colour = "black"; //overrides the value of colour inherited from Animal
        hasFeathers = true; //all the subclasses of Bird inherit this property and value
        hasWings = true; //all the subclasses of Bird inherit this property and value
        flies = true; //all the subclasses of Bird inherit this property and value
        this.name = name;


    }

    /**
     * move method overrides the move method
     * inherited from superclass Animal
     */
    @Override // good programming practice to use @Override to denote overridden methods
    public void move(int distance){
        if(flies){
            System.out.println("I fly "  + distance+ " metres");
        }else {
            System.out.println("I am a bird but cannot fly. I walk  "+ distance + " metres");
        }
    }

    /**
     * sing method that all birds have
     */
    public void sing(){
        System.out.println("tra la la");
    }

    /**
     * 'getter' method for the hasWings field
     */
    public String getName(){
        return name;
    }
    public boolean hasWings(){
        return hasWings;
    }

    /**
     * 'getter' method for the hasFeathers field
     */
    public boolean hasFeathers(){
        return hasFeathers;
    }
}
