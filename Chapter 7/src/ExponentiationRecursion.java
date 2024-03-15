import java.util.Scanner;

public class ExponentiationRecursion {

    public static int powerOf(int num, int exponent) {
        if (exponent == 1) return(num);
        return (num * powerOf(num, exponent - 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNumOne;
        int userNumTwo;
        int product;

        System.out.println("Enter the first number: ");
        userNumOne = input.nextInt();

        System.out.println("Enter the second number: ");
        userNumTwo = input.nextInt();
        input.close();

        product = powerOf(userNumOne, userNumTwo);
        System.out.println(product);
    }
}
