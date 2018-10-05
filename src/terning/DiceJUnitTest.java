package terning;

import static org.junit.jupiter.api.Assertions.*;

class DiceJUnitTest {

    /* Test af roll() metoden */
    @org.junit.jupiter.api.Test
    void testrollfaces() {
        Dice testDie = new Dice();

        for (int i = 0; i < 60000; i++){
            int face = testDie.roll();

            assertTrue(face > 0 && face < 7);
        }
    }

    @org.junit.jupiter.api.Test
    void testrolloccurrence() {
        Dice testDie = new Dice();
        int one=0, two=0, three=0, four=0, five=0, six=0;

        for (int i = 0; i < 60000; i++){
            int face = testDie.roll();

            switch (face){
                case 1:
                    one++;
                    break;

                case 2:
                    two++;
                    break;

                case 3:
                    three++;
                    break;

                case 4:
                    four++;
                    break;

                case 5:
                    five++;
                    break;

                case 6:
                    six++;
                    break;
            }
        }

        assertTrue(9600 < one && one < 10400);
        assertTrue(9600 < two && two < 10400);
        assertTrue(9600 < three && three < 10400);
        assertTrue(9600 < four && four < 10400);
        assertTrue(9600 < five && five < 10400);
        assertTrue(9600 < six && six < 10400);
    }
}