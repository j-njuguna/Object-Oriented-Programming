package com.company;

//create a payment class
public class Payment {


    private Customer customer;

    //declare all variables to be used in the class
    private String customerName;
    private String creditCardType;
    private int creditCardNumber;
    private String creditCardBank;
    private String expiryDate;
    private Address address;
    private boolean valid = false; //initialises valid to false

    //create a class constructor for payment class
    public Payment(Customer customer,Address address,String creditCardType,int creditCardNumber, String creditCardBank, String expiryDate)//constructor for payment class
    {

        //reference the object classes constructors
        this.customerName = customer.getFirstName()+ " " + customer.getSurName(); //set the customer name to include the first name and surname.
        this.address = customer.getBillingAddress();
        this.creditCardType = creditCardType;
        this.creditCardNumber = creditCardNumber;
        this.creditCardBank = creditCardBank;
        this.expiryDate = expiryDate;


    }

    public boolean verify() //method to verify if the payment is valid
        {
            boolean verf = true; //true value assigned to verf

            if (creditCardType == null) //if there is no input
            {
                System.out.println("Invalid input"); //print error message

                valid = false; //validity is false
                return false; //return false value
            }


            //if creditCardType does not match 'MasterCard' or 'Visa' strings print out error message
           else if( (! creditCardType.equals("MasterCard")) && (! creditCardType.equals("Visa")))
            {
                System.out.println("\nCard is invalid\n");

                verf = false;// verification is false
            }
           //if creditCardType matches 'MasterCard' or 'Visa' strings print out positive card is valid message
            else if( (creditCardType.equals("MasterCard") ) || (creditCardType.equals("Visa")))
            {
                System.out.println("Card is valid\n");

                verf = true; //verification is true
            }


            valid = verf; //valid is equal to verification
            return verf; //return value of verf
    }


    public String getCustomerName()
    {
        return customerName;
    }


    //getter method for the expiry date
    public String getExpiryDate()
    {
        return expiryDate; //returns the expiry date
    }

    //getter method for the creditCardType
    public String getCreditCardType()
    {
        return creditCardType; //returns the creditCardType
    }

    //getter method for the creditCardNumber
    public int getCreditCardNumber()
    {
        return creditCardNumber; //returns the creditCardNumber
    }

    //getter method for the creditCardBank name
    public String getCreditCardBank()
    {
        return creditCardBank; //returns the creditCardBank
    }




}
