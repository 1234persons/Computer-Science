import java.util.Scanner;
import java.util.String;

public class ElapsedTimeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String MORNING = "am";
        final String NIGHT = "pm";

        int startingTime;
        String userDay;
        int elapsedTime;
        int endingTime;

        System.out.println("Enter the starting hour: ");
        startingTime = input.nextInt();

        System.out.println("Enter whether it's am or pm:");
        userDay = input.next();

        System.out.println("Enter the number of elapsed hours: ");
        elapsedTime = input.nextInt();
        input.close();

        endingTime = startingTime + elapsedTime;

        if (endingTime < 12) {
            
            System.out.println(endingTime + ":00 " + userDay);

        } else if (endingTime >= 12) {
          
            endingTime = endingTime%12 ;
            
            if (endingTime == 0) { 
                endingTime = 12;
            } 

            if (userDay.compareToIgnoreCase(MORNING) == 0) { 
                userDay = NIGHT;
            } else if (userDay.compareToIgnoreCase(NIGHT) == 0) {
                userDay = MORNING;
            }

            System.out.println("The time is: " + endingTime + ":00 " + userDay);
        }

    }
}
