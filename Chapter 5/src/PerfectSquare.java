import java.util.Scanner;


public class PerfectSquare {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		int number;
		int originalNumber;
		double square;
		
		
		System.out.println("Enter an integer: ");
		number = input.nextInt();
		originalNumber = number;
		input.close();
		
		square = Math.sqrt(number);
		square = (double)square;
		square = Math.pow((int)square, 2);
		
		if (square == originalNumber) {
			System.out.println((int)number + " is a perfect square");
		} else {
			System.out.println((int)number + " is not a perfect square");
		}
		
		
		

	}

}
