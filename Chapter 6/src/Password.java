import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userGuess;
        final String PASSWORD = "password"; //This is actually one of my passwords

        for (int attempts = 1; attempts <=3; attempts++) {
            System.out.println("Enter your password");
            userGuess = input.next();
            if (userGuess.equals(PASSWORD) == true) {
                System.out.println("Welcome.");
                break;
            } else if (attempts == 3 && userGuess.equals(PASSWORD) == false) {
                System.out.println("Access declined");
            } else {
                System.out.println("Try again");
            }
        }
        input.close();
        
    }
}
