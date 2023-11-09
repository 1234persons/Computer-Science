import java.text.NumberFormat;
import java.util.Scanner;


public class PizzaCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		final double LABOR = 0.75;
		final double RENT = 1.00;
		double diameter;
		double cost;
		System.out.print("Enter the diameter of the pizza in inches: ");
		diameter = input.nextDouble();
		cost = (0.05 * (diameter * diameter)) + RENT + LABOR;
		System.out.print("The pizza cost is: " + money.format(cost));
		input.close();
	
	
	
	
	}

}
