import java.text.NumberFormat;
import java.util.Scanner;
public class project {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double design;
		double code;
		double debug;
		double test;
		double total;
		double designPercent;
		double codePercent;
		double debugPercent;
		double testPercent;
		NumberFormat percent = NumberFormat.getPercentInstance();
		System.out.print("Enter the number of minutes spent on the following project tasks: \n");
		System.out.print("Enter the amount of time spent designing: ");
		design = input.nextInt();
		System.out.print("Enter the amount of time spent Coding: ");
		code = input.nextInt();
		System.out.print("Enter the amount of time spent Debugging: ");
		debug = input.nextInt();
		System.out.print("Enter the amount of time spent Testing: ");
		test = input.nextInt();
		input.close();
		total = design + code + debug + test;
		
		designPercent = design/total;
		codePercent = code/total;
		debugPercent = debug/total;
		testPercent = test/total;
		System.out.format("%-10s %1s", "Task", "Percentage\n");
		System.out.println("Design: " + percent.format(designPercent));
		System.out.println("Code: " + percent.format(codePercent));
		System.out.println("Debugging: " + percent.format(debugPercent));
		System.out.println("Test: " + percent.format(testPercent));
		
	}

}
