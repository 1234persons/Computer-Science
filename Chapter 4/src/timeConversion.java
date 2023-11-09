import java.util.Scanner;
public class timeConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int time;
		int hours;
		int minuteTens;
		int minuteOnes;
		
		System.out.print("Enter the time in minutes: ");
		time = input.nextInt();
		hours = time/60;
		minuteTens = (time%60)/10;
		minuteOnes = (time%60)%10;
		input.close();
		System.out.print("The time is: " + hours + ":" + minuteTens + minuteOnes);
		
	}

}
