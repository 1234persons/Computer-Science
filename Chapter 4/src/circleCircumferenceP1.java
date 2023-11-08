import java.util.Scanner;
public class circleCircumferenceP1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius;
		double circumference;
		final double PI = 3.14;
		
		System.out.print("Enter the radius: \n");
		radius = input.nextDouble();
		input.close();
		
		circumference = 2 * PI * radius;
		
		System.out.print("The circumference is: " + circumference);
		
		
		
		
	}

}
