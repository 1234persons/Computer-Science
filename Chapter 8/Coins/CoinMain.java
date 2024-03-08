package Coins;


public class CoinMain {

    public static void main(String[] args) {
        CoinMethods nickel = new CoinMethods();
        
        if (nickel.showFace() == 0) {
            System.out.println("Heads up!");
        } else {
            System.out.println("Tails up!");
        }
    }

}
