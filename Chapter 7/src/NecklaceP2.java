
public class NecklaceP2 {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                Necklace(i, j);
            }
        }
 
    }
    public static void Necklace(int first, int second) {
        int firstDigit = first;
        int secondDigit = second;
        int thirdDigit;
        int counter = 0;
        System.out.print(first + " " + second + " ");

        do {
            thirdDigit = (firstDigit + secondDigit)%10;
            firstDigit = secondDigit;
            secondDigit = thirdDigit;
            System.out.print(secondDigit + " ");
            counter++;
        } while (firstDigit != first || secondDigit != second);
        
        System.out.println("It took " + counter + " iterations to close the necklace from " + first + " and " + second);
        System.out.println();
    }
}
