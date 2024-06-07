package Carnival;

public class Player {
    private double spendingMoney;
    private String prizesWon;

    /*
     * constructor
     * pre: none
     * post: A player object created
     * Spending money given and prizes set to zero
     */

    public Player(double money) {
        spendingMoney = money;
        prizesWon = "";
    }

    /*
     * Player pays for then plays the game
     * pre: none
     * post: Players spending money is decreased by the cost of the game
     * The player has a new prize added to existing prizes
     */

    public String play(GameBooth game) {
        String newPrize;

        if (game.getCost() > spendingMoney){ 

            return("Sorry, not enough money.\n");
        } else {
        spendingMoney -= game.getCost();
        newPrize = game.start();
        prizesWon += newPrize + ", ";
        return("Prizes won: " + newPrize + "\n");
        }
        
    }

    public String showPrizes() {
        return(prizesWon);
    }

    public String toString() {
        return(" has $" + spendingMoney + " left \nand has won " + prizesWon.substring(0, prizesWon.length() - 2 ) + "\n");
    }
}
