import java.util.Scanner;

public class CodingChallenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNum;
        int changeSum = 0;

        do {
            do {
                System.out.println("Enter your current height above sea level: (-1 to quit)");
                userNum = input.nextInt();
            } while (userNum != -1 && userNum < 1);

            if (userNum == -1) {
                break;
            }
 
            System.out.println("Enter your next height: ");
            changeSum += Math.abs(userNum - input.nextInt());

            System.out.println("The sum of the changes in height is: " + changeSum + "\n");
        } while (true);
        input.close();
    }
}