import java.util.Scanner;


public class GuessingGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		 
        int userNum = 0;
        double randomNum;

        randomNum = (20 - 1) * Math.random() + 1;
        randomNum = (int)randomNum;
     
        while (userNum != randomNum) {
    	 System.out.println("Enter a number between 1 and 20: ");
         userNum = input.nextInt();
         
       //  System.out.println((int)randomNum);
       //  System.out.println((int)userNum);
         
         if (userNum > randomNum) {
         	System.out.println("Lower");
         } else if (userNum < randomNum) {
         	System.out.println("Higher");
         } else {
        	 System.out.print("You Win");
         }
     }
     input.close();

        
	}

}
