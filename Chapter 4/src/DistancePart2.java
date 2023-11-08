import java.util.Scanner;


public class DistancePart2 {

	public static void main(String[] args) {
		
		String name = "_";
		double first;
		double second;
		double third;
		double total;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the racers name: \n");
		name = input.nextLine();
		System.out.print("Enter the distance of the first segment: \n");
		first = input.nextDouble();
		System.out.print("Enter the distance of the second segment: \n");
		second = input.nextDouble();
		System.out.print("Enter the distance of the third segment: \n");
		third = input.nextDouble();
		input.close();
		total = first + second + third;
		
		System.out.print("Total distance that " + name + "ran is: " + total);
		
	}

}
