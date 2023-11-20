import java.util.*;

public class RockPaperScissorsLizardSpock {
    public static void main(String[] args) {

        Random computerNumber = new Random();
        final int Rock = 1, Paper = 2, Scissors = 3, Lizard = 4, Spock = 5;
        int userNumber;
        int computerNumber2;
        Scanner input = new Scanner(System.in);
        computerNumber2 = computerNumber.nextInt(5) + 1;

        System.out.print("Please input your throw (1 = Rock, 2 = Paper 3 = Scissors, 4 = Lizard, 5 = Spock): ");
        userNumber = input.nextInt();
        input.close();

        switch (userNumber) {
            case Rock:
                System.out.println("You throw Rock!");
                break;
            case Scissors:
                System.out.println("You throw Scissors!");
                break;
            case Paper:
                System.out.println("You throw Paper!");
                break;
            case Lizard:
                System.out.println("You throw Lizard!");
                break;
            case Spock:
                System.out.println("You throw Spock!");
        }

        switch (computerNumber2) {
            case Rock:
                System.out.println("CPU throw Rock!");
                break;
            case Scissors:
                System.out.println("CPU throw Scissors!");
                break;
            case Paper:
                System.out.println("CPU throw Paper!");
                break;
            case Lizard:
                System.out.println("You throw Lizard!");
                break;
            case Spock:
                System.out.println("You throw Spock!");

        }

        switch (userNumber) {
            case 1:
                if (computerNumber2 == Scissors || computerNumber2 == Lizard) {
                    System.out.println("You Win");
                } else if (computerNumber2 == Paper || computerNumber2 == Spock) {
                    System.out.println("CPU Win");
                } else if (computerNumber2 == Rock) {
                    System.out.println("Its a Tie");
                }
                break;
            case 2:
               if (computerNumber2 == Scissors || computerNumber2 == Lizard) {
                    System.out.println("You Lose");
                } else if (computerNumber2 == Paper) {
                    System.out.println("Its a Tie");
                } else if (computerNumber2 == Rock || computerNumber2 == Spock) {
                    System.out.println("You Win");
                }
                break;
            case 3:
                if (computerNumber2 == Scissors) {
                    System.out.println("Its a Tie");
                } else if (computerNumber2 == Paper || computerNumber2 == Lizard) {
                    System.out.println("You Win");
                } else if (computerNumber2 == Rock || computerNumber2 == Spock) {
                    System.out.println("You Lose");
                }
                break;
            case 4:
                if (computerNumber2 == Scissors || computerNumber2 == Rock) {
                    System.out.println("You Lose");
                } else if (computerNumber2 == Paper || computerNumber2 == Spock) {
                    System.out.println("You Win");
                } else if (computerNumber2 == Lizard) {
                    System.out.println("You tie");
                }
                break;
            case 5:
                if (computerNumber2 == Lizard || computerNumber2 == Paper) {
                    System.out.println("You Lose");
                } else if (computerNumber2 == Rock || computerNumber2 == Scissors) {
                    System.out.println("You Win");
                } else if (computerNumber2 == Spock) {
                    System.out.println("You tie");
                }
                break;

    }
    }
}