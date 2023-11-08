import java.util.Scanner;


public class Discriminant {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a;
		double b;
		double c;
		double discriminant;
		System.out.println("Enter the value for a: ");
		a = input.nextInt();
		System.out.println("Enter the value for b: ");
		b = input.nextInt();
		System.out.println("Enter the value for c: ");
		c = input.nextInt();
		input.close();
		 discriminant = Math.pow(b,2.0)-(4*a*c);
		 if (discriminant < 0) {
			System.out.println("No roots");
		 } else if (discriminant == 0) {
			System.out.println("One root");
		 } else if (discriminant > 0) {
			 System.out.println("Two roots");
		 }
		

	}

}
