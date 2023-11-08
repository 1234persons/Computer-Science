import java.util.Scanner;


public class CircleCircumferenceP2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius;
		double circumference;
		final double PI = 3.14;
		
		System.out.print("Enter the radius: \n");
		radius = input.nextDouble();
		input.close();
		
		circumference = 2 * PI * radius;
		
		if (radius < 0) {
		
			System.out.println("Negative Radii are illegal");
		
		} else {
			
			System.out.print("The circumference is: " + circumference);
			
		}
		
	}

}
