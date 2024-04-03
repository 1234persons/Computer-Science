import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        int userGuess;
        int computerNumber;
        int points = 1000;
        int riskPoints;

        boolean low = false;
        boolean high = false;
        boolean userHigh = false;
        boolean userLow = false;
        boolean win = false;
        String userChoice;

        do {

            computerNumber = rand.nextInt(13 - 1) + 1;

            if (computerNumber < 7) {
                low = true;
            } else if (computerNumber > 7) {
                high = true;
            }

            System.out.println("RULES");
            System.out.println("Numebrs 1 through 6 are low.");
            System.out.println("Numbers 8 through 13 are high.");
            System.out.println("7 is neither high or low.\n");

            System.out.println("You have " + points + " points\n");

            do {
                System.out.println("Enter points to risk: ");
                riskPoints = input.nextInt();
            } while (riskPoints > points);

            do {
                System.out.println("\nEnter high(1) or low(0): ");
                userGuess = input.nextInt();
            } while (userGuess != 1 && userGuess != 0);

            if (userGuess == 1) {
                userHigh = true;
            } else {
                userLow = true;
            }

            if (userHigh && high || userLow && low) {
                win = true;
                points += riskPoints * 2;
            } else {
                points -= riskPoints;
            }

            System.out.println("Number is " + computerNumber + ".");

            if (win) {
                System.out.println("You win!!!");
            } else {
                System.out.println("You lose :(");
            }

            System.out.println("You have " + points + " points.");
            System.out.println("Play again? (y for yes, n for no)");
            userChoice = input.next().toLowerCase();

        } while (!userChoice.equals("n"));
        input.close();
    }
}
