package com.company;


public class Palindrome {

    //global variables for counting number of primitive operations
    /**For first method
     * **/
   static int isPalindromecount =0;

    /**For second method
     * **/
   static int isPalindromeCharscount=0;

    /**For third method
     * **/
   static int isPalindromeRecursivecount =0;

    /**For fourth method
     * **/
   static int arrayPalindromecount =0;



    /**first method to check if string is a palindrome**/

    private static boolean isPalindrome(String input){

        //create reversed variable for storing reversed output
        String reversed = "";
        isPalindromecount++;

        //reverse chars using a for loop
        for (int i = input.length() - 1; i >= 0; i--)
        {
            //store the reversed chars in reversed
            reversed += input.charAt(i);
            isPalindromecount+=2;
        }
        isPalindromecount+=7;


        //compare reversed string to original to check if it's a palindrome
        if (input.equals(reversed))
            //if it is return a true value
            return true;

        else
            isPalindromecount++;
            //if not return false value
            return false;
       // System.out.println(isPalindrome(input));

    }

    /**second method that compares characters on an
     *  element basis using a loop
     */

    private static boolean isPalindromeChars(String input) {

        //create for loop that goes through the input string
        for (int i = 0; i < (input.length()/2); ++i)

        {
            //checks if the first character is equal to the last char..etc
            //if at any point the chars don't match stop and return false
            if (input.charAt(i) != input.charAt(input.length() - i - 1))
            isPalindromeCharscount+=11;
            {
                //if it is return true value
                return false;
            }
        }
        isPalindromeCharscount++;
        //if they all match return true value
        return true;
    }


    /**third method
     *
     * **/
    private static boolean arrayPalindrome(String input) {

        //create new array stack
        Stack stack = new ArrayStack(20);
        //create a new array queue
        Queue queue = new ArrayQueue();

        //for loop that goes through each char in input and adds it
        // to both a stack and queue
        for (int i = 0; i < input.length(); i++) {
            arrayPalindromecount+=4;
            //add it to stack
            stack.push(input.charAt(i));
            arrayPalindromecount+=10;
            //add it to queue
            queue.enqueue(input.charAt(i));
            arrayPalindromecount+=7;
        }

        //after all chars have been put onto both stack and queue
        //start to dequeue chars from queue and compare them to chars from stack
        while (!queue.isEmpty()) {
            arrayPalindromecount+=2;
            //compare if the popped from stack is the same as the dequeued from queue
            if (queue.dequeue().equals(stack.pop())) {
                arrayPalindromecount+=20;
                //keep going until the whole input has been read
                continue;
            } else
                {
                return false;
            }
        }
        arrayPalindromecount++;
        //if the chars popped and dequeued are the same
        return true;
    }

    /**Fourth method**/
   //reverse method uses recursion to reverse the characters in input
   // and returns the answer as the reversed input
    private static String reverse(String input){
        //checks if there is input
        if(input == null || input.isEmpty()){ //3
            return input;
        }

        //returns reversed input
        return input.charAt(input.length()- 1) + reverse(input.substring(0, input.length() - 1));
    }

    private static boolean isPalindromeRecursive(String input){

        //set the reverse variable to the ouput from the reverse method
        String reverse = reverse(input);
        //counted the reverse method's primitve operations here
        isPalindromeRecursivecount+=12;
        //checks if input matches reversed output
        // from reverse method
        if(input.equals(reverse)){
            isPalindromeRecursivecount++;
            //if it does return a value of true
            return true;
        }
        //if not returns a false value
        return false;
    }

    /**utility method that converts a decimal number
     * into its equivalent binary rep
     * then return it **/

    private static String decToBinary(String number) {

        //convert the string input into integer
        int input = Integer.parseInt(number);

        //if input is a 0 return a 0
        if (input==0) {
            return "0";
        }

        //create a string binary variable
        String binary = "";
        //create a while loop that runs as long the input is greater tahn 0
        while (input > 0)
        {
            //set the value of remainder as the input original string mod the base which is 2
            int remainder = input % 2;
            //binary value is calculated by adding the value of the remainder
            binary = remainder + binary;
            //input value is the input value divided by the base which is 2
            input = input / 2;

        }
        //return binary value as a string
        return binary;
    }


    /**Main method**/
    public static void main(String[] args)
        {
            //declare two start and end time variables
            long start;
            long end;

            /**First method
             * loop to test the method on the numbers (both decimal and binary)
             * from 0 to 1000000.
             * **/

            //create a variable that counts the number of palindromes
            int count= 0;
            //initialise start to system.currentMillis for milliseconds
            start =  System.currentTimeMillis();

            //create for loop that goes through the number range from 0-1000000
            for (int i = 0 ;i<1000000;i++){

                //initialise decimal value to the char in ith position
                String dec = ""+i;
                //initialise binary value to the result of the decToBinary method in ith position
                String bin = decToBinary(""+i);

                //compare if the result of the method taking in a decimal value
                // is the same as the result of the method taking in binary value
                if(isPalindrome(dec) && isPalindrome(bin)){

                    //if they are the same, count that a s a palindrome
                    count++;
                }

                //range for every 50000 out of the 1000000
                if (i%50000==0){ }

            }
            //end time in milliseconds
            end =  System.currentTimeMillis();

            System.out.println("\n\nFIRST METHOD: ");
            System.out.println("\nTime taken for first method : " + (end-start) + " milliseconds" + "\nFound " + count+ " palindromes in both dec and binary form");
            System.out.println("\nNumber of primitive operations is " + isPalindromecount);


           /** Second method
            * loop to test the method on the numbers (both decimal and binary)
            * from 0 to 1000000.**/
            //create a variable that counts the number of palindromes
            int counter = 0;

            //initialise start to system.currentMillis for milliseconds
            start =  System.currentTimeMillis();

            //create for loop that goes through the number range from 0-1000000
            for (int i = 0 ;i<1000000;i++){

                //initialise decimal value to the char in ith position
                String dec = ""+i;
                //initialise binary value to the result of the decToBinary method in ith position
                String bin = decToBinary(""+i);

                //compare if the result of the method taking in a decimal value
                // is the same as the result of the method taking in binary value
                if(isPalindromeChars(dec) && isPalindromeChars(bin)){

                    //if they are the same, count that a s a palindrome
                    counter++;

                }


                //range for every 50000 out of the 1000000
                if (i%50000==0){
                    //System.out.println(isPalindromeCharscount);
                }

            }

            //end time in milliseconds
            end =  System.currentTimeMillis();

            System.out.println("\n\nSECOND METHOD: ");
            System.out.println("\nTime taken for second method : " + (end-start) + " milliseconds" + "\nFound " + counter + "palindromes in both dec and binary form");
            System.out.println("\nNumber of primitive operations is " + isPalindromeCharscount);


            /**Third method
             * loop to test the method on the numbers (both decimal and binary)
             * from 0 to 1000000
             * **/

            //create a variable that counts the number of palindromes
            int crounterr= 0;

            //initialise start to system.currentMillis for milliseconds
            start =  System.currentTimeMillis();

            //create for loop that goes through the number range from 0-1000000
            for (int i = 0 ;i<1000000;i++){

                //initialise decimal value to the char in ith position
                String dec = ""+i;
                //initialise binary value to the result of the decToBinary method in ith position
                String bin = decToBinary(""+i);

                //compare if the result of the method taking in a decimal value
                // is the same as the result of the method taking in binary value
                if(arrayPalindrome(dec) && arrayPalindrome(bin)){

                    //if they are the same, count that a s a palindrome
                    crounterr++;

                }

                //range for every 50000 out of the 1000000
                if (i%50000==0){
                    //System.out.println(arrayPalindromecount);
                }

            }
            //end time in milliseconds
            end =  System.currentTimeMillis();

            System.out.println("\n\nTHIRD METHOD: ");
            System.out.println("\nTime taken for third method : " + (end-start) + " milliseconds" + "\nFound " + crounterr+ " palindromes in both dec and binary form");
            System.out.println("\nNumber of primitive operations is " + arrayPalindromecount);


            /**Fourthmethod
             * loop to test the method on the numbers (both decimal and binary)
             *from 0 to 1000000
             * **/

            //create a variable that counts the number of palindromes
            int counterr= 0;

            //initialise start to system.currentMillis for milliseconds
            start =  System.currentTimeMillis();

            //create for loop that goes through the number range from 0-1000000
            for (int i = 0 ;i<1000000;i++){

                //initialise decimal value to the char in ith position
                String dec = ""+i;
                //initialise binary value to the result of the decToBinary method in ith position
                String bin = decToBinary(""+i);

                //compare if the result of the method taking in a decimal value
                // is the same as the result of the method taking in binary value
                if(isPalindromeRecursive(dec) && isPalindromeRecursive(bin)){

                    //if they are the same, count that a s a palindrome
                    counterr++;

                }

                if (i%50000==0){
                    //System.out.println(isPalindromeRecursivecount++);
                }

            }
            //end time in milliseconds
            end =  System.currentTimeMillis();

            System.out.println("\n\nFOURTH METHOD: ");
            System.out.println("\nTime taken for fourth method : " + (end-start) + " milliseconds" + "\nFound " + counterr+ " palindromes in both dec and binary form");
            System.out.println("\nNumber of primitive operations is " + isPalindromeRecursivecount);


        }
        }


