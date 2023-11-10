import java.util.Scanner;



public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNum;
        boolean prime = true;
      
        System.out.print("Enter a number: ");
        userNum = input.nextInt();
        input.close();
        
        for (int i = 2; i <= userNum / 2; i++) {
            if (userNum%i == 0 ) {
                prime = false;
                break;
            }
        }
            
        if (prime == false) {
        System.out.println("Your number is not prime");
        } else {
        System.out.println("Your number is prime");
        }
        
    }
}
