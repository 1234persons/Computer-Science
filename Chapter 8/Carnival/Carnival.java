package Carnival;

public class Carnival {
    public static void main(String[] args) {
        
        GameBooth balloonDartToss = new GameBooth(2, "tiger", "plush");
        GameBooth ringToss = new GameBooth(2, "Bear keychain", "Pencil");
        GameBooth breakAPlate = new GameBooth(1.5, "Pig Plush", "Plastic Dinosaur");
        Player shonda = new Player(5); // $5 spending money
        Player luis = new Player(3); // $3 spending money

        System.out.print("Shonda goes to balloon dart toss: ");
        System.out.println(shonda.play(balloonDartToss));

        System.out.print("luis goes to ring toss: ");
        System.out.println(luis.play(ringToss));

        System.out.print("Shonda goes to ring toss: ");
        System.out.println(shonda.play(ringToss));

        System.out.print("luis goes to break a plate: ");
        System.out.println(luis.play(breakAPlate));

        System.out.print("Shonda won: " + shonda.showPrizes());
        System.out.println("Luis won: " + luis.showPrizes() + "\n");

        System.out.println("shonda" + shonda);
        System.out.println("luis" + luis);
        
        System.out.print("At balloon dart toss ");
        balloonDartToss.prizesAwarded();

        System.out.print("At ring toss ");
        ringToss.prizesAwarded();

        System.out.print("At break a plate ");
        breakAPlate.prizesAwarded();
        
    }
}
