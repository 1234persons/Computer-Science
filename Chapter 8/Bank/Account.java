package Bank;

import java.text.NumberFormat;

public class Account {
    private double balance;
    private Customer cust;

    /*
     * constructor
     * pre: none
     * post: An account is created w/ balance and customers data
     */
    public Account(double balance, String fName, String lName, String str, String city, String st, String zip) {
        this.balance = balance;
        cust = new Customer(fName, lName, str, city, st, zip);
    }

    //returns account balance
    public double getBalance() {
        return(balance);
    }

    //deposits money to account
    public void deposit(double amt) {
        balance += amt;
    }

    public void withdrawal(double amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Not enough money in account.");
        }
    }

   public String toString() {
    NumberFormat money = NumberFormat.getCurrencyInstance();
    String accountString = cust.toString();
    accountString += "Current balance is: " + money.format(balance);
    return (accountString);
   } 

   public void changeAddress(String street, String city, String state, String zip) {
        cust.changeStreet(street);
        cust.changeCity(city);
        cust.changeState(state);
        cust.changeZip(zip);
   }

}