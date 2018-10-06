package terning;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
	    int min = 1;
	    int max = 6;
		int rollResult = ThreadLocalRandom.current().nextInt(min, max +1);
		return rollResult;
	}

	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i = 1; i < n; i++) {
			System.out.print(roll() + " ");
		}
	}
}
