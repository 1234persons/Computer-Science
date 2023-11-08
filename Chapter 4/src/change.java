import java.util.Scanner;
public class change {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double change;
		double quarters; // change mod 25
		double dimes; // change mod 25 int 10
		double nickels; // change mod 25 mod 10 int 5
		double pennies; //  change mod 25 mod 10 mod 5
		System.out.print("Enter an amount of money less than $1.00\n");
		change = input.nextDouble();
		input.close();
		quarters = (int)change / 25;
		dimes = ((int)change % 25)/10;
		nickels = (((int)change % 25)%10)/5;
		pennies = ((((int)change % 25)%10)%5);
		System.out.print("There are " + quarters + " quarters\n");
		System.out.print("There are " + dimes + " dimes\n");
		System.out.print("There are " + nickels + " nickels\n");
		System.out.print("There are " + pennies + " pennies\n");
	}

}
