
import java.text.NumberFormat;

public class RollingDice {
    public static void main(String[] args) {
        NumberFormat percent = NumberFormat.getPercentInstance();
        double diceOne;
        double diceTwo;
        int diceSum = 0;
        double diceProbability;
        while (diceSum != 13) {

        
        diceOne = (7-1) * Math.random() + 1;
        diceTwo= (7-1) * Math.random() + 1;
        diceSum = (int)diceOne + (int)diceTwo;
        diceProbability = (double)diceSum/(double)36;
        


        System.out.println("Dice one: " + (int)diceOne);
        System.out.println("Dice two: " + (int)diceTwo);
        System.out.println("Dice sum: " + diceSum);
        System.out.println("The probability of that roll is: " + percent.format(diceProbability));
        }


    }
}
