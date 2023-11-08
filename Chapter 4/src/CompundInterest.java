import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Scanner;
import java.lang.Math;
public class CompundInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double future; //future value of loan including interest
		double rate; //annual interest rate
		double time; //years money is invested
		double number; //number of times interest is compounded per year
		double principal; //principal investment amount
		
		System.out.println("Enter the future value of the investment: (A)");
		future = input.nextDouble();
		
		System.out.println("Enter the annual investment rate: (r)");
		rate = input.nextDouble();
		
		System.out.println("Enter the number of times the interest is compunded per year: (n)");
		number = input.nextDouble();
		
		System.out.println("Enter the years that the money has been invested: (t)");
		time = input.nextDouble();
		
		principal = future/Math.pow((1+rate/number), (number*time));

		System.out.print("The principal investment amount is: " + money.format(principal));
		
	}

}
