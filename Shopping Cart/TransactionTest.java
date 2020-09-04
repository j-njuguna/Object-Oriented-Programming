package com.company;
import java.util.ArrayList;
import java.util.Date; //import package for the current date and time

//create a transactionTest class
public class TransactionTest {


    //entry point method
    public static void main(String[] args) {
        Date date = new Date(); //date of creation
        System.out.println("Date created " + date);


        //create new transaction test object
        TransactionTest test = new TransactionTest();
        test.transaction1(); //calls method with test scenario 1
        test.transaction2(); //calls method with test scenario 2
    }

    public void transaction1() { //method for the first transaction test

        System.out.println("\nTEST SCENARIO 1\n"); // display title for the first scenario

        //create new address object and assigns it to address1 and address11 object
        Address address1 = new Address("904 Kolm","Berlin","H54NW86","Germany");//display billing address
        Address address11 = new Address("987 Hunt", "Galway","H91FW87","Ireland"); //display delivery address

        //create new customer object and assigns it to customer1 object
        Customer customer1 = new Customer("June","Bug");
        //setting billing address to address1
        customer1.setBillingAddress(address1);
        //setting billing address to address11
        customer1.setDeliveryAddress(address11);

        //create new shoppingCart object
        ShoppingCart cart1 = new ShoppingCart();

        //create new item objects for all three items added
        Item item1 = new Item ("Grape", 90);
        Item item11 = new Item ("JackInTheBox", 900);
        Item item111 = new Item ("Banana", 9.00);


        //add first item to cart
        cart1.addItems(item1);
        //add second item to cart
        cart1.addItems(item11);
        //add third item to cart
        cart1.addItems(item111);


        //return shopping cart info showing the items and the total number of items
        cart1.info();

        //create new date object and assigns it to date1 object
        Date date1 = new Date();
        System.out.println("\nShopping cart created on " + date1);

        //close the shopping cart so no more items can be added or removed
        cart1.close();


        //creates new order object and assigns it to order1
        Order order1 = new Order(cart1);

        //creates new payment object
        Payment payment1 = new Payment(customer1,address1,"Visa",16534,"AIB","16/09/2020");

        //if the payment is valid or invalid  a print statement shows the status.
        if (payment1.verify()){ //calling the verify method from payment class
            System.out.println("Payment is valid. Order confirmed");
        }
        else {
            System.out.println("Payment is invalid. Order not successful");
        }

        //creates new email object
        Email email1 = new Email(customer1,"junebug@gmail.com", payment1,order1);

        //print out customer details
        System.out.println("\nCustomer :  " + customer1.getCustomerId() +"\nName : " +customer1.getFirstName()+ "  " + customer1.getSurName()+ "\tEmail : " + email1.getEmail()); //call the getter methods from the customer and email classes

        //print out billing address details
        System.out.println("\nBilling Address : " + address1.getStreet()+ " , " + address1.getCity()+" , " + address1.getZipCode() + " , "+ address1.getCountry()); //call the getter methods from the address class

        //print out delivery address details
        System.out.println("\nDelivery Address : "+ address11.getStreet() + " , " + address11.getCity() +" , " + address11.getZipCode() +" , " + address11.getCountry()); //call the getter methods from the address class

        //print out payment details
        System.out.println("\nPayment :" + payment1.getCreditCardType() + " , " + payment1.getCreditCardNumber()+ " , "+ payment1.getCreditCardBank()+" , " + payment1.getExpiryDate()); //call the getter methods from the payment class

        //print out number of items in the order
        System.out.println("\nTotal number of items : " + order1.getNumberOfItems()); //call the getter method from the order class

        System.out.println("\nItems ordered : " ) ;

        //prints out the contents in the order list
        order1.orderList();


        //prints out total items in the order
        System.out.println("\nTotal price of items : "+ order1.getTotalPrice());  //call the getter method for totalPrice from the order class
        System.out.println("\nOrder ID : "+ order1.getOrderId()); //call the getter method for orderID from the order class

        //prints out the email that would be sent to the customer from the email class
        email1.send();
    }



    //public method for second transaction
    public void transaction2() {


        System.out.println("\n\nTEST SCENARIO 2\n");// display title for the second scenario

        //create new address objects for billing and delivery objects
    Address address2 = new Address("904 Kolm","Berlin","H54NW86","Germany"); //billing address
    Address address22 = new Address("987 Hunt", "Galway","H91FW87","Ireland"); //delivery objects

    //create new customer object
    Customer customer2 = new Customer("June","Bug");
        customer2.setBillingAddress(address2); //setting billing address to address2
        customer2.setDeliveryAddress(address22); //setting billing address to address22

        // create new shopping cart object
    ShoppingCart cart2 = new ShoppingCart();


    //create new item objects for each item in the cart
    Item item2 = new Item ("Grape", 90);
    Item item22 = new Item ("JackInTheBox", 900);
    Item item222 = new Item ("Banana", 9.00);

        //add first item to cart
        cart2.addItems(item2);
        //add second item to cart
        cart2.addItems(item22);
        //add third item to cart
        cart2.addItems(item222);


        //remove chosen item from the cart
        cart2.removeItems(item2);

        //return shopping cart info showing the items and the total number of items
        cart2.info();

        //create new date object
        Date date2 = new Date();
        System.out.println("\nShopping cart created on " + date2);

        //close shopping cart to prevent further changes
        cart2.close();

        //create new order object
    Order order2 = new Order(cart2);

    //create new payment object
    Payment payment2 = new Payment(customer2,address2,"Viso",16534,"AIB","16/09/2020");

        //if the payment is valid or invalid  a print statement shows the status.
        if (payment2.verify()){ //calling the verify method from payment class
        System.out.println("Payment is valid. Order confirmed");
    }
        else {
        System.out.println("Payment is invalid. Order not successful");
    }

        //crate new email object
    Email email2 = new Email(customer2,"junebug@gmail.com", payment2,order2);

        //prints out customer details
        System.out.println("\nCustomer ID:  " + customer2.getCustomerId() +"\nName : " +customer2.getFirstName()+ "  " + customer2.getSurName()+ "\tEmail : " + email2.getEmail()); //call the getter methods from the customer and email classes

        //prints out billing address
        System.out.println("\nBilling Address : " + address2.getStreet()+ " , " + address2.getCity()+" , " + address2.getZipCode() + " , "+ address2.getCountry()); //call the getter methods from the address class

        //prints out delivery address
        System.out.println("\nDelivery Address : "+ address22.getStreet() + " , " + address22.getCity() +" , " + address22.getZipCode() +" , " + address22.getCountry()); //call the getter methods from the address class

        //prints out payment details
        System.out.println("\nPayment :" + payment2.getCreditCardType() + " , " + payment2.getCreditCardNumber()+ " , "+ payment2.getCreditCardBank()+" , " + payment2.getExpiryDate()); ////call the getter methods from the payment class

        //prints out total number of items in the order
        System.out.println("\nTotal number of items : " + order2.getNumberOfItems()); //call the getter method from the order class

        System.out.println("\nItems ordered: " ) ;

        //prints out the item details in the order
        order2.orderList();


        //prints out total number of items in the order and the order ID
        System.out.println("\nTotal price of items : "+ order2.getTotalPrice());  //call the getter method for totalPrice from the order class
        System.out.println("\nOrder ID : "+ order2.getOrderId()); //call the getter method for orderID from the order class

        // prints out the email details from the email class
        email2.send();
}

    }


