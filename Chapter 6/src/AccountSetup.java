import java.util.String;
import java.util.Scanner;


public class AccountSetup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String username = " ";
        String password = " ";

        while (username.length() < 8) {
            System.out.println("Enter a username that is at least eight characters: ");
        username = input.nextLine();
        }

        while (password.length() < 8) {
             System.out.println("Enter a password that is at least eight characters: ");
             password = input.nextLine();
        }
        input.close();
        System.out.println("Your username is " + username.toLowerCase() + " and your password is " + password.toLowerCase());

    }
}
