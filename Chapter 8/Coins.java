import java.util.Random;

public class Coins {

    private Random rand = new Random();

    public static void main(String[] args) {
        Coin nickel = new Coin();
        if (nickel.flipCoin() == 0) {
            System.out.println("Heads up!");
        } else {
            System.out.println("Tails up!");
        }
    }

    public Coin() {

    }

    public void showFace() {

    }

    public double flipCoin() {
        int face = rand.nextInt(1);

        return(face);
    }
}


