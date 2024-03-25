import java.util.Scanner;

public class BetterIsoTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lineNum;

        do {
            System.out.println("Enter the number of lines you would like: ");
            lineNum = input.nextInt();
        } while (lineNum <= 0);

        drawBar(lineNum);

        input.close();
    }

    // Calls the addspaces method and prints the number of astrisks corresponding to the line number
    public static void drawBar(int lineNum) {
        int counter = 1;
        for (int i = 1; i <= lineNum; i++) {
            addSpaces(lineNum, i);
            for (int j = 1; j <= counter; j++) {
                System.out.print("*");
            }
            counter += 2;
            System.out.println();
        }
    }

    // Prints the number of spaces based off the line number
    public static void addSpaces(int lineNum, int i) {

        for (int j = i - 1; j <= lineNum; j++) {
            System.out.print(" ");
        }

    }
}
