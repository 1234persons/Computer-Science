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
                for (int b = 1; b <= 100; b++) {
                    perfectSquareB = perfectSquare(b, perfectSquareB);
                    if (perfectSquareB == true) {
                        
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
