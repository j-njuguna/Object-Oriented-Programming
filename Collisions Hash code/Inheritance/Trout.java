package com.company;

public class Trout extends Fish {

    //instance variables
    String name;
    boolean hasSpikes;
    boolean isEdible;
    boolean swims;
    /**
     * Constructor for objects of class Trout
     *
     * @param name
     */
    public Trout(String name) {
        super(name);
        this.name = name;
        hasSpikes = true;
        isEdible = true;
        swims = true;
        colour = "brown"; //this overrides value inherited from Fish

    }


    /**
     * getter method for hasSpikes
     */
    public boolean hasSpikes() {
        return hasSpikes;
    }

    /**
     * getter method for isEdible
     */
    public boolean isEdible() {
        return isEdible;
    }

    /**
     * getter method for swims
     */
    public boolean swimsUpriverToLayEggs(){
        return swims;
    }

    /**
     * toString method returns a string rep of the bird
     */
    @Override
    public  String toString(){
        String strng ="";
        strng+= "Trout { ";
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
        strng+= "  ; ";
        strng+="  Has skin: ";
        strng+= hasSkin;
        strng+="  ; ";
        strng+="  Has fins: ";
        strng+= hasFins;
        strng+="  ; ";
        strng+="  Has gills: ";
        strng+= hasGills;
        strng+="  ; ";
        strng+="  Has spikes: ";
        strng+= hasSpikes;
        strng+= "  ; ";
        strng+= "  Is edible: ";
        strng+= isEdible;
        strng+= "  ; ";
        strng+= "  Swims upriver to lay eggs: ";
        strng+= swims;
        strng+=" } ";
        strng+= "\n";

        return strng;
    }



    /**
     * equals method defines how equality is defined between
     * the instances of the Trout class
     * param Object
     * return true or false depending on whether the input object is
     * equal to this Trout object
     */

    @Override
    public boolean equals(java.lang.Object object) //standard signature for equals method
    {
        if (object== null) //null pointer exception ; checks for null value
        {
        return false;
        }
        if (object instanceof Animal ) // object is pointing to Animal object
        {
            Animal fish = (Animal)object; // object pointing to Animal object is now the fish object
            if(this.name == fish.getName() && this.colour== fish.getColour() ) //if the name and the colour of the Animal object are equal to name and colour of the trout object then a true value is returned
            {
                return true; //when values match, true value is returned

            }
        }
        return false; //default equals
    }
}

