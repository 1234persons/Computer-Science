import java.util.Scanner;


public class QuadraticEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 
       
        double aNum;
        double bNum;
        double cNum;
        double rootOne;
        double rootTwo;
        
        System.out.print("Enter a value for A: ");
        aNum = input.nextInt();
        
        System.out.print("Enter a value for B: ");
        bNum = input.nextInt();
        
        System.out.print("Enter a value for C: ");
        cNum = input.nextInt();
        
        rootOne = (-bNum + Math.sqrt(Math.pow(bNum, 2) - 4.0*aNum*cNum))/(2.0*aNum);
        rootTwo = (-bNum - Math.sqrt(Math.pow(bNum, 2) - 4.0*aNum*cNum))/(2.0*aNum);
        System.out.println("The roots are: " + rootOne + " and " + rootTwo);
        
	}

}
