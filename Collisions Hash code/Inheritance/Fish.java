package com.company;

public class Fish extends Animal
{
    //variables //features of fish
    boolean hasFins;
    boolean swims;
    boolean hasGills;
    String name;

    /**
    constructor for objects of fish class
     */
    public Fish(String name)
    {
        super(); //calls constructor of its super class
        colour = "black"; //overrides the value of colour inherited from Animal
        hasFins = true; // all subclasses of Fish inherit this property and value
        swims = true; // all subclasses of Fish inherit this property and value
        hasGills = true; // all subclasses of Fish inherit this property and value
        this.name = name;
    }

    /**
     * move method overrides the move method
     * inherited from superclass Animal
     */

    @Override //denote overriden methods
    public void move(int distance) {
        if(swims){
            System.out.println("i can swim " + distance + " metres");
        }
        else
        {
            System.out.println("I am a fish but i cannot swim");
        }

    }

    /**
     * getter method for name
     */
    public String getName(){
        return name;
    }

    /**
     * getter method for hasFins field
     */
    public boolean hasFins() {
        return hasFins;
    }

    /**
     * getter method for hasGills field
     * @return
     */
    public boolean hasGills() {
        return hasGills;
    }

}
