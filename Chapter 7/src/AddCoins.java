import java.util.Scanner;
import java.text.NumberFormat;

public class AddCoins {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double quarters;
        double dimes;
        double nickels;
        double pennies;
        String total;

        System.out.println("Enter the amount of quarters: ");
        quarters = input.nextDouble();

        System.out.println("Enter the amount of dimes: ");
        dimes = input.nextDouble();

        System.out.println("Enter the amount of nickels: ");
        nickels = input.nextDouble();

        System.out.println("Enter the amount of pennies: ");
        pennies = input.nextDouble();

        total = getDollarAmount(quarters, dimes, nickels, pennies);

        System.out.println("The total is: " + total);
        input.close();
    }

    public static String getDollarAmount(double quarters, double dimes, double nickels, double pennies) {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        quarters = (quarters / 100) * 25;
        dimes = (dimes / 100) * 10;
        nickels = (nickels / 100) * 5;
        pennies = pennies / 100;
        String dollarAmount = money.format(quarters + dimes + nickels + pennies);
        return (dollarAmount);

    }
}
