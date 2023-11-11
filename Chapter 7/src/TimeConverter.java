import java.util.Scanner;

public class TimeConverter {
    int hours;
    int minutes;
    public static void HoursToMinutes() {
       Scanner input = new Scanner(System.in);
        int hours;
        int minutes;
        
        System.out.println("Enter the amount of hours: ");
            hours = input.nextInt();
            input.close();
            minutes = hours * 60;
        System.out.println(hours + " hours is " + minutes + " minutes");
    }
    
    public static void MinutesToHours() {
        Scanner input = new Scanner(System.in);
        int minutes;
        int hours;
        
        System.out.println("Enter the amount of minutes: ");
            minutes = input.nextInt();
            input.close();
            hours = minutes/60;
        System.out.println(minutes + " minutes is " + hours + " hours");
    }

    public static void DaysToHours() {
        Scanner input = new Scanner(System.in);
        int days;
        int hours;

        System.out.println("Enter the amount of days: ");
            days = input.nextInt();
            input.close();
            hours = days*24;
        System.out.println(days + " days is " + hours + " hours");
    }

    public static void HoursToDays() {
        Scanner input = new Scanner(System.in);
        int days;
        int hours;

        System.out.println("Enter the amount of hours: ");
            hours = input.nextInt();
            input.close();
            days = hours / 24;
        System.out.println(hours + " hours is " + days + " days");
    }

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int userChoice;
        System.out.println("1. Hours to minutes");
        System.out.println("2. Minutes to hours");
        System.out.println("3. Days to hours");
        System.out.println("4. Hours to days");
        System.out.println("Enter your choice: ");
        userChoice = input.nextInt();
        
        if (userChoice == 1) {
            HoursToMinutes();
        } else if (userChoice == 2) {
            MinutesToHours();
        } else if (userChoice == 3) {
            DaysToHours();
        } else if (userChoice == 4) {
            HoursToDays();
        }
        input.close();
    }
}
