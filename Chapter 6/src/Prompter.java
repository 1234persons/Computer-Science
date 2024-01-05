import java.util.Scanner;

public class Prompter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int min;
        int max;
        int userNum;
        System.out.println("Enter a minimum number: ");
        min = input.nextInt();

        do {
            System.out.println("Enter a maximum number: ");
            max = input.nextInt();
        } while (max < min);

        do {
            System.out.println("Enter a number in the range of the first two numbers: ");
            userNum = input.nextInt();
        } while (userNum > max || userNum < min);

        input.close();

    }
}
