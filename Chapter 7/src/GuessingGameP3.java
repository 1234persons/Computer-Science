import java.util.Random;
import java.util.Scanner;

public class GuessingGameP3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		Random rand =  new Random();
		 
        int userNum;
        int randomNum = rand.nextInt(20);

       // randomNum = (int)((20 - 1) * rand.nextInt() + 1);
        System.out.println(randomNum);
        do {
    	 System.out.println("Enter a number between 1 and 20: ");
         userNum = input.nextInt();
         hint(userNum, randomNum);
         
        } while (userNum != randomNum);
        System.out.println("You Win!!!!!!");
     input.close();
    }

    public static void hint(int userNum, int randomNum) {
        if (userNum < randomNum) {
            System.out.println("Higher");
        } else if (userNum > randomNum) {
            System.out.println("Lower");
        }
    }

}
