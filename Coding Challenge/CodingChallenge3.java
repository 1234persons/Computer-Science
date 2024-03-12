import java.util.Scanner;

public class CodingChallenge3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
         *  A number is a series of 1 or more digit chars in a row.
         *  (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
         *  Integer.parseInt(string) converts a string to an int.)
         */


        String userString = "b25c43";
        String nums = "";
        char currentChar = ' ';
        int numSum = 0;


        for (int j = 0; j <= userString.length() - 1; j++) {
            currentChar = userString.charAt(j);
            //Character.isDigit(currentChar)
            //numSum += Integer.parseInt(nums);
            if (Character.isDigit(currentChar)) {
                nums += currentChar;
            } else {
                if (nums.equals("")) {
                    nums = "0";
                }
                numSum += Integer.parseInt(nums);
                nums = "";
            }
        }
        input.close();
        if (!nums.equals("")) {
            numSum += Integer.parseInt(nums);
        }
        System.out.println("The sum of the numbers is: " + numSum);
       

    }
}
