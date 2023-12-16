import java.util.Scanner;
import java.lang.String;

public class FormalGreeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName;
        String name;

        System.out.println("Enter your name including title: ");
        userName = input.nextLine();
        name = userName;
        input.close();
        userName = userName.toLowerCase();
        if (userName.startsWith("mr. ")) {
            System.out.println("Hello sir");
        } else if (userName.startsWith("miss") || userName.startsWith("mrs. ") || userName.startsWith("ms. ")) { 
            System.out.println("Hello ma'am");
        } else {
            System.out.println("Hello, " + name);
        }

    }
}
