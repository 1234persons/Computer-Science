import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOne;
        int numTwo;
        int temp =1;

        System.out.println("Enter a number: ");
        numOne = input.nextInt();

        System.out.println("Enter another number: ");
        numTwo = input.nextInt();
        input.close();
        while (numTwo > 0) {
            temp = numOne%numTwo;
            numOne = numTwo;
            numTwo = temp;
        }
        System.out.println("The greatest common divisor is: " + numOne);
    }
}
