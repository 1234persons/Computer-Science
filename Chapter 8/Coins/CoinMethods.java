package Coins;

import java.util.Random;

public class CoinMethods {
    
    private Random rand = new Random();
    private int faceUp;

    public CoinMethods() { // constructor
       flipCoin();
    }

    public int showFace() { // accessor
        return (faceUp);
    }

    public void flipCoin() { // mutator
        faceUp = rand.nextInt(2);

    }
}


