import java.text.NumberFormat;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double principal;
		double years;
		double interest;
		double amount;
		
		System.out.print("Enter the principal: ");
		principal = input.nextDouble();
		System.out.print("Enter the years: ");
		years = input.nextDouble();
		System.out.print("Enter the interest rate: ");
		interest = input.nextDouble();
		input.close();
		amount = (1 + years * (interest/100))*principal;
		System.out.print("The amount after the term is: " + money.format(amount));
		
		

	}

}
