package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;

//create an order class
public class Order {

    //declare all the variables
    private long orderId;
    private ShoppingCart shoppingCart;
    private ArrayList<Item> orderList;
    private double totalPrice = 0; //initialise totalPrice to 0


    //create a class constructor for order class
    public Order(ShoppingCart shoppingCart){

        //reference the object class(shoppingCart
        this.shoppingCart = shoppingCart;


        orderId = makeOrderId(); //puts the generated ID into the orderId variable


        orderList= new ArrayList(); //new array list object to hold the order list

        while(this.shoppingCart.getNumberOfItems()>0) //while loop that goes through the items in the shopping cart ans stops when there are zero items left
        {
            orderList.add(this.shoppingCart.orderTransfer()); //adds the items transferred by the order transfer method into orser list

        }
    }

    private long makeOrderId() //method that generates random order ID
    {
        return (long)(Math.random() * 9999999999L);
    }


    public long getOrderId() //getter method for the generated random ID
    {
        return orderId;
    }


    public double totalPrice()
    {
        for (Item item : orderList) //for loop goes through all the items in the order list
        {
            totalPrice += item.getItemPrice(); //adds each of the prices for the items and stores it into totalPrice
        }
        return totalPrice;
    }

    public double getTotalPrice() // getter method for the total price
    {

        return totalPrice(); //returns the total price of items
    }

    public void orderList() //method to create the order list
    {
        for (int i=0; i<orderList.size();i++) //loop that goes through the order list until i is 0
        {
            System.out.println(orderList.get(i)); //prints out the order list
        }
    }

    public int getNumberOfItems() // getter method for the total number of items in the order list
    {
        return orderList.size(); //returns size of the order list(number of items)
    }

    public ArrayList<Item> getItems() //getter method that returns all the items in the array list
    {
        return orderList; //returns the items in the order list
    }



}

