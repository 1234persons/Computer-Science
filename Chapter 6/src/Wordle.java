import java.util.Random;
import java.util.Scanner;
import java.util.String;

public class Wordle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String userWord;
        String wordList[] = { "BRAIN", "LOSER", "JUNKS", "FUZED", "JOCKS", "COBRA", "QUAKE", "JUICY", "JOKED", "ZESTY",
                "ADIEU", "STARE", };
        String secretWord = wordList[rand.nextInt(wordList.length)];
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        int guesses;
        boolean correct;
        
        System.out.println();

        
    }
}
