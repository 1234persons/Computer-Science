import java.util.Scanner;
public class Prompter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int firstNum;
        int secondNum;
        int userNum;

        System.out.println("Enter a minimum: ");
        firstNum = input.nextInt();
        
        System.out.println("Enter a Maximum: ");
        secondNum = input.nextInt();

        System.out.println("Enter a number within the entered range: ");
        userNum = input.nextInt();  

        while(userNum < firstNum || userNum > secondNum) {
            System.out.println("Enter a number within the entered range: ");
            userNum = input.nextInt();
        }
        input.close();
        System.out.println("Good job following directions!!!!");

    }
}
