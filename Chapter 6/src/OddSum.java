import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNum;
        int sum = 0;

        do {
        System.out.println("Enter a number: ");
        userNum = input.nextInt();
        } while (userNum < 0);
        
        input.close();

        for (int i = 1; i <= userNum; i++ ) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println(userNum);
        System.out.println("The sum of each odd number is: " + sum);
    }
}
