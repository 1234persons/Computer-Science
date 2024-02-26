import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userString;
        String letter;
        int vowelCount = 0;
        int indexMax = 1;
        System.out.println("Enter a string: ");
        userString = input.nextLine(); 
        input.close();
        for (int index = 0; index < userString.length(); index++) {
            letter = userString.substring(index, indexMax);
            if (letter.compareToIgnoreCase("a") == 0 || letter.compareToIgnoreCase("e") == 0 || letter.compareToIgnoreCase("i") == 0 || letter.compareToIgnoreCase("o") == 0 || letter.compareToIgnoreCase("u") == 0) {
                vowelCount += 1;
            }
            indexMax += 1;
            
        }
        System.out.println("The number of vowels in your string are: " + vowelCount);
    }
}
