import java.util.Scanner;

public class BetterIsoTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double lineNum;

        do {
        System.out.println("Enter the number of lines you would like: ");
        lineNum = input.nextInt();
        } while (lineNum <= 0);
        drawBar(lineNum);
        input.close();
    }

    public static void drawBar(double lineNum) {

        int unitNum = 1;
        String unit = "*";

        for (int i = 1; i <= lineNum; i ++) { //determines how many stars
            addSpaces(lineNum, i); 
            for (int j = 1; j <= unitNum; j++) { //prints the stars
                System.out.print(unit); 
            }
            unitNum += 2;
            System.out.println();
        }
    }
    public static void addSpaces(double lineNum, int i) {
        int spaceNum;
        String unit = " ";
        lineNum = (lineNum + 2)/2;
        spaceNum = (int)lineNum;
        int counter = 1;
        spaceNum += lineNum - 1;
        
        for (int j = i - 1; j <= spaceNum; j++) {
                    spaceNum -= counter;
                    for (int k = j; k<=spaceNum; k++) {
                        System.out.print(unit);
                        counter += 2;
                    }
                }
                
        }
    }

