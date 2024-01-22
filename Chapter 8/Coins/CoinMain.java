public class CircleMain {

    public static void main(String[] args) {
        CoinMethods nickel = new CoinMethods();
        if (nickel.flipCoin() == 0) {
            System.out.println("Heads up!");
        } else {
            System.out.println("Tails up!");
        }
    }

}
