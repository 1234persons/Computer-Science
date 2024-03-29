import java.util.Random;
import java.util.Scanner;

public class Nim {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Random rand = new Random();
        int rocks = rand.nextInt(30 - 15) + 15;

        System.out.println("RULES");
        System.out.println("You and the computer can each take 1 to 3 rocks per turn");
        System.out.println("Whoever takes the last rocks loses.");
        
        do {
            rocks = playerMove(rocks);
            rocks = computerMove(rocks);
        } while (rocks > 0);
        input.close();
    }

    public static boolean isValidEntry(int guess, int rocks) {

        if (guess <= 3 && guess > 0 && !(guess > rocks)) {
            return (true);
        } else {
            return (false);
        }

    }

    public static int drawStones(int rocks) {

        Random rand = new Random();
        int computerNum;
        boolean validGuess = false;

        do {
            computerNum = (3 - 1) * rand.nextInt() + 1;
            validGuess = isValidEntry(computerNum, rocks);
        } while (!validGuess);

        return (computerNum);
    }

    public static int playerMove(int rocks) {


        int userGuess;
        boolean validGuess = false;

        do {

            System.out.print("There are " + rocks + " stones, How many would you like to take? ");
            userGuess = input.nextInt();
            validGuess = isValidEntry(userGuess, rocks);

        } while (!validGuess);

        System.out.println();

        rocks -= userGuess;
        
        if (rocks == 0) {
            playerLose();
        }
        return (rocks);

    }

    public static int computerMove(int rocks) {

        int computerGuess = drawStones(rocks);

        System.out.println("There are " + rocks + " stones. " + "The computer takes " + computerGuess + " rocks.\n");
        rocks -= computerGuess;

        if (rocks == 0) {
            computerLose();
        }
        return (rocks);
    }

    public static void playerLose() {
        System.out.println("The computer wins!");

    }

    public static void computerLose() {
        System.out.println("The player wins!");
    }
}
