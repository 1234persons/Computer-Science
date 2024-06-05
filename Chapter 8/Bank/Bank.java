package Bank;

import java.text.NumberFormat;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Account munozAccount = new Account(250, "Maria", "Munoz", "110 Glades Road", "My town", "Fl", "33445");
        Scanner input = new Scanner(System.in);

        double data;

        NumberFormat money = NumberFormat.getCurrencyInstance();

        System.out.println(munozAccount);
        System.out.println("Enter deposit amount: ");
        data = input.nextDouble();
        munozAccount.deposit(data);
        System.out.println("Balance is: " + money.format(munozAccount.getBalance()));

        System.out.println("Enter withdrawal amount: ");
        data = input.nextDouble();
        munozAccount.withdrawal(data);
        System.out.println("Balance is: " + money.format(munozAccount.getBalance()));

        System.out.println("Would you like to change your address? (Enter y for yes, N for no)");
        if ("y".equals(input.next())) {
            String street, city, state, zip;

            System.out.println("Enter your new street:");
            street = input.next();

            System.out.println("Enter your new city:");
            city = input.next();

            System.out.println("Enter your new state:");
            state = input.next();

            System.out.println("Enter your new zip:");
            zip = input.next();

            munozAccount.changeAddress(street, city, state, zip);
        } else {
            System.out.println("Have a good day!");
        }
        System.out.println(munozAccount);
        input.close();
    }

}