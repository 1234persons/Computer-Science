public class Evens {
    public static void main(String[] args) {
        
        final int SENTINAL = 20;
        int num = 0;

        //this is half as efficient as it could be, why is that?
        while (num != SENTINAL) {
            num  += 1;
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

    }
}
