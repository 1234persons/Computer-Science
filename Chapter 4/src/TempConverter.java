import java.util.Scanner;
public class TempConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	Double fah;
	Double cel;
	System.out.print("Enter the temperature in fahrenheit: ");
	fah = input.nextDouble();
	input.close();
	cel = (fah - 32)* ((double)5/9);
	
	System.out.print("The temperature is: " + cel + " Celcius");
	}

}
