import java.text.NumberFormat;
import java.util.Scanner;


public class Eggs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		int eggsNum;
		int eggsExtra;
		int eggsDoz;
		double price;
		
		System.out.println("Enter the number of eggs purchased: ");
		eggsNum = input.nextInt();
		eggsDoz = eggsNum/12;
		eggsExtra = eggsNum%12;
		 
		
		if (eggsDoz < 4 && eggsDoz >= 0) {
			price = (eggsDoz * 0.5) + (eggsExtra * 0.5/12);
			System.out.println("The price is: " + money.format(price));
		} else if (eggsDoz < 6 && eggsDoz >= 4) {
			price = (eggsDoz * 0.45) + (eggsExtra * 0.45/12);
			System.out.println("The price is: " + money.format(price));
		} else if (eggsDoz < 11 && eggsDoz >= 6) {
			price = (eggsDoz * 0.40) + (eggsExtra * 0.40/12);
			System.out.println("The price is: " + money.format(price));
		} else if (eggsDoz > 11) {
			price = (eggsDoz * 0.35) + (eggsExtra * 0.35/12);
			System.out.println("The price is: " + money.format(price));
		}
		input.close();
		
		
		//System.out.print(eggsNum+ "words" + eggsDoz+ "words" + eggsExtra);
		
		

	}

}
