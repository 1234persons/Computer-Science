import java.util.Scanner;


public class SurfsUp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double waves;
		System.out.print("Enter the wave height: ");
		waves = input.nextDouble();
		
		
		if (waves >= 6) {
		System.out.print("Great day for surfing!");
		
		} else if (waves >=3) {
				System.out.print("Go body boarding");
			} else {
				System.out.print("Go swimming");
			}
			
		
		
		
		
	}

}
