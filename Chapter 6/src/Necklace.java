import java.util.Scanner;

public class Necklace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int firstNum;
        int secondNum;

        int firstDigit;
        int secondDigit;
        int thirdDigit;
        int counter = 0;


        do {
            System.out.println("Enter your first number: ");
            firstNum = input.nextInt();
        } while (firstNum < 1);

        do {
            System.out.println("Enter your first number: ");
            secondNum = input.nextInt();
        } while (secondNum < 1);

        firstDigit = firstNum;
        secondDigit = secondNum;
        System.out.print(firstNum + " " + secondNum + " ");

        do {
            thirdDigit = (firstDigit + secondDigit)%10;
            firstDigit = secondDigit;
            secondDigit = thirdDigit;
            System.out.print(secondDigit + " ");
            counter++;
        } while (firstDigit != firstNum || secondDigit != secondNum);
        input.close();
        System.out.println("It took " + counter + " iterations to close the necklace.");
    }
}
