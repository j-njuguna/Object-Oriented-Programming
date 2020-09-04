package com.company;

import javax.swing.*;

public class InfixToPostfix {

    static String values = ")(^*/+-";
    static String totalValues = ")(^*/+-0123456789";
    static int Precedence(char checkChar) {

        return values.indexOf(checkChar);
    }

static String infixToPostfix(){

    String result ="";
    String infix = JOptionPane.showInputDialog("Please enter an infix numerical expression between 3 and 20 characters");


    //check the length of the expression entered

    boolean valid;
    do {
        valid = true;
        if ((infix.length() <= 2) || (infix.length()>20)) {
            JOptionPane.showMessageDialog(null, "Please enter an infix numerical expression between 3 and 20 characters");
            infix = JOptionPane.showInputDialog("Please try again ");
            valid = false;
        }

        else {
            //for loop to go through the input string
            for(int i=0; i<infix.length(); i++)
            {

               if (!totalValues.contains(""+infix.charAt(i))) {
                   valid = false;
                   JOptionPane.showMessageDialog(null, "Only the following characters are valid: +,-,*,/,^,(,) and numbers 0-9");
                   infix = JOptionPane.showInputDialog("Please try again ");
               }
            }
        }

    } while (!valid);



    ArrayStack stack = new ArrayStack(infix.length());

    //convert input -infinix- to a character array
    char[] inputCharArray = infix.toCharArray();


    //loop to read each character
    for (char character : inputCharArray)
        System.out.println(character);


    // Infix to postfix algorithm
    //for loop to go †hrough the characters in char arrray
    for (int i = 0; i < inputCharArray.length; i++)
    {
        //char at each position, i
        char checkChar = inputCharArray[i];

        //check if any operators are present.. if the input is not an operator then it's a number, so ao append to result
        if (checkChar != '+' && checkChar != '-' && checkChar != '/' && checkChar != '*' && checkChar != '(' && checkChar != ')')
        {
            //append scanned character to result
            result = result + checkChar;
        }
        else
        {
            //the stack is empty or the stack contains an opening parenthesis ‘(‘ ): push it.

            //else if stack does not contain ( and )
            if (checkChar != '(' && checkChar != ')')
            {
                //if stack is empty push it
                if (stack.isEmpty())
                {
                    stack.push(checkChar);
                } else {

                    //while loop to check if the precedence of the scanned operator is greater than the precedence of the
                    //operator in the stack , push it
                    while (Precedence((char)stack.top()) >= Precedence(checkChar))
                    {
                        //pop the operators from the stack which are greater than or equal to in precedence than that of
                        // the scanned operator and append them to result
                        result = result + stack.pop();
                        //if stack is empty break
                        if (stack.isEmpty()) {
                            break;
                        }
                    }
                    //push scanned operator to the stack
                    stack.push(checkChar);
                }

            }
            else
            {
                // if '(' is encountered while popping
                if (checkChar == '(')
                    //push the scanned operator in the stack
                    stack.push(checkChar);
                else {
                    //if scanned char is an ')'
                    while ((char)stack.top() != '(')
                    {
                        //pop the stack and append to the result until '(' is encountered
                        result = result + stack.pop();
                    }
                    //discard both parenthesis
                    stack.pop();
                }
            }
        }
    }
    //loop to repeat scanning until the whole expression is scanned
    while (!stack.isEmpty())
        //pop the stack and append to the result
        result = result + stack.pop();

    //reult is the output string
    JOptionPane.showMessageDialog(null, "The result is : \n Infix:" + infix + "\nPostfix: "+ result + "\nResult is: "+ evaluatePostfix(result));
//

    return result;
}

    // Method to evaluate value of a postfix expression
    static int evaluatePostfix(String exp)
    {
        //create a new Array stack to store operands
        ArrayStack stack = new ArrayStack();

        // Scan all characters one by one
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);

            // If the scanned character is an operand (number) push it onto the stack.
            if(Character.isDigit(c))
                stack.push(c - '0');

                //  If the scanned character is an operator, pop two numbers from stack apply the operator
                // push result back to the stack
            else
            {
                int val1 = (int) stack.pop();
                int val2 = (int) stack.pop();

                switch(c)
                {
                    //push result back to the stack
                    case '+':
                        stack.push(val2+val1);
                        break;

                    case '-':
                        stack.push(val2- val1);
                        break;

                    case '/':
                        stack.push(val2/val1);
                        break;

                    case '*':
                        stack.push(val2*val1);
                        break;
                }
            }
        }
        //pop the stack once expression has been fully read
        return (int) stack.pop();

    }

    // Test the above methods
    public static void main(String[] args)
    {

        String result = infixToPostfix();

        System.out.println(evaluatePostfix(result));
    }
}
