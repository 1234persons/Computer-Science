import java.util.Math;

public class PythagoreanTriples {
    public static void main(String[] args) {
        double c;
        for (double a = 1; a <= 100; a++) {
            perfectSquareA = perfectSquare(a, perfectSquareA);
            if (perfectSquareA == true) {
                for (int b = 1; b <= 100; b++) {
                    perfectSquareB = perfectSquare(b, perfectSquareB);
                    if (perfectSquareB == true) {
                        a = Math.pow(a);
                        b = Math.pow(b);
                        c = a + b;
                        double tempC = c;
                        
                        c = perfectSquare(c);
                        if (c == tempC) {
                            System.out.println(a + ", " + b + ", " + c);
                        } else {
                            break;
                        }
                    }
                }
           }
        }
        System.out.println("Cheese");

    }
    public static double perfectSquare(double num) {
        double square;
        double originalNumber = num;
        square = Math.sqrt(num);
		square = (double)square;
		square = Math.pow((int)square, 2);
		
		if (square == originalNumber) {
			return(originalNumber);
		} else {
            return(square);
        }
    }
}
