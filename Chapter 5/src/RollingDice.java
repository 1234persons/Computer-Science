import java.util.*;

public class RollingDice {
    public static void main(String[] args) {
        double diceOne;
        double diceTwo;
        double diceSum;
        double diceProb;

        diceOne = (7-1) * Math.random() + 1;
        diceTwo = (7-1) * Math.random() + 1;

        diceSum = (int)diceOne + (int)diceTwo;
        diceProb = diceSum/36;

        System.out.println("Dice one: " + diceOne);
        System.out.println("Dice two: " + diceTwo);
        System.out.println("The sum of each roll is: " + diceSum);
        System.out.println("The probability of that role is: " + diceProb);
    }
}
