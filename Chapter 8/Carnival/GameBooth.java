package Carnival;

public class GameBooth {
    private double cost;
    private String firstPrize, consolationPrize;
    private int firstPrizesRewarded = 0;
    private int consolationPrizesRewarded = 0;
    
    /*
     * constructor
     * pre: none
     * post: A gamebooth is created
     * The cost and prizes are set
     */

    public GameBooth(double charge, String p1, String p2) {
        cost = charge;
        firstPrize = p1;
        consolationPrize = p2;
    }

    /*
     * Game is played and prize awarded
     * pre: none
     * post: player had three tries. Player succesful all
     * three times recieved
     * 
     */
    public String start() {
        int toss;
        int successes = 0;

        // Plays game
        for (int i = 0; i < 3; i++) { // player gets three tries
            toss = (int) (Math.random() + .5);
            if (toss == 1) {
                successes += 1;
            }
        }

        // gives prize
        if (successes == 3) {
            firstPrizesRewarded += 1;
            return (firstPrize);
        }
        consolationPrizesRewarded += 1;
        return (consolationPrize);
    }

    // returns game cost
    public double getCost() {
        return (cost);
    }

    public void prizesAwarded() {
        System.out.println(firstPrizesRewarded + " first prizes have been rewarded.");
        System.out.println(consolationPrizesRewarded + " consolation prizes have been rewarded.\n");
    }
}
