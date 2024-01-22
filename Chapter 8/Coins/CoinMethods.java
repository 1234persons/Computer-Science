import java.util.Random;

public class CoinMethods {
    
    private Random rand = new Random();
    private int face;

    public CoinMethods() {

    }

    public void showFace() {

    }

    public double flipCoin() {
        face = rand.nextInt(1);

        return(face);
    }
}


