
import java.text.NumberFormat;
public class RollingDie {
    public static void main(String[] args) {
        NumberFormat percent = NumberFormat.getPercentInstance();
        double diceOne;
        double diceTwo;
        int diceSum;
        double diceProb;
        double diceCombos = 0;
        diceOne = (7-1) * Math.random() + 1;
        diceTwo = (7-1) * Math.random() + 1;

        diceSum = (int)diceOne + (int)diceTwo;
        
        switch (diceSum) {
            case 2: diceCombos = 1; break;
            case 3: diceCombos = 2; break;
            case 4: diceCombos = 3; break;
            case 5: diceCombos = 4; break;
            case 6: diceCombos = 5; break;
            case 7: diceCombos = 6; break;
            case 8: diceCombos = 5; break;
            case 9: diceCombos = 4; break;
            case 10: diceCombos = 3; break;
            case 11: diceCombos = 2; break;
            case 12: diceCombos = 1; break;
        }
        
        diceProb = diceCombos/36;
        
        System.out.println("Dice one: " + (int)diceOne);
        System.out.println("Dice two: " + (int)diceTwo);
        System.out.println("The sum of each roll is: " + diceSum);
        System.out.println("The probability of that role is: " + percent.format(diceProb));
    }
}