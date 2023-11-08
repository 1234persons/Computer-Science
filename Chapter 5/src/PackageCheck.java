import java.util.Scanner;


public class PackageCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
		double length;
		double width;
		double height;
		double weight;
		double size;
		
		System.out.println("Enter the length in centimeters: ");
		length = input.nextDouble();
		System.out.println("Enter the width in centimeters: ");
		width = input.nextDouble();
		System.out.println("Enter the height in centimeters: ");
		height = input.nextDouble();
		System.out.println("Enter the weight in kilograms: ");
		weight = input.nextDouble();
		
		size = length * width * height;
		
		if (size > 100000 && weight > 27 ) {
			System.out.println("Too large and heavy");
		} else if (size > 100000 && weight < 27) {
			System.out.print("Too large");
		} else if (weight > 27 && size < 100000) {
			System.out.print("Too heavy");
		} else {
			System.out.print("Accept");
		}
			
	}

}
