import java.util.math;


public class PythagoreanTriples {
    public static void main(String[] args) {
        for (int a = 1; a <= 1000; a++ ) {
            for (int b = 1; b <= 1000; b++) {
                for (int c = 1; c <= 1000; c++) {
                    double int1 = a, int2 = b, int3 = c;
                    if (PerfectSquare(int1) == true && PerfectSquare(int2) == true && PerfectSquare(int3) == true) {
                        System.out.println(int1 + ", " + int2 + ", " + int3);
                    }
                    if (Math.sqrt(a) + Math.sqrt(b) == Math.sqrt(c)) {
                        if (a < b) {
                            System.out.println(int1 + ", " + int2 + ", " + int3);
                        }
                    }
                }
            }
        }

    }
    public static boolean perfectSquare(double num) {
        Scanner input = new Scanner(System.in);
                int originalNumber = num;
                double square;
                originalNumber = num;
                
                square = Math.sqrt(num);
                square = (double)square;
                square = Math.pow((int)square, 2);
                
                if (square == originalNumber) {
                    return(true);
                } else {
                    return(false);
                }
                
                
                
        
            }
}
