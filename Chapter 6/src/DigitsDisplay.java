import java.util.Scanner;

public class DigitsDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int num;
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		
		System.out.print("Ener a three digit number: \n");
		num = input.nextInt();
		input.close();

		firstDigit = num/100;
		secondDigit = (num%100)/10;
		thirdDigit = (num%100)%10;
		
		System.out.println(firstDigit);
		System.out.println(secondDigit);
		System.out.println(thirdDigit);
    }
}
