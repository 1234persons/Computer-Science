import java.lang.Math;

public class PythagoreanTriples {
    public static void main(String[] args) {
        
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
