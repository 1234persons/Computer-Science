import java.util.Scanner;
import java.lang.String;

public class ElapsedTimeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int startingTime;
        String userDay;
        int elapsedTime;
        int endingTime;
        int tempEndingTime;
        boolean day = false;
        boolean night = false;

        do {
            System.out.println("Enter the starting hour: ");
            startingTime = input.nextInt();
        } while (startingTime < 1);

        do {
            System.out.println("Enter whether it's am or pm:");
            userDay = input.next();

        } while (!userDay.equals("am") && !userDay.equals("pm"));

        if (userDay.equalsIgnoreCase("am")) {
            day = true;
        } else {
            night = true;
        }
        do {
            System.out.println("Enter the number of elapsed hours: ");
            elapsedTime = input.nextInt();
        } while (elapsedTime < 1);
        input.close();

        endingTime = startingTime + elapsedTime;
        tempEndingTime = endingTime;



        endingTime %= 12;

        if (endingTime == 0) {
            endingTime = 12;
        }

        if (endingTime < 12) {

            System.out.println("The ending time is: " + endingTime + ":00 " + userDay);

        } else if (endingTime > 12) {

            if (day) {
                userDay = "pm";
            } else {
                userDay = "am";
            }

            System.out.println("The ending time is: " + endingTime + ":00 " + userDay);

        } else if (endingTime == 12) {

            if (day) {
                userDay = "pm";
            } else {
                userDay = "am";
            }

            System.out.println("The ending time is: " + endingTime + ":00 " + userDay);
        }

    }

}
