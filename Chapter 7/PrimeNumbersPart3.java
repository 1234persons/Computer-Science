import java.util.Scanner;

public class PrimeNumbersPart3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userMin;
        int userMax;
        boolean prime;

        do {
            System.out.print("Enter a minimum: ");
            userMin = input.nextInt();
        } while (userMin < 0);

        do {
            System.out.print("Enter a maximum: ");
            userMax = input.nextInt();
        } while (userMax < userMin);
        input.close();

        if (userMin < 2) {
            userMin = 2;
        }

        for (int j = userMin; j <= userMax; j++) {
            
            prime = isPrime(j);

            if (prime) {
                System.out.println(j);
            }
        }

    }

    public static boolean isPrime(int currentNum) {

        boolean prime = true;

        for (int i = 2; i <= currentNum / 2; i++) {
            if (currentNum%i == 0 ) {
                prime = false;
                break;
            }
        }

        if (prime) {
            return (true);
        } else {
            return (false);
        }
    }

}
