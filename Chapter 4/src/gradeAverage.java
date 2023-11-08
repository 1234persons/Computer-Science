import java.text.NumberFormat;
import java.util.Scanner;
public class gradeAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberFormat percent = NumberFormat.getPercentInstance();
		double gradeOne;
		double gradeTwo;
		double gradeThree;
		double gradeFour;
		double gradeFive;
		double average;
		System.out.print("Enter five grades: ");
		gradeOne = input.nextDouble();
		gradeTwo = input.nextDouble();
		gradeThree = input.nextDouble();
		gradeFour = input.nextDouble();
		gradeFive = input.nextDouble();
		input.close();
		average = (gradeOne + gradeTwo + gradeThree + gradeFour + gradeFive)/5;
		System.out.print("Your grade average is: " + (percent.format(average)));
	}

}
