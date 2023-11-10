import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int userNum;
        int factorial = 1;
        
        System.out.println("Enter a number: ");
        userNum = input.nextInt();
        input.close();
        for (int i = 1; i <= userNum; i++ ) {
            factorial = factorial * i;
            
        }
        
        System.out.println("The factorial of " + userNum + " is " + factorial);

    }
}
