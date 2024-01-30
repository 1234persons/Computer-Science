import java.util.ArrayList;
import java.util.Scanner;

public class DigitsDisplay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		ArrayList digits[] = new int[];

		System.out.print("Ener a number: \n");
		num = input.nextInt();
		input.close();

		while (num >= 1) {
			digits.add(num % 10);
			System.out.println(num % 10);
			num /= 10;

		}

	}
}
