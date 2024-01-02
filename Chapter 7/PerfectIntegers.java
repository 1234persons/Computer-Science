public class PerfectIntegers {
    public static void main(String[] args) {
        
        boolean perfectInteger = false;
        for (int i = 1; i <= 100; i++) {
            perfectInteger = isPerfect(i);

            if (perfectInteger) {
                System.out.println(i);
            }
        }

    }

    public static boolean isPerfect(int num) {

        int factorSum = 0;
        for (int i = 1; i <= num; i++) {
            
            if (num % i == 0 && i != num) {
                factorSum += i;
            }
        }
        if (factorSum == num) {
            return(true);
        } else {
            return(false);
        }

    }
}
