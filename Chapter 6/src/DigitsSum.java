import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
		int num;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
        int digitsSum;
		
		System.out.print("Ener a three digit number: \n");
		num = input.nextInt();
		input.close();
		firstDigit = num/100;
		secondDigit = (num%100)/10;
		thirdDigit = (num%100)%10;
        digitsSum = firstDigit + secondDigit + thirdDigit;

        System.out.println("The sum of the digits is: " + digitsSum);

    }
}
