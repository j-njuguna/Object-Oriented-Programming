package com.company;

//create an Email class
public class Email {

    //declare variables
    private String email;
    private Order order;
    private Payment payment;
    private Customer customer;


    //create a class constructor for email class
    public Email(Customer customer, String s, Payment payment, Order order) {

        //reference the object classes constructors
        this.customer = customer;
        this.email = s;
        this.payment= payment;
        this.order = order;

    }

    public void send(){ //method to send the email

        System.out.println("\n\nEmail:");
        System.out.println("Dear Mr/ Mrs " + customer.getFirstName() + " " + customer.getSurName() + ",\nCustomer ID : "+customer.getCustomerId()+ ","); // call the getter methods from customer
        if(payment.verify()){ //calls the verify method from payment class
            System.out.println("   Order ID. " + order.getOrderId()); //calls the getter method for order ID from order class
            System.out.println("   Items: " + order.getItems()); //calls the getter method for items from the order class

            for(Item item : order.getItems()){ // for loop that goes through the items in the order class and prints them out
                System.out.print(" -");
                item.toString();
            }
            System.out.println("   Total Price for the items : " + order.getTotalPrice());  //calls the getter method for totalPrice of items from order class
            System.out.println("   Delivery address : " + customer.getDeliveryAddress().toString()); //calls the getter method for the string in deliveryAddress from customer class
            System.out.println("   Billing address : " + customer.getBillingAddress().toString()); //calls the getter method for the string in billingAddress from customer class

            System.out.println("\nThank you for shopping with us\n"); //print out thank you message

            System.out.println("Regards,"); //print out sign off statement
            System.out.println("Joy");
        }
        else{
            //when the payment is declined this error message is displayed in the email
            System.out.println("Regretfully, your card details were invalid. We couldn't validate your payment information. Thank you for shopping with us");
        }

    }

    //getter method for email
    public String getEmail()
    {
        return email;
    }


}
