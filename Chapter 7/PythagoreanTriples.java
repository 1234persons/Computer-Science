import java.util.math;


public class PythagoreanTriples {
    public static void main(String[] args) {
        boolean square = false;
        for (int a = 1; a <= 100; a++ ) {
            square = PerfectSquare(a);

            if (square) {
                square = false;
                for (int b = 1; b <= 100; b++) {
                    square = PerfectSquare(b);
                    if (square) {
                        square = false;
                        for (int c = 1; c <= 100; c++) {
                            square = PerfectSquare(c);
                            if (square) {
                                System.out.println(a + ", " + b + ", " + c);
                            }
                        }
                    }
                }
            }
        }

    }
    public static double perfectSquare(int num) {
        Scanner input = new Scanner(System.in);
                
                int number = num;
                int originalNumber = number;
                double square;
                originalNumber = number;
                
                square = Math.sqrt(number);
                square = (double)square;
                square = Math.pow((int)square, 2);
                
                if (square == originalNumber) {
                    return(true);
                } else {
                    return(false);
                }
                
                
                
        
            }
}
