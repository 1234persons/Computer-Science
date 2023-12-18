public class PythagoreanTriples {
    public static void main(String[] args) {

        for (int a = 1; a <= 100; a++) {

            //if (perfectSquare(a)) {

                for (int b = 1; b <= 100; b++) {

                    //if (perfectSquare(b)) {

                        for (int c = 1; c <= 100; c++) {

                            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a < b && coPrime(a, b)) {
                                System.out.println(a + ", " + b + ", " + c);
                            }

                        }

                    }
                    
                //}

            }

        //}

    }

    // public static boolean perfectSquare(double num) {
    //     double originalNumber = num;
    //     double square;
    //     originalNumber = num;

    //     square = Math.sqrt(num);
    //     square = (double) square;
    //     square = Math.pow((int) square, 2);

    //     if (square == originalNumber) {
    //         return (true);
    //     } else {
    //         return (false);
    //     }

    // }

    public static boolean coPrime(int m, int n) {

        /* Since m <= n */
        int index = 2;
        boolean is_coprime = true;
        while (index <= m) {
            if (m % index == 0 && n % index == 0) {
                is_coprime = false;
            }
            index = index + 1;
        }
        return is_coprime;
    }

}

