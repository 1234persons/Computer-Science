import java.text.NumberFormat;
import java.util.Scanner;


public class MathTutor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int firstNum;
		int secondNum;
		int sum = 1;
		int userSum = 1;
		double firstRandom;
		double secondRandom;
		double operatorRandom;
	
		operatorRandom = (4-1) * Math.random() + 1;
		firstRandom = (10-1) * Math.random() + 1;
		secondRandom = (10-1) * Math.random() + 1;
	
		firstNum = (int)firstRandom;
		secondNum = (int)secondRandom;
		operatorRandom = (int)operatorRandom;
		
		if (operatorRandom == 1) { 
			sum = firstNum * secondNum;
			System.out.println("? = " + firstNum + "*"  + secondNum);
		} else if (operatorRandom == 2) { 
			sum = firstNum + secondNum;
			System.out.println("? = " + firstNum + "+"  + secondNum);
		} else if (operatorRandom == 3) { 
			sum = firstNum - secondNum;
			System.out.println("? = " + firstNum + "-"  + secondNum);
		} else if (operatorRandom == 4) { 
			sum = firstNum / secondNum;
			System.out.println("? = " + firstNum + "/"  + secondNum);
		}
		System.out.println("Enter the answer: ");
		userSum = input.nextInt();
		
		if (userSum == sum) {
			System.out.print("Correct");
		} else {
			System.out.print("Incorrect");
		}

	}

}
