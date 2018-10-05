package terning;

import static org.junit.jupiter.api.Assertions.*;

class DiceJUnitTest {

    /* Test om roll() metoden retunerer andre værdier end 1-6 over 60000 kast */
    @org.junit.jupiter.api.Test
    void testrollfaces() {

        //Arrange
        Dice testDie = new Dice();

        //Act
        for (int i = 0; i < 60000; i++){
            int face = testDie.roll();

            //Assert
            assertTrue(face > 0 && face < 7);
        }
    }

    /* Test om værdierne 1-6 forekommer lige hyppigt over 60000 kast med en fejlmag på 400 ved brug af roll() metoden */
    @org.junit.jupiter.api.Test
    void testrolloccurrence() {

        //Arrange
        Dice testDie = new Dice();
        int one=0, two=0, three=0, four=0, five=0, six=0;

        //Act
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

        //Assert
        assertTrue(9600 < one && one < 10400);
        assertTrue(9600 < two && two < 10400);
        assertTrue(9600 < three && three < 10400);
        assertTrue(9600 < four && four < 10400);
        assertTrue(9600 < five && five < 10400);
        assertTrue(9600 < six && six < 10400);
    }
}