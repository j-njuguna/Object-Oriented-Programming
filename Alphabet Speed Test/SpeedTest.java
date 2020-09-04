package com.company;

import java.util.Scanner;
public class SpeedTest {

    public static void main(String[] args) {

        System.out.println("Type the alphabet in order(hit enter between letters)");
        String s = "abcdefghijklmnopqrstuvwxyz";

        //input stream to get input from the keyboard
        Scanner in = new Scanner(System.in);

        String letter = " ";
        String order = " ";
        System.out.println("Forwards or Backwards(f/b)?");

        //checks if there is a next line
        if (in.hasNextLine())
        {
            order = in.nextLine();
            //check if letter entered matches f
            if (order.equals("f"))
            {
                System.out.println("Type alphabet forwards");

                //time user starts typing
               long startTime = System.nanoTime();

               //initialise i
                int i =0;

                do {
                    //prints out the character to be entered
                        System.out.println("Enter letter " + s.charAt(i));
                        //returns the current line
                        letter = in.nextLine();
                    //matches the letter input to the letter in the position i in the s string
                        if (letter.equals(""+s.charAt(i)))
                        {
                            i++;
                        }
                    }
                while (i< s.length());

                //time user stops typing
                long endTime = System.nanoTime();

                //display time in seconds
                //subtracts time user stops typing from start time
                System.out.println("Time elapsed is " + ((endTime- startTime)/1000000000) +"seconds");

            }

            //check if letter entered matches b
            else if (order.equals("b"))
            {
                System.out.println("Type alphabet backwards");

                long startTime = System.nanoTime();

                //reverse the do while loo p
                //start from end of s string
                int i = s.length()-1;

                //do while loop
                do {
                    //prints out the character to be entered
                    System.out.println("Enter letter " + s.charAt(i));
                    //returns the current line
                    letter = in.nextLine();
                    //matches the letter input to the letter in the position i in the s string
                    if (letter.equals(""+s.charAt(i)))
                    {
                        //step one char back
                        i--;
                    }
                }
                //stops when i is less than 0
                while (i >=0);

                //time user stops typing
                long endTime = System.nanoTime();

                //display time in seconds
                //subtracts time user stops typing from start time
                System.out.println("Time elapsed is " + ((endTime- startTime)/1000000000) +"seconds");

                }

            else
            {
                System.out.println("Invalid enter 'f' or 'b' to start");
            }

        }

    }
}
