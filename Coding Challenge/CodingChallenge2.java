import java.util.Scanner;

public class CodingChallenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNum;
        int nextUserNum;
        int change;
        int changeSum = 0;

        do {

            do {
                System.out.println("Enter your current height above sea level: (-1 to quit)");
                userNum = input.nextInt();
            } while (userNum != -1 && userNum < 1);

            if (userNum == -1) {
                break;
            }

            do {
            System.out.println("Enter your next height: ");
            nextUserNum = input.nextInt();
            } while (nextUserNum < 1);

            change = Math.abs(userNum - nextUserNum);
            changeSum += change;
            
            System.out.println("The sum of the changes in height is: " + changeSum);
        } while (true);

        System.out.println("Have a good day!");
        input.close();
    }
}
