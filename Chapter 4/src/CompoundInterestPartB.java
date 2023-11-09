import java.text.NumberFormat;
import java.util.Scanner;


public class CompoundInterestPartB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double future; //future value of loan including interest
		double rate; //principal investment amount//annual interest rate
		double time; //years money is invested
		double numbers; //number of times interest is compounded per year
		double principal; //principal investment amount
		NumberFormat number = NumberFormat.getNumberInstance();
		System.out.println("Enter the future value of the investment: (A)");
		future = input.nextDouble();
		
		System.out.println("Enter the annual interest rate: (r)");
		rate = input.nextDouble();
		
		System.out.println("Enter the number of times the interest is compunded per year: (n)");
		numbers = input.nextDouble();
		
		System.out.println("Enter the principal investment amount: (p)");
		principal = input.nextDouble();
		input.close();
		time = (Math.log10(future/principal))/(numbers*(Math.log10(1+rate/numbers)));
	
		System.out.print("The principal investment amount is: " + number.format(time) + " years");
		
	}

}
