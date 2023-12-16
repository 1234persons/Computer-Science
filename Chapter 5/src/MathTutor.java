
import java.text.NumberFormat;
import java.util.Scanner;


public class MathTutor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double firstNum;
		double secondNum;
		double sum = 1;
		double userSum = 1;
		double firstRandom;
		double secondRandom;
		double operatorRandom;
	
		//operatorRandom = (5-1) * Math.random() + 1;
		operatorRandom = 4;
		firstRandom = (10-1) * Math.random() + 1;
		secondRandom = (10-1) * Math.random() + 1;
	
		firstNum = (int)firstRandom;
		secondNum = (int)secondRandom;
		operatorRandom = (int)operatorRandom;
		
		if (operatorRandom == 1) { 
			sum = firstNum * secondNum;
			System.out.println("What is " + firstNum + " * "  + secondNum + "?");
		} else if (operatorRandom == 2) { 
			sum = firstNum + secondNum;
			System.out.println("What is " + firstNum + "+"  + secondNum + "?");
		} else if (operatorRandom == 3) { 
			sum = firstNum - secondNum;
			System.out.println("What is " + firstNum + "-"  + secondNum + "?");
		} else if (operatorRandom == 4) { 
			sum = firstNum / secondNum;
			System.out.println("What is " + firstNum + "/"  + secondNum + "?");
		}
		System.out.println("Enter the answer: ");
		userSum = input.nextDouble();

		sum = Math.round(sum * 100.0) / 100.0;
		
		if (userSum == sum) {
			System.out.print("Correct");
		} else {
			System.out.print("Incorrect " + sum);
		}
		input.close();
	}

}
