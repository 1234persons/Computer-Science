import java.util.math;


public class PythagoreanTriples {
    public static void main(String[] args) {
       
    }
    public static boolean perfectSquare(double num) {
                double originalNumber = num;
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
