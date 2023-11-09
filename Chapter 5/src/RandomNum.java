import java.util.Scanner;


public class RandomNum {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double minimum;
		double maximum;
		double random;
		
		System.out.println("Enter the minimum: ");
		minimum = input.nextInt();
		System.out.println("Enter the maximum: ");
		maximum = input.nextInt();
		input.close();
		random = (maximum - minimum) * Math.random() + minimum;
		
		System.out.print("The random number is: " + (int)random);

	}

}
