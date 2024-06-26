public class BetterPythagoreanTriples {
    public static void main(String[] args) {

        double c;

        for (double a = 1; a <= 100; a++) {
            for (double b = a; b <= 100; b++) {
                if (perfectSquare(Math.pow(a,2) + Math.pow(b, 2)) && a < b) {   
                    c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));  
                        System.out.println((int)a + ", " + (int)b + ", " + (int)c);
                }
            }
        }
    }

    public static boolean perfectSquare(double num) {
        double square;

        square = Math.sqrt(num);
        square = (double) square;
        square = Math.pow((int) square, 2);

        if (Math.sqrt(Math.pow(num,2)) == (int)(Math.sqrt(Math.pow(num,2)))) {
            return (true);
        } else {
            return (false);
        }

    }

}
