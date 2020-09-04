package com.company;

import java.math.BigDecimal;


public class Item {
    private String itemName;
    private double itemPrice;
    private long itemId;
    private ShoppingCart shoppingCart;


    public Item(String itemName, double itemPrice)
    {
        this.itemName = itemName;
        this.itemPrice = itemPrice;

        itemId = makeItemId();

    }

    public void add(ShoppingCart shoppingCart)
    {
        this.shoppingCart=shoppingCart;
    }


    public double getItemPrice()

    {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice)
    {
        this.itemPrice= itemPrice;
    }

    public long makeItemId()
    {

        return (long)(Math.random() * 99999L);

    }


    public long getItemId()
    {
        return itemId;
    }


    public String getItemName()
    {
        return itemName;
    }



    @Override
    public String toString(){
        String out = "Item Id: " + itemId + "\t" + "\tPrice: " + itemPrice;

        return out;
    }
}
