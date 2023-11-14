import java.text.NumberFormat;
import java.util.Scanner;

public class PercentPassing {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        NumberFormat percent = NumberFormat.getPercentInstance();
       
        final int FLAG = -1;
        int userNum = 0;
        double goodScores = 0;
        double totalScores = 0;
        double scoresPercent;
       
        while (userNum != FLAG) {
           
            System.out.println("Enter a score: (-1 to quit)");
            userNum = input.nextInt();
           input.close();
            
            if (userNum > 70) {
                goodScores += 1;
                totalScores += 1;
            } else {
                totalScores += 1;
            }
        }

        scoresPercent = goodScores/(totalScores - 1);

        System.out.println("The percent of scores above 70% is: " + percent.format(scoresPercent));

    }
}
