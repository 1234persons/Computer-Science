public class DiceRollsP2 {
    public static void main(String[] args) {
        double diceOne;
        double diceTwo;
        int diceSum;

        diceOne = (7-1) * Math.random() + 1;
        diceTwo = (7-1) * Math.random() + 1;

            System.out.format("%-8s %5s %5s", "Dice one", "Dice Two", "Dice sum\n");
        for (int i = 1; i <= 5; i++) {
            diceOne = (7-1) * Math.random() + 1;
            diceTwo = (7-1) * Math.random() + 1;
            diceSum = (int)diceOne + (int)diceTwo;
            System.out.println((int)diceOne + "        " + (int)diceTwo + "        " + diceSum);
        }
    }
}
