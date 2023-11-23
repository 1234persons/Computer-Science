import java.util.Scanner;

public class WorkingDisplayBox {
    public static void drawBar(int width, int length) {
        String side = "*";

        while (side.length() != width - 1) {
            side = side + " ";
        }
        for (int i = 1; i <= width; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j = 1; j <= length - 2; j++) {
            System.out.println(side + "*");
        }
        for (int i = 1; i <= width; i++) {
            System.out.print("*");
        }
    }
    public static void drawBar(int width, int length, String userUnit) {

        String sideUnit = userUnit;
        String side = sideUnit;
        while (side.length() != width - 1) {
            side = side + " ";
        }
        for (int i = 1; i <= width; i++) {
            System.out.print(sideUnit);
        }
        System.out.println();

        for (int j = 1; j <= length - 2; j++) {
            System.out.println(side + sideUnit);
        }
        for (int i = 1; i <= width; i++) {
            System.out.print(sideUnit);
        }
    }

    public static void drawBox(int width, int length) {
        Scanner input = new Scanner(System.in);
        String userChoice;
        String userUnit;
        
        System.out.println("Do you want to enter a specific unit to make the box out of? Enter y for yes and n for no: ");
        userChoice = input.next();

        if (userChoice.equals("y") == true) {
            System.out.println("Enter the unit of your choice: ");
            userUnit = input.next();

            drawBar(width, length, userUnit);
        } else {
            drawBar(width, length);
        }
        input.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userWidth;
        int userLength;


        System.out.println("Enter the width of the box: ");
        userWidth = input.nextInt();


        System.out.println("Enter the length of the box: ");
        userLength = input.nextInt();

        drawBox(userWidth, userLength); 
                input.close();       
    }
}
