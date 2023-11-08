import java.text.NumberFormat;
import java.util.Scanner;
public class collegeCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		//cost = books, rent, tuition - scholarships, grants
		double rent;
		double tuition;
		double books;
		double scholarships;
		double grants;
		double totalCost;
		
		System.out.print("Enter the cost of rent: \n");
		rent = input.nextDouble();

		System.out.print("Enter the cost of tuition: \n");
		tuition = input.nextDouble();

		System.out.print("Enter the cost of books: \n");
		books = input.nextDouble();

		System.out.print("Enter the cost of scholarships: \n");
		scholarships = input.nextDouble();

		System.out.print("Enter the cost of grants: \n");
		grants = input.nextDouble();
		
		totalCost = rent + tuition + books - scholarships - grants;
		
		System.out.print("The total cost of college will be: " + money.format(totalCost));
		
	}

}
