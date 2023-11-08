import java.util.Scanner;


public class digits {

	public static void main(String[] args) {
		Integer num;
		Integer integerOne;
		Integer integerTwo;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a two digit number: ");
		num = input.nextInt();
		input.close();
		Math.round(integerOne =  num/10);
		Math.round(integerTwo = num%10);
		System.out.println("First digit is: " + integerOne);
		System.out.println("Second digit is: " + integerTwo );
		
		
		
		
		
		
	}

}
