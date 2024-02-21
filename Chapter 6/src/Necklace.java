import java.util.Scanner;

public class Necklace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNum;
        int secondNum;

        int lastDigit;
        int currentDigit;
        int nextDigit;

        do {
            System.out.println("Enter your first number: ");
            firstNum = input.nextInt();
        } while (firstNum < 1);

        do {
            System.out.println("Enter your first number: ");
            secondNum = input.nextInt();
        } while (secondNum < 1);

        lastDigit = firstNum;
        currentDigit = secondNum;
        System.out.print(firstNum + ", " + secondNum + ", ");
        do {
            nextDigit = (lastDigit + currentDigit)%10;
            lastDigit = currentDigit;
            currentDigit = nextDigit;
            System.out.print(nextDigit + ", ");
        } while (lastDigit != firstNum && currentDigit != secondNum);
    }
}
