import java.util.Scanner;
public class digitsTwo {

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
		System.out.println("The first digit is: " + firstDigit);
		System.out.println("The second digit is: " + secondDigit);
		System.out.println("The third digit is: " + thirdDigit);
	}

}
