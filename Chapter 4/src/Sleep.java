import java.text.NumberFormat;
import java.util.Scanner;
public class Sleep {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int birthYear;
		int currentYear;
		int birthMonth;
		int currentMonth;
		int birthDay;
		int currentDay;
		int aliveDays;
		int sleepTime;
		NumberFormat number = NumberFormat.getNumberInstance();
		System.out.println("Enter your birth year: ");
		birthYear = input.nextInt();
		System.out.println("Enter your birth month: ");
		birthMonth = input.nextInt();
		System.out.println("Enter your birth day: ");
		birthDay = input.nextInt();
		System.out.println("Enter the current year: ");
		currentYear = input.nextInt();
		System.out.println("Enter the current month: ");
		currentMonth = input.nextInt();
		System.out.println("Enter the current day: ");
		currentDay  = input.nextInt();
		input.close();
		aliveDays = (currentYear - birthYear)*365 + (currentMonth - birthMonth)* 30 + (currentDay - birthDay);
		System.out.print("You've been alive for " + number.format(aliveDays) + " days\n");
		sleepTime = aliveDays * 8;
		System.out.print("You've been asleep for " + number.format(sleepTime) + " hours");
		
	}

}
