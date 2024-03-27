package DreamVacation;

import java.util.Scanner;

public class DreamVacationClient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DreamVacation normalVacation = new DreamVacation();
        
        String location;
        double cost;

        System.out.println("Enter the location of your dream vacation: ");
        location = input.nextLine();

        do {
            System.out.println("Enter the cost: ");
            cost = input.nextInt();
        } while (cost < 1);

        DreamVacation dream = new DreamVacation(location, cost);

        System.out.println("The price of your normal vacation to " + normalVacation.getDestination() + " would be " + normalVacation.getCost());
        System.out.println("The price of your dream vacation to " + dream.getDestination() + " would be " + dream.getCost());

        input.close();

    }
}
