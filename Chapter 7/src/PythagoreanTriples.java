import java.util.Math;

public class PythagoreanTriples {
    public static void main(String[] args) {
        boolean perfectSquareA = false;
        boolean perfectSquareB = false;
        boolean perfectSquareC = false;
        double c;
        for (double a = 1; a <= 100; a++) {
            perfectSquareA = perfectSquare(a, perfectSquareA);
            if (perfectSquareA == true) {
                for (double b = 1; b <= 100; b++) {
                    perfectSquareB = perfectSquare(b, perfectSquareB);
                    if (perfectSquareB == true) {
                        a = Math.pow(a, 2);
                        b = Math.pow(b, 2);
                        c = a + b;
                        perfectSquareC = perfectSquare(c, perfectSquareC);
                        if (perfectSquareC == true) {
                            System.out.println(a + ", " + b + ", " + c);
                        }
                    } else {
                        break;
                    }
                }
           } else {
            break;
           }
        }

    }
    public static boolean perfectSquare(double num, boolean perfectSquare) {
        double square;
        double originalNumber = num;
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
