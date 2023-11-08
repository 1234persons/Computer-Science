import java.util.Scanner;


public class Delivery {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double length;
		double width;
		double height;
		
		System.out.println("Enter the length: ");
		length = input.nextDouble();
		System.out.println("Enter the width: ");
		width = input.nextDouble();
		System.out.println("Enter the height: ");
		height = input.nextDouble();
		input.close();
		if (length >= 10 || width >= 10 || height >= 10) {
			System.out.println("Reject");
		} else {
			System.out.print("Accept");
		}
		
	}

}
