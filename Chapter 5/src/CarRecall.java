
import java.util.Scanner;


public class CarRecall {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		 
	        int modelNumber;
	        boolean defective = false;

	        System.out.print("Please input your cars model number: ");
	        modelNumber = input.nextInt();
			input.close();
	        switch (modelNumber) {
	            case 119:
	            case 179:
				case 189:
				case 190:
				case 191:
				case 192:
				case 193:
				case 194:
				case 195:
				case 196:
	            case 221:
	            case 780:
	                defective = true;
					break;
				
	        }


	        if (defective) {
	            System.out.println("Your car has been recalled.");
	        } else {
	            System.out.println("No recalls for this vehicle.");
	        }

	}

}
