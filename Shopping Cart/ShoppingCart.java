package com.company;

import java.util.ArrayList;

//create a shoppingCart class
public class ShoppingCart {
    //declare all the variables
    private long cartId;
    private Item item;
    private int numberOfItems;
    private ArrayList<Item> cart = new ArrayList<>(); // creates new array list
    private int i = 0; //initialises i to 0
    private boolean opened = true; //initialising open cart value of true


    //create a class constructor for shoppingCart class
    public ShoppingCart(){

        cartId = makeCartId(); //puts the generated ID into the cartId variable
    }

    public int getNumberOfItems() //getter method for total number of items in the cart
    {
        return cart.size();//gets total number of items in the cart
    }


    public void close() //method to close the cart
    {
        if (!opened )
        {
            System.out.println("\nCart is closed");
            return;
        }
        opened = false; //cart is not open
        System.out.println("\nCart is now closed");
    }

    public void addItems(Item item) //method to add items to cart
    {
        if(opened) {
            //read in an item and add to the cart
            cart.add(item);
            System.out.println("Item " + item.getItemName() + " was added to the shopping cart"); //prints out the item that was just added
            System.out.println("Total number of items : " + cart.size()); //prints out the total number of items
        }
        else
        {
            System.out.println("Item could not be added"); //when the cart is closed, the cart cannot be altered
        }
    }


    public void removeItems(Item item){ //method to remove items from cart

        if(!opened){ //if cart is closed
            System.out.println("Could not remove item from the shopping cart. Its is now closed"); //prints out error message
            return;
        }

        if(!cart.contains(item)){ //if statement to check if there is the requested item is not in the shopping cart
            System.out.println("Could not find the item in your shopping cart"); //prints out an error message
            return;
        }
        cart.remove(item);//removes the selected item from the cart
        System.out.println("Item " + item.getItemName() + " was removed from the shopping cart"); //prints out the item removed
        System.out.println("Total number of items: " + cart.size()); //updates the total number of items in the cart after the item is removed
    }


    public void info(){
        System.out.println("Shopping Cart: ");
        int counter = 1; //counts number of items
        //for each item in the cart print out the name and price
        for(Item item : cart){
            System.out.println("   [" + counter + "] " + "Name: "+ item.getItemName() + " | Price: " + item.getItemPrice());
            counter++; //counts items
        }
        System.out.println("Total number of items : "+ cart.size());//prints out the total number of items in cart
        System.out.println("Cart ID : "+ getCartId()); //prints out the generated id
    }



    public Item orderTransfer()
    { //method transfers all the items from the shopping cart to the order
        if (cart.size()>0) // loops until there are no more items in the cart
        {
            return cart.remove(0);//starts from index 0 removing all the items from the cart
        }
        else {
            return null;
        }
    }

    private long makeCartId() //method generates random cart ID
    {
        return (long)(Math.random() * 9999999999999L);
    }

    public long getCartId() //getter method for the generated cart id
    {
        return cartId; //returns the cart id
    }

    public void setCartId(long id) //method that sets the cart id
    {
        cartId = id;
    }





}