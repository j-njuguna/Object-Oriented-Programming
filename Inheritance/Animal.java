package com.company;


public class Animal
{
    // instance variables - replace the example below with your own
    boolean hasSkin;
    boolean breathes;
    boolean eats;
    String colour;
    String name;
    /**
     * Constructor for objects of class Animal
     */
    public Animal()
    {
        breathes = true; //all the subclasses of Animal inherit this property and value
        hasSkin = true; // all the subclasses of Animal inherit this property and value
        eats = true; // all the subclasses of Animal inherit this property and value
        colour = "grey"; //all the subclasses of Animal inherit this property and value
    }
    /**
     * move method
     * param int distance - the distance the Animal should move
     * All subclasses inherit this method
     */
    public void move(int distance){
        System.out.println("I move" + distance + "metres \n");
    }

    /**
     * getter method for colour field
     * All subclasses inherit this method
     */
    public String getColour(){
        return colour;
    }
    public String getName(){return name;}

    /**
     * 'getter' method for haSkin field
     * All subclasses inherit this method
     */

    public boolean hasSkin(){
        return hasSkin;
    }
}
