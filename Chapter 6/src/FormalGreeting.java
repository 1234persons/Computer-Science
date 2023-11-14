import java.util.Scanner;
import java.lang.String;

public class FormalGreeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName;
        String greeting;

        System.out.println("Enter your name including title: ");
        userName = input.nextLine();
        input.close();

        if (userName.startsWith("Mr. ")) {
            greeting = "Hello sir";
            System.out.println(greeting);
        } else if (userName.startsWith("Miss") || userName.startsWith("Mrs. ") || userName.startsWith("Ms. ")) { 
            greeting = "Hello ma'am";
            System.out.println(greeting);
        }

    }
}
