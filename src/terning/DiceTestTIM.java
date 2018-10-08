package terning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;

import org.junit.jupiter.api.Test;

class DiceTestTIM {

    /** This program fails because the code in 'Dice.java' for rolling a dice is poorly written.
     * The program rolls roughly half 1 and 6 values (individually) compared to 2, 3, 4 & 5 individually*/

    //Creating an instance of amount for testing
    private Dice dice = new Dice();

    /** Testing 10000 times if roll value is between 1-6
     * Expected result is TRUE in all cases*/
    @RepeatedTest(1000)
    void test1() {

        int roll = dice.roll();
        assertTrue((roll > 0) && (roll <= 6));

    }

    /** Testing 4% margin of error on each possible value (1-6) with 60.000 tests*/
    @Test
    void test2() {
        int value1, value2, value3, value4, value5, value6;
        value1 = value2 = value3 = value4 = value5 = value6 = 0;

        int minLimit = 9600;
        int maxLimit = 10400;

        for (int i = 0; i < 60000; i++) {
            int roll = dice.roll();
            switch (roll) {
                case 1:
                    value1++;
                    break;
                case 2:
                    value2++;
                    break;
                case 3:
                    value3++;
                    break;
                case 4:
                    value4++;
                    break;
                case 5:
                    value5++;
                    break;
                case 6:
                    value6++;
                    break;
                default:
                    assertTrue(false);
                    break;
            }
        }

        //Asserting whether margin of error is exceeded or not.
        assertTrue((value1 >= minLimit) && (value1 <= maxLimit));
        assertTrue((value2 >= minLimit) && (value2 <= maxLimit));
        assertTrue((value3 >= minLimit) && (value3 <= maxLimit));
        assertTrue((value4 >= minLimit) && (value4 <= maxLimit));
        assertTrue((value5 >= minLimit) && (value5 <= maxLimit));
        assertTrue((value6 >= minLimit) && (value6 <= maxLimit));
    }
}