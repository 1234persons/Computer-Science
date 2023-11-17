import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;
public class AddCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double quarters;
        double dimes;
        double nickels;
        double pennies;

        System.out.println("Enter the amount of quarters: ");
        quarters = input.nextDouble();

        System.out.println("Enter the amount of dimes: ");
        dimes = input.nextDouble();

        System.out.println("Enter the amount of nickels: ");
        nickels = input.nextDouble();
        
        System.out.println("Enter the amount of pennies: ");
        pennies = input.nextDouble();

        getDollarAmount(quarters, dimes, nickels, pennies);
        input.close();
    }
    public static void getDollarAmount(double quarters, double dimes, double nickels, double pennies) {
        NumberFormat money = NumberFormat.getCurrencyInstance();
        quarters = (quarters/100) * 25;
        dimes = (dimes/100) * 10;
        nickels = (nickels/100) * 5;
        pennies = pennies/100;
        double dollarAmount;
        
        dollarAmount = quarters + dimes + nickels + pennies;

        System.out.println("The total is: " + money.format(dollarAmount));


    }
}
