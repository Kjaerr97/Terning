package terning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTest {

    @Test
    public void roll() {

        //Jeg tilføjer det objekt jeg vil teste.

        Dice testDice = new Dice();

        //At teste at objektet/terningen ikke kan give andre værdier end 1-6. Her opretter jeg en for-loop.

        for (int i = 0; i < 60000; i++) {
            int DiceOut = testDice.roll();

            //Her opretter jeg min assert, som skal teste ud fra condition af DiceOut om terningen kun viser tal fra 1-6.

            assertTrue(DiceOut > 0 && DiceOut < 7);

        }
    }









        /*
        Nu skal jeg teste om alle seks værdier forekommer lige hyppigt indenfor en passende fejlmargin.
        For eksempel, hvis jeg kaster terningen 60000 gange skal hver værdi forekomme ca. 10000 gange ± 400.
        */

        @org.testng.annotations.Test
        void DiceOutputValue() {

        /*
        Jeg opretter igen et objekt at teste, og derefter 6 variabler
        som repræsenterer DiceOutValue og antal gange det er blevet slået.
        */

            int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;

        /*
        Jeg laver nu et ny for-loop. initialization bliver i=0, condition er samme som før i < 60000. Og samme increment.
        Herefter er oprettet variablen face som viser værdien er testDice.roll().
         */

            Dice testDice = new Dice();

            for (int i = 0; i < 60000; i++) ;{
                int face = testDice.roll();

        /*
        Jeg opretter en switch statement, da jeg har en integer som jeg så kan matche med 6 cases (DiceOutValue).
        Hvis DiceOutValue bliver 1, vil min switch gå ned og se hvilken case der matcher til det output. Dérnæst breaker
        den, og starter forfra igen med næste output. Dette gøres 60000 gange, og til sidst får jeg en cases samlede
        værdi af hvor mange gange den har matchet med DiceOutputValue.
         */

                switch (face) {

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

        /*
        Her laver jeg asserts'ne, som skal teste om antallet af de enkelte DiceOutputValues er mellem 9600 og 10400.
        Jeg bruger && imellem hver udsang, da begge udsagn skal være sande, før det hele er sandt.
         */

            assertTrue(9600 < one && one < 10400);
            assertTrue(9600 < two && two < 10400);
            assertTrue(9600 < three && three < 10400);
            assertTrue(9600 < four && four < 10400);
            assertTrue(9600 < four && four < 10400);
            assertTrue(9600 < five && five < 10400);
            assertTrue(9600 < six && six < 10400);

        }
    }