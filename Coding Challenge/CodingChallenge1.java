import java.util.Scanner;

public class CodingChallenge1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNum;

        do {
            System.out.println("Enter a positive number: ");
            userNum = input.nextInt();
        } while (userNum <= 0);

        for (int i = 1; i <= userNum; i++) {
            if (i % 4 == 0 && i % 6 == 0) {
                continue;
            } else if (i % 4 == 0 || i % 6 == 0) {
                System.out.println(i);
            }

        }
        input.close();
    }
}
