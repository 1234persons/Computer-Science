import java.util.Scanner;

public class Exponentiation {

    public static double powerOf(double num, double exponent) {
       double originalNum = num;
        for (int i = 1; i < exponent; i++) {
            num = num * originalNum;
        }
        return(num);
    }
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        double userNumOne;
        double userNumTwo;
        double product;

        System.out.println("Enter the first number: ");
        userNumOne = input.nextInt();

        System.out.println("Enter the second number: ");
        userNumTwo = input.nextInt();
        input.close();

        product = powerOf(userNumOne, userNumTwo);
        System.out.println(product);
    }
}

