import java.util.*;
import java.lang.String;

public class AccountSetupPart2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a username: ");
        String username = input.nextLine();
        int passwordLength;
        String password;
        String[] symbol = { "`", "~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "-", "=", "+", "{", "}",
                "[", "]", "|", ";", ":", "'", "<", ">", ",", ".", "/", "?" }; 

        while (true) {
            System.out.print(
                    "Please input a password that is at least 8 characters, Has an uppercase letter, a lowercase letter, and a symbol: ");
            password = input.nextLine();
            passwordLength = password.length();

            boolean hasUpper = false, hasLower = false, hasSymbol = false, hasNumber = false;

  
            for(int i = 0; i < password.length(); i++) {
                if(password.charAt(i) >= 65 && password.charAt(i) <=90){
                    hasUpper = true;
                }
            }

              for(int i = 0; i < password.length(); i++) {
                if(password.charAt(i) >= 97 && password.charAt(i) <=122){
                    hasLower = true;
                }
            }

            for(int i = 0; i < password.length(); i++) {
                if(password.charAt(i) >= 0 && password.charAt(i) <=9){
                    hasNumber = true;
                }
            }

            for (String c : symbol) {
                if (password.contains(c)) {
                    hasSymbol = true;
                }
            }

            if (hasUpper && hasLower && hasSymbol && hasNumber && passwordLength >= 8) {
                break;
            }
        }
        input.close();
        System.out.print(
                "Your username is " + username + " and your password is " + password);
    }
}