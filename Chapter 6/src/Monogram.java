import java.util.Scanner;

public class Monogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName;
        String middleName;
        String lastName;
        String firstInitial;
        String secondInitial;
        String thirdInitial;

        System.out.println("Enter your first name: ");
        firstName = input.next();
        firstInitial = firstName.substring(0, 1);
        firstInitial = firstInitial.toLowerCase();

        System.out.println("Enter your second name: ");
        middleName = input.next();
        secondInitial = middleName.substring(0, 1);
        secondInitial = secondInitial.toLowerCase();
        
        System.out.println("Enter your third name: ");
        lastName = input.next();
        thirdInitial = lastName.substring(0, 1);
        thirdInitial = thirdInitial.toUpperCase();
        input.close();
        System.out.println(firstInitial+thirdInitial+secondInitial);


    }
}
