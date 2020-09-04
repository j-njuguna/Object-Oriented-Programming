package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int res = 0;
        int newRes=0;
        int testRes=0;



        if (args != null && args.length > 0) { // Check for <input> value
            res = hashF1(args[0]); // call hash function with <input>
            if (res < 0) { // Error
                System.out.println("Error: <input> must be 1 to 64 characters long.");
            }
            else {
                System.out.println("input = " + args[0] + " : Hash = " + res);
                System.out.println("Start searching for collisions");

                // Your code starts here!


                int collisions=0;
                newRes= hashF1("Bam0");
                testRes= hashF1("n");// test to see if the has values actually correspond
                System.out.println(newRes + " == " + testRes); // comparing the two has values

                //create an array that loops it 10000 times and outputs total number of collisions
                for (int i=0; i<10000;i++) {

                    String r_String = getRandomString(); // plugging in the randomly generated string  into hash function

                    int hashR_String = hashF1(r_String);


                    if (hashR_String == newRes) {
                        collisions++;  //store collisons
                        System.out.println(collisions + " :"+ r_String + " : " + hashR_String);
                        //output the number of collisions + random string + the hash value

                    }

                }
                System.out.println("Found collisions :" + collisions);// output the total number of collisions


            }
            }
        else { // No <input>
            System.out.println("Use: CT255_HashFunction1 <Input>");
        }

                }


    // generate random strings

    //if has value = res then print out

    private static String getRandomString() {  //method for generating random strings

        String r_alpha = ""; //holds the randomly generated string
        int lengthOfString = (int) (1 + Math.floor(Math.random() * 64)); // starts from 1 not 0 ; 1-64


        for (int i = 0; i < lengthOfString; i++) {
            int r = (int) Math.floor(Math.random() * 62); //Total number of small, capital letters ad numbers is 64
            String alpha = ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
            r_alpha += (alpha.substring(r, r + 1)); //adds onto the string
        }
        return r_alpha;
    }




    private static int hashF1(String s){
        int ret = -1, i;
        int[] hashA = new int[]{1, 1, 1, 1};

        String filler, sIn;

        filler = new String("ABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGHABCDEFGH");


        if ((s.length() > 64) || (s.length() < 1)) { // String does not have required length
            ret = -1;
        }
        else {
            sIn = s + filler; // Add characters, now have "<input>HABCDEF..."
            sIn = sIn.substring(0, 64); // // Limit string to first 64 characters
            // System.out.println(sIn); // FYI
            for (i = 0; i < sIn.length(); i++){
                char byPos = sIn.charAt(i); // get i'th character
                //modified for decreasing the number of collisions
                hashA[0] += (byPos * 3000); // Note: A += B means A = A + B
                hashA[1] += (byPos * 3200);
                hashA[2] += (byPos * 1510);
                hashA[3] += (byPos * 7800);
            }

            //modified code for decreasing the number of collisions
            hashA[0] %= 967;  // % is the modulus operation, i.e. division with rest
            hashA[1] %= 967;
            hashA[2] %= 967;
            hashA[3] %= 967;

            ret = hashA[0] + (hashA[1] * 256) + (hashA[2] * 256 * 256) + (hashA[3] * 256 * 256 * 256);
            if (ret < 0) ret *= -1;
        }
        return ret;
    }

}

