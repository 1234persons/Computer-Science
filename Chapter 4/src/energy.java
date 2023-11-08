import java.util.Scanner;
public class energy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double mass;
		double energy;
		double lightBulbs;
		
		System.out.print("Enter a mass: ");
		mass = input.nextDouble();
		input.close();
		energy = mass * ((3.0 * 100000000)*(3.0 * 100000000));
		lightBulbs = energy/360000;
		System.out.println("The energy produced in joules is: " + energy);
		System.out.print("The number of 100-watt lightbulbs powered is: " + lightBulbs);
	}

}
