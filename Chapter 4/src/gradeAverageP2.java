import java.text.NumberFormat;
import java.util.Scanner;


public class gradeAverageP2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberFormat percent = NumberFormat.getPercentInstance();
		Double grade = 0.0;
		Double average;
		System.out.print("Enter your first grade: ");
		grade += input.nextDouble();
		
		System.out.print("Enter your second grade: ");
		grade += input.nextDouble();
		
		System.out.print("Enter your third grade: ");
		grade += input.nextDouble();
	
		System.out.print("Enter your fourth grade: ");
		grade += input.nextDouble();
		
		System.out.print("Enter your fifth grade: ");
		grade += input.nextDouble();
		
		input.close();
		average = grade/100/100;
		average = grade/5/100;
		System.out.print("Your grade average is: " + percent.format((average)));

	}

}
