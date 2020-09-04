package com.company;

public class Ostrich extends Bird
{
    //instance variables
    String name;
    boolean isTall;
    boolean hasThinLongLegs;

    /**
     * Constructor for objects of class Canary
     *
     * @param name
     */
    public Ostrich(String name) {
        super(name); //calls constructor of superclass Bird
        this.name = name;
        isTall = true; //this overrides the value inherited from Bird
        hasThinLongLegs = true;
        flies = false;

    }

    /**
     * getter method for isTall
     */
    public boolean isTall(){
        return isTall;
    }

    /**
     * getter method for cannotFly
     */

    /**
     * getter method for hasThinLongLegs
     */
    public boolean hasThinLongLegs(){
        return hasThinLongLegs;

    }


    /**
     * toString method returns a String representation of the bird
     * What superclass has Canary inherited this method from?
     */
    @Override
    public String toString(){

        String strng ="";
        strng+= "Ostrich { ";
        strng+= "Name: ";
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
        strng+=" Has skin: ";
        strng+= hasSkin;
        strng+="  ; ";
        strng+= "  Has Feathers: ";
        strng+= hasFeathers;
        strng+= "  ; ";
        strng+= "  Has wings: ";
        strng+=hasWings;
        strng+="  ; ";
        strng+="  Flies: ";
        strng+=flies;
        strng+="  ; ";
        strng+= "  Is tall: ";
        strng+= isTall;
        strng+= "  ; ";
        strng+="  Has thin long legs: ";
        strng+= hasThinLongLegs;
        strng+="  ; ";
        strng+=" } ";

        strng+= "\n";

        // TOD0 Your job is to include the fields and attributes inherited
        //from Bird and Animal in the String representation
        return strng;
    }

    /**
     * equals method defines how equality is defined between
     * the instances of the Ostrich class
     * param Object
     * return true or false depending on whether the input object is
     * equal to this Ostrich object
     */

    @Override
    public boolean equals(java.lang.Object object){//standard signature for equals method
        if (object== null){//null pointer exception; checks for null value
            return false;
        }
        if (object instanceof Animal ){// object is pointing to Animal object
            Animal bird = (Animal)object;// object pointing to Animal object is now the bird object
            if(this.name == bird.getName() && this.colour== bird.getColour() ) //if the name and the colour of the Animal object are equal to name and colour of the ostrich object then a true value is returned
            {
                return true;//when values match, true value is returned


            }
        }
        return false; //when values do not match, false value is returned
    }

}

