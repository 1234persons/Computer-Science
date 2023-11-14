import java.util.Scanner;

public class NumberSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNum;
        int num = 0;

        System.out.println("Enter a number: ");
        userNum = input.nextInt();
        input.close();
        while (num != userNum) {
            num += 1;
            System.out.println(num);
        }

    }
}
