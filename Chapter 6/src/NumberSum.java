import java.util.Scanner;

public class NumberSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNum;
        int num = 0;
        int sum = 0;
//doesn't print the sum
        
        do {
        System.out.println("Enter a number: ");
        userNum = input.nextInt();
        } while (userNum < 0);

        input.close();

        while (num != userNum) {
            num += 1;
            System.out.println(num);
            sum += num;
        }
        System.out.println(sum);

    }
}
