package com.company;


public class Customer {

     private String firstName;
    private String surName;
    private Email email;
    private Address billingAddress;
    private Address deliveryAddress;
    private final long customerId;
    private Payment payment;



     public Customer(String firstName, String surName)
     {
        this.firstName = firstName;
        this.surName = surName;
        customerId  = makeCustomerId();
    }


     private long makeCustomerId()
     {
         return (long)(Math.random() * 99999999999999L);
     }

     public long getCustomerId()
     {
        return customerId;
    }

     public String getFirstName()
     {
         return firstName;
     }
     public void setFirstName(String first)
     {
         firstName = first;
     }

     public String getSurName()
     {

         return surName;
     }

     public void setSurName(String sur)
     {
         surName = sur;
     }
     public Address getBillingAddress() {
         return billingAddress;
     }

     public void setBillingAddress(Address billingAddress)
     {
         this.billingAddress = billingAddress;
     }

     public Address getDeliveryAddress()
     {
         return deliveryAddress;
     }

     public void setDeliveryAddress(Address deliveryAddress)
     {
         this.deliveryAddress = deliveryAddress;
     }

     public Payment getPayment() {

         return payment;
     }

     public void setPayment(Payment payment) {
         this.payment = payment;
     }


     public Email getEmail() {
         return email;
     }

     public void setEmail(Email email) {
         this.email = email;
     }


     @Override
     public String toString(){
         String out = "First Name: " + firstName + "\t" + "\tSurname: " + surName + "\t" + "Email: ";

         return out;
     }



 }
