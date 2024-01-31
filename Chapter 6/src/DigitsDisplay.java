
import java.util.Scanner;

public class DigitsDisplay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;


		System.out.print("Ener a number: \n");
		num = input.nextInt();
		input.close();

		while (num >= 1) {
			System.out.println(num % 10);
			num /= 10;

		}

	}
}
