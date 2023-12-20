import java.lang.String;
import java.util.Scanner;


public class AccountSetup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String username;
        String password;


        System.out.println("Enter a username: ");
        username = input.nextLine();

        do {
             System.out.println("Enter a password that is at least eight characters: ");
             password = input.nextLine();
        } while (password.length() < 8);

        input.close();
        
        System.out.println("Your username is " + username.toLowerCase() + " and your password is " + password.toLowerCase());

    }
}
