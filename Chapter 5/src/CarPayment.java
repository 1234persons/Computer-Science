import java.text.NumberFormat;
import java.util.Scanner;


public class CarPayment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
        double principal;
        double interestRate;
        double numberOfPayments;
        double monthlyPayment;
        
        System.out.println("Enter the principal owing: ");
        principal = input.nextDouble();
        
        System.out.println("Enter the interest rate: ");
        interestRate = input.nextDouble();
        
        System.out.println("Enter the number of monthly payments made: ");
        numberOfPayments = input.nextDouble();
        input.close();
        monthlyPayment = (principal * (interestRate/12))/(1 - Math.pow((1 + interestRate/12), -numberOfPayments));
        System.out.print("The monthly payment is: " + money.format(monthlyPayment));
	}

}
