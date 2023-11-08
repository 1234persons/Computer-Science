import java.util.Scanner;
public class objectHeight {

	public static void main(String[] args) {
		
		double time;
		double height;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a time less than 4.5 seconds: ");		
		time = input.nextDouble();
		input.close();
		height = 100 - (4.9 * (time*time));
		System.out.print("The height of the object is: " + height + " meters");
	}

}
