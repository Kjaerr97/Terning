package terning;

import java.util.Random;
public class Dice {
	Random random = new Random();

	// roll the die and return the value (1-6)
	public int roll() {
		/*float d1=(float)Math.random();     // 0-1
		float d2=d1*5;                     // 0-5
		int d3=Math.round(d2);             // 0-5 integer
		return d3 + 1;                     // 1-6		*/

		return random.nextInt(6) + 1;
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=0; i<n; i++) {
			System.out.print(roll() + " ");
		}
	}
}

// JUnitTestRasmus