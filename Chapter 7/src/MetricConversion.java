import java.util.Scanner;

public class MetricConversion {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        int userChoice;
        double userNum;
        double inches, centimeters, feet, yards, meters, miles, kilometers;
        System.out.println("Enter a number: ");
        userNum = input.nextDouble();
        System.out.println("1. Inches to centimeters 2. Centimeters to inches");
        System.out.println("3. Feet to Centimeters 4. Centimeters to Feet");
        System.out.println("5. Yards to meters 6. Meters to yards");
        System.out.println("7. Miles to kilometers 8. Kilometers to miles");
        System.out.println("Enter your choice: ");
        userChoice = input.nextInt();

        switch(userChoice) {
            case 1: centimeters = inchesToCentimeters(userNum);
                    System.out.println(userNum + " inches is " + centimeters + " centimeters");
                    break;
            case 2: inches = centimetersToInches(userNum);
                    System.out.println(userNum + " centimeters is " + inches + " inches");
                    break;
            case 3: centimeters = feetToCentimeters(userNum);
                    System.out.println(userNum + " feet is " + centimeters + " centimeters");
                    break;
            case 4: feet = centimetersToFeet(userNum);
                    System.out.println(userNum + " centimeters is " + feet + " feet");
                    break;
            case 5: meters = yardsToMeters(userNum);
                    System.out.println(userNum + " yards is " + meters + " meters");
                    break;
            case 6: yards = metersToYards(userNum);
                    System.out.println(userNum + " meters is " + yards + " yards");
                    break;
            case 7: kilometers = milesToKilometers(userNum);
                    System.out.println(userNum + " miles is " + kilometers + " kilometers");
                    break;
            case 8: miles = kilometersToMiles(userNum);
            System.out.println(userNum + " kilometers is " + miles + " miles");
                    break;
        }
        input.close();
    }

    public static double inchesToCentimeters(double userNum) {
       double centimeters;
        centimeters = userNum * 2.54;
        return(centimeters);
    }
    public static double centimetersToInches(double userNum) {
       double inches;
        inches = userNum / 2.54;
        return(inches);
    }
    public static double feetToCentimeters(double userNum) {
        double centimeters;
        centimeters = userNum * 30;
        return(centimeters);
    }
    public static double centimetersToFeet(double userNum) {
        double feet;
        feet = userNum/30;
        return(feet);
    }
    public static double yardsToMeters(double userNum) {
        double meters;
        meters = userNum * 0.91;
        return(meters);
    }
    public static double metersToYards(double userNum) {
        double yards;
        yards =  userNum / 0.91;
        return(yards);
    }
    public static double milesToKilometers(double userNum) {
        double kilometers;
        kilometers = userNum * 1.6;
        return(kilometers);
    }
    public static double kilometersToMiles(double userNum) {
        double miles;
        miles = userNum/1.6;
        return(miles);
    }

}
