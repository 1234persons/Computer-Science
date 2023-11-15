import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class Wordle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String userWord;
        String wordList[] = { "BRAIN", "LOSER", "JUNKS", "FUZED", "JOCKS", "COBRA", "QUAKE", "JUICY", "JOKED", "ZESTY",
                "ADIEU", "STARE", };
        //String secretWord = wordList[rand.nextInt(wordList.length)];
        String secretWord = "BRAIN";
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String tempWord = secretWord;
        int guesses = 1;
        boolean correct;
        
        System.out.println("You will have five attempts to guess a random five letter worc.");
        System.out.println("Letters in the correct spot will be " + GREEN + "green" + RESET);
        System.out.println("Letters in the word but not the right spot will be " + YELLOW + "yellow" + RESET);
        System.out.println("Letters that are not in the word will be " + RED + "red\n" + RESET);
        
        while (guesses <= 5) {
            System.out.println("Enter guess " + guesses + " out of 5");
            userWord = input.nextLine().toUpperCase();

            for (int i = 0; i < userWord.length(); i++) {
                Character userChar = userWord.charAt(i);
                
                for (int j = 0; j < secretWord.length(); j++) {
                    Character secretChar = secretWord.charAt(j);
                    Character replacementChar = 0;
                    if (userChar.equals(secretChar) == true && i != j) {
                        System.out.print(YELLOW + userChar + RESET);
                        userWord = userWord.replace(userChar, replacementChar);
                        break;
                    } else if (userChar.equals(secretChar) == true) {
                        System.out.print(GREEN + userChar + RESET);
                        userWord = userWord.replace(userChar, replacementChar);
                        break;
                    }
                    if (userChar.equals(secretChar) == false) {
                        System.out.print(RED + userChar + RESET);
                        userWord = userWord.replace(userChar, replacementChar);
                        
                    }
                }
                
            }
            System.out.println();
            if (userWord.equals(secretWord)) {
                System.out.println("You win");
                break;
            } else {
                guesses += 1;
            }
        }

    }

        
}

