package com.company;

public class Shark extends Fish {

    //instance variables
    String name;
    boolean canBite;
    boolean isDangerous;

    /**
     * Constructor for objects of class Shark
     *
     * @param name
     */
    public Shark(String name) {
        super(name);
        this.name = name;
        canBite = true;
        isDangerous = true;
    }

    /**
     * getter method for canBite
     */
    public boolean canBite(){
        return  canBite;
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    /**
     * toString method returns a String representation of the bird
     * What superclass has Canary inherited this method from?
     */
    @Override
    public String toString(){
        String strng ="";
        strng+= "Shark { ";
        strng+= "  Name: ";
        strng+= name;
        strng+= "  ; ";
        strng+= "  Breathes: ";
        strng+= breathes;
        strng+= "  ; ";
        strng+= "  Eats: ";
        strng+= eats;
        strng+= "  ; ";
        strng+= "  Colour: ";
        strng+= colour;
        strng+="  ; ";
        strng+="  Has skin: ";
        strng+= hasSkin;
        strng+="  ; ";
        strng+="  Has fins: ";
        strng+= hasFins;
        strng+="  ; ";
        strng+="  Has gills: ";
        strng+= hasGills;
        strng+="  ; ";
        strng+="  Can bite: ";
        strng+= canBite;
        strng+="  ;";
        strng+="  Is dangerous: ";
        strng+= isDangerous;
        strng+="  ; ";
        strng+="  Swims: ";
        strng+= swims;
        strng+="  ; ";
        strng+=" } ";
        strng+= "\n";
        // TOD0 Your job is to include the fields and attributes inherited
        //from Bird and Animal in the String representation
        return strng;
    }
    /**
     * equals method defines how equality is defined between
     * the instances of the Shark class
     * param Object
     * return true or false depending on whether the input object is
     * equal to this Shark object
     */

    @Override
    public boolean equals(java.lang.Object object){ //standard signature for equals method
        if (object== null){ //null pointer exception ; checks for null value
            return false;
        }
        if (object instanceof Animal ){ // object is pointing to Animal object
            Animal fish = (Animal)object; // object pointing to Animal object is now the fish object
            if(this.name == fish.getName() && this.colour== fish.getColour() ) //if the name and the colour of the Animal object are equal to name and colour of the shark object then a true value is returned
            {
                return true; //when values match, true value is returned

            }
        }
        return false; //default equals
    }

}

