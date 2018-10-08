package terning;

public class Dice {

	/*

	Alternative solution using math.random.
	Public int roll() {
	float d1 = (float) Math.random(); // generates a float between 0-1
	float d2 = d1 * 6; 				  // multiplies that float by 6 to get a float between 0-6
	return (int)Math.ceil(d2);       // uses Math.ceil() and typecasts to int to get an int between 1-6.


	}
	 */
	// roll the die and return the value (1-6)
	public int roll() {
		float d1=(float)Math.random();     // 0-1
		float d2=d1*5;                     // 0-5
		int d3=Math.round(d2);             // 0-5 integer
		return d3 + 1;                     // 1-6		
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<n; i++) {
			System.out.print(roll() + " ");
		}
	}
}

// JUnitTestRasmus