package terning;

import static org.junit.jupiter.api.Assertions.*;

class DiceJUnitTest {


    /*
    Første del af testen af terningeprogrammet er, at se om programmet giver værdier, som ikke fremtræder på en
    terning. Altså face > 0 eller face > 7
    Jeg opretter så en test, jeg kalder for testFaceValues.
    For at køre en test, skal vi have et objekt at teste på. Jeg opretter objektet testdie = new Dice()
     */


    @org.junit.jupiter.api.Test
    void testFaceValue() {

        // For at køre en test, skal vi have et objekt at teste på. Jeg opretter objektet testdie = new Dice()
        Dice testDie = new Dice();

        /*
         Jeg opretter så en for-loop, hvor jeg angiver initialization: int i = 0;, condition: i<60000
         (Da det i opgavebeskrivelsen er angivet at testen skal forløbe over 60.000 terningekast. Og sidst en increment.
         Så længe condition er true vil variablen int face = testDie.roll();, hvilket bliver metoden som er den ene
         paramenter jeg skal bruge i assert.
        */

        for (int i = 0; i < 60000; i++){
            int face = testDie.roll();
        /*
        Jeg opretter nu min assert, som skal teste ud fra condition af face (face > 0 eller face > 7)
         */
            assertTrue(face > 0 && face < 7);
        }
    }





    /*
    Det næste jeg skal teste ud fra opgavebeskrivelsen er om alle 6 værdier forekommer lige hyppigt, som det logisk
    vil være ved en fysisk terning. Jeg skal teste på 60.000 kast igen om alle værdier fremkommer 10.000 gange med en
    fejlmargen på +-400
     */
    @org.junit.jupiter.api.Test
    void testFaceValueOcc() {
        //Jeg opretter min test og giver navnet testFaceValueOcc som forkotelse for occurence/hyppighed


        /*
        Jeg opretter igen objektet Dice testDie = new Dice(); og opretter derefter 6 variabler one, two, three, four,
        five og six med alle værdien 0, som repræsenterer FaceValue og antal gange det er blevet slået.
         */
        Dice testDie = new Dice();
        int one=0, two=0, three=0, four=0, five=0, six=0;

        /*
        Jeg laver nu et ny for-loop. initialization bliver i=0, condition er samme som før i < 60000. Og samme increment.
        Herefter er oprettet variablen face som viser værdien er testDie.roll().
         */
        for (int i = 0; i < 60000; i++){
            int face = testDie.roll();
            /*
            Nu har jeg så oprettet en switch statement. Det har jeg fordi jeg har får en integer value som jeg kan
            matche til 6 forskellige cases, nemlig face value. Så følgende sker: Hvis jeg får en facevalue på 1 går
            switch statement ned igennem mine cases og matcher værdien 1 med en case med sammen værdi. Det har case 1.
            Derefter bliver int værdien "one" incremented med 1, som betyder at slaget 1 er blevet slået 1 gang. Derefter
            breakes der ud af switch statement og for loopet kører igen og i er incremented. Sådan køres det 60000 gange
            hvor en facevalue 1-6 bliver matches med mine cases, som incrementere til det samlede antal slag for den enkelte
            værdi
             */
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
                //ingen defualt da jeg testede at det kun er værdierne 1,2,3,4,5,6 som jeg kan få.
            }
        }

        /*
        Slutvis laver jeg mine asserts, hvor jeg ud fra en given condition skal teste om antallet af de enkelte face
        values er imellem 9600-10400 (10000 med fejlmargen 400). Jeg anvender && da både 9600 < one skal være sand og
        one < 10400 skal være sandt, før det hele er sand. Jeg opretter en assertTrue for hver facevalue.
         */

        assertTrue(9600 < one && one < 10400);
        // For facevalue 1
        assertTrue(9600 < two && two < 10400);
        // ...
        assertTrue(9600 < three && three < 10400);
        // ...
        assertTrue(9600 < four && four < 10400);
        // ...
        assertTrue(9600 < five && five < 10400);
        //...
        assertTrue(9600 < six && six < 10400);
        //...
    }
}
