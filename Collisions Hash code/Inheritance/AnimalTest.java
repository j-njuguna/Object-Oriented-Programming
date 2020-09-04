package com.company;

public class AnimalTest {

    public static void main(String[] args) {
	// write your code here
        AnimalTest test = new AnimalTest();
        test.animal1(); //calls method with test scenario 1
        test.animal2(); //calls method with test scenario 2
    }
    //method with test scenario 1
    public void animal1(){
        System.out.println("Test Scenario 1"); //display title for first scenario
        //create new animal object
        Animal[] animals1 = new Animal[4]; ; // This declares and allocates memory for an array of Animal references with 4 spaces
        animals1[0] = new Canary("Bluey");  //Assigning a reference to a Canary object to the first position in the array. First position in an array is always at index 0.
        animals1[1] = new Ostrich("Holly"); //Assigning a reference to an Ostrich object to the second position in the array. Second position in an array is always at index 1.
        animals1[2] = new Shark("Doey"); //Assigning a reference to a Shark object to the third position in the array. Third position in an array is always at index 2.
        animals1[3] = new Trout("Lough"); //Assigning a reference to a CTrout object to the fourth position in the array. Fourth position in an array is always at index 3.

        for (int i=0; i<animals1.length;i++) //a loop to iterate over the array to print out contents of each element in the array
        {
            System.out.println(animals1[i]);
            animals1[i].move(5);//Where i is the value of the loop variable
            System.out.println("\n");
        }



    }

    //method with test scenario 2
    public void animal2(){
        System.out.println("\n\n\nTest Scenario 2\n"); //display title for second scenario
        //create new animal object
        Animal[] animals2 = new Animal[6]; ; // This declares and allocates memory for an array of Animal references with 4 spaces
        animals2[0] = new Canary("Bluey");  //Assigning a reference to a Canary object to the first position in the array. First position in an array is always at index 0.
        animals2[1] = new Ostrich("Holly"); //Assigning a reference to an Ostrich object to the second position in the array. Second position in an array is always at index 1.
        animals2[2] = new Shark("Doey"); //Assigning a reference to a Shark object to the third position in the array. Third position in an array is always at index 2.
        animals2[3] = new Trout("Lough"); //Assigning a reference to a CTrout object to the fourth position in the array. Fourth position in an array is always at index 3.
        animals2[4] = new Canary ("Bluey");//testing to check it equals method works by adding another canary object
        animals2[5] = new Ostrich("Louin"); //add another Ostrich obejct with name that does not atch "holly" to test equals method

        for (int i=0; i<animals2.length;i++) //a loop to iterate over the array to print out contents of each element in the array
        {
            for(int j = 0; j<animals2.length; j++) {
                System.out.println(animals2[i]);  //Where i is the value of the loop variable
                animals2[i].move(5);//Where i is the value of the loop variable
                System.out.println("\n");

                boolean res = animals2[i].equals(animals2[j]); //res is either true or false
                System.out.println("Object  " + animals2[i].getName() + " compare with Object "  +animals2[j].getName() + ": "+ res); //print out Object name and compare it with added extra objects
                System.out.println("\n");
            }
        }




    }
}
