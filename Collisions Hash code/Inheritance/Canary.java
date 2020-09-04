package com.company;

public class Canary extends Bird
{
    // instance variables - replace the example below with your own
    String name; // the name of this Canary

    /**
     * Constructor for objects of class Canary
     */
    public Canary(String name)
    {
        super(name); // call the constructor of the superclass Bird
        this.name = name;
        colour = "yellow"; // this overrides the value inherited from Bird

    }

    /**
     * Sing method overrides the sing method
     * inherited from superclass Bird
     */
    @Override // good programming practice to use @Override to denote overridden methods
    public void sing(){
        System.out.println("tweet tweet tweet");
    }

    /**
     * toString method returns a String representation of the bird
     * What superclass has Canary inherited this method from?
     */

    @Override
    public String toString(){
        String strng ="";
        strng+= "Canary {  ";
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
        strng+="  } ";

        strng+= "\n";
        // TOD0 Your job is to include the fields and attributes inherited
        //from Bird and Animal in the String representation
        return strng;
    }


    /**
     * equals method defines how equality is defined between
     * the instances of the Canary class
     * param Object
     * return true or false depending on whether the input object is
     * equal to this Canary object
     */

    @Override
    public boolean equals(java.lang.Object object){//standard signature for equals method
        if (object== null){//null pointer exception ; checks for null value
            return false;
        }
        if (object instanceof Animal ){// object is pointing to Animal object
            Animal bird = (Animal)object;// object pointing to Animal object is now the bird object
            if(this.name == bird.getName() && this.colour== bird.getColour() )//if the name and the colour of the Animal object are equal to name and colour of the canary object then a true value is returned
            {
                return true;//when values match, true value is returned

            }
        }
        return false;//when values do not match, false value is returned
    }
}
