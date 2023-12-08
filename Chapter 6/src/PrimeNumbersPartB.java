import java.util.Scanner;


public class PrimeNumbersPartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userMin;
        int userMax;
        boolean prime;
      
        System.out.print("Enter a minimum: ");
        userMin = input.nextInt();

        System.out.print("Enter a maximum: ");
        userMax = input.nextInt();
        input.close();
        
        if (userMin < 2) {
            userMin = 2;
        }

        for (int j = userMin; j <= userMax; j++) {
            prime = true;
            for (int i = 2; i < j; i++) {
                if (j%i == 0 ) {
                    prime = false;
                }
            }
        if (prime) {
                System.out.println(j);
            }
        }

    }
}

