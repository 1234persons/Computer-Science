import java.util.Scanner;

public class NecklaceP4 {
    public static void main(String[] args) {
        int first;
        int second;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter your first number: ");
            first = input.nextInt();
        } while (first < 0);
        do {
            System.out.println("Enter your second number: ");
            second = input.nextInt();
        } while (second < 0);
        input.close();

        System.out.print(" It took " + countNecklace(first, second) + " tries for the two numbers to go back to the original");
    }

    public static int countNecklace(int first, int second) {
        int originalone = first;
        int originaltwo = second;
        int count = 0;
        int total = 0;
        System.out.print(originalone + " " + originaltwo);
        do {
            total = (first + second) % 10;
            first = second;
            second = total;
            count += 1;
            System.out.print(" " + total);

        } while (first != originalone || second != originaltwo);
        System.out.println();
        return (count);
    }
}
