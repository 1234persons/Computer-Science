
public class RandomNumbersGenerator {

	public static void main(String[] args) {

		int modulus = 33;
		int multiplier = 5;
		int increment = 20;
		int seed = 100;
		int newSeed;
		int period = 0;


		newSeed = seed;

		System.out.println("The seed is: " + seed);

		do {
			period += 1;
			newSeed = (newSeed * multiplier + increment) % modulus;
			System.out.println(newSeed);
		} while (newSeed != seed);

			System.out.println("The period is: " + period);


	}

}
