package com.company;

import java.io.*;
import java.nio.CharBuffer;
import java.util.Scanner;
public class GuessingGame
{
    private static String workingDirectory;
    private static String FilePath;

    private static Scanner in = new Scanner(System.in);


    //create a play method where current nodes are updated based
    // on answers


    public static void run(BinaryNode<String> tree)
    {
        BinaryNodeInterface<String> current = tree.getRootNode();
        //while loop where the question is updated
        while (!current.isLeaf( ))
        {
            //implement check method to make sure only y or n entered
            if (check(current.getData( )))
                current = current.getLeftChild( );
            else
                current = current.getRightChild( );
        }

        System.out.print("My guess is " + current.getData( ) + ". ");
        if (!check("Is that what you were thinking?"))
            update((BinaryNode<String>) current);
        else
            System.out.println("That's what i was thinking!");
    }

    //method for creating new tree with children
    public static BinaryNode<String> createTree( )
    {
        //declare and assign variables for root question and all other questions
        BinaryNode<String> root;
        BinaryNode<String> child;
        BinaryNode<String> child1;
        BinaryNode<String> child2 = null;
        BinaryNode<String> child3 = null;
        BinaryNode<String> child4 = null;
        BinaryNode<String> child5 = null;

        //declare and assign string values to the left and right side questions
        final String rootq = "Are you thinking a mammal?\n";
        final String lq = "Is it able to move on land?\n";
        final String lq_2 = "Is it a solitary animal?\n";
        final String rq_2 = "Does it have tusks?\n";
        final String rq = "Does it have any limbs/tentacles?\n";
        final String lq_4 = "Does it have more than four limbs/tentacles?\n";
        final String rq_4 = "Can it shock?\n";

        //declare and assign the variables string values
        final String animal1 = "Bear";
        final String animal2 = "Sea Lion";
        final String animal3 = "Elepahnt";
        final String animal4 = "Kangaroo";
        final String animal5 = "Spider";
        final String animal6 = "Alligator";
        final String animal7 = "Eel";
        final String animal8 = "Fish";

        // Create the root node for the question are you thinking of an animal

        root = new BinaryNode<>(rootq, null, null);

        //set the first yes branch in the tree
        child = new BinaryNode<>(lq, child2, child3);
        root.setLeftChild(child);

        //set the second yes branch in the tree
        child2 = new BinaryNode<>(lq_2,null,null);
        child2.setLeftChild(new BinaryNode<>(animal1, null, null));
        child2.setRightChild(new BinaryNode<>(animal4, null, null));
        child.setLeftChild(child2);


        //set the first right (no) branch in the tree
        child1 = new BinaryNode<>(rq, child4, child5);
        root.setRightChild(child1);


        //set the second no branch in the tree
        child3 = new BinaryNode<>(rq_2, null, null);
        child3.setLeftChild(new BinaryNode<>(animal3, null, null));
        child3.setRightChild(new BinaryNode<>(animal2, null, null));
        child.setRightChild(child3);


        //set the first yes branch after the first no branch in the tree
        child4 = new BinaryNode<>(lq_4,null,null);
        child4.setLeftChild(new BinaryNode<>(animal5, null, null));
        child4.setRightChild(new BinaryNode<>(animal6, null, null));
        child1.setLeftChild(child4);


        //set the second no branch on the right(no) side
        child5 = new BinaryNode<>(rq_4,null,null);
        child5.setLeftChild(new BinaryNode<>(animal7, null, null));
        child5.setRightChild(new BinaryNode<>(animal8, null, null));
        child1.setRightChild(child5);


        return root;
    }


    public static void update(BinaryNode<String> current)

    {
        String guessAnimal;   // The animal that was guessed
        String userAnimal; // The animal that the user was thinking of
        String userQuestion;   // A question to distinguish the two animals

        // Set Strings for the guessed animal,
        // the animal user was thinking of and
        // the new question to identify the animal question.
        guessAnimal = current.getData( );
        System.out.println("I don't know. What is the correct answer");
        userAnimal = in.nextLine( );
        System.out.println("Enter a question that identifies a");
        System.out.println(userAnimal + " distinctively from a " + guessAnimal + ".");
        userQuestion = in.nextLine( );


        // Put the new question the user input in the current node, and add two new children.
        current.setData(userQuestion);
        System.out.println("As a " + userAnimal + ", " + userQuestion);
        if (check("Please answer"))
        {
            current.setLeftChild(new BinaryNode<>(userAnimal, null, null));
            current.setRightChild(new BinaryNode<>(guessAnimal, null, null));
        }
        else
        {
            current.setLeftChild(new BinaryNode<>(guessAnimal, null, null));
            current.setRightChild(new BinaryNode<>(userAnimal, null, null));
        }
    }

    //method to check if the input is really a yes or no
    //if not, then the user has to reenter y or n
    public static boolean check(String prompt)
    {
        //variable for storing the y or n
        String input;

        //prompt is the statement to prompt the user to enter y or n
        System.out.print(prompt + " [Y or N]: ");
        input = in.nextLine( ).toUpperCase( );

        //while loop for comparing if input is equal to y or n
        while (!input.equals("Y") && !input.equals("N"))
        {

            System.out.print("Invalid response. Please type Y or N: ");
            input = in.nextLine( ).toUpperCase( );
        }

        return input.equals("Y");
    }

    //method to save to file
    public static void saveFile()

    {
        FilePath = System.getProperty("user.dir") + "\\";
        System.out.println("Working Directory = " + FilePath);

        try {
            String filename = FilePath+"output.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            String output="";
            writer.write(output);
            writer.close();
        }
        catch (IOException e) { }

    }

    public static void loadFile()
    {
        String filename= FilePath+"output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String output = reader.readLine();
            reader.read(CharBuffer.wrap(output));
            reader.close();
        }
        catch (IOException e) { }

    }

    public static void main(String[ ] args)
    {
        BinaryNode<String> root;

        root = createTree( );

        root.inorderTraverse();

        do
            run(root);
        while (check("Shall we play again?"));


        System.out.println ("Here is the tree:");
        root.print(1);
    }





}

