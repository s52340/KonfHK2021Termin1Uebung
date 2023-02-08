package test;

import org.campus02.Account;
import org.junit.jupiter.api.*;

class AccountTest {

    private Account person1;
    private Account person2;

    private Account person3;

    @BeforeEach
    void setUp() {
        person1 = new Account("Susi Stroh", 200.2);
        person2 = new Account("Max Muster", 0);
        person3 = new Account("Sara Kitty", 2000000);
    }

    @Test
    @DisplayName("Konstruktor Test")
    void testKonstruktor(){
        String expectedperson1 = "Susi Stroh";
        Assertions.assertEquals(expectedperson1,person1.getOwner());

        double expectedAmountPerson1 = 100.000;
        Assertions.assertEquals(expectedAmountPerson1, person1.getAmount());


        Assertions.assertEquals(100.000, person2.getAmount());
        Assertions.assertEquals(100.000, person3.getAmount());
    }

    @Test
     void credit() {
        double expectedperson1 = 220.0;

        person1.credit(120.0);
        Assertions.assertEquals(expectedperson1,person1.getAmount());
    }

    @Test
    void oftenCredit(){

        person2.credit(110.0);
        double expected1 = 210.0;
        Assertions.assertEquals(expected1, person2.getAmount());

        person2.credit(120);
        double expected2 = 330.00;
        Assertions.assertEquals(expected2, person2.getAmount());

        person2.credit(130.0);
        double expected3 = 460.00;
        Assertions.assertEquals(expected3, person2.getAmount());
    }

    @Test
    @DisplayName("Von 100 soll 90 abgezogen werden")
    void debit90() {
        boolean expected100Minus90 = true;

        Assertions.assertTrue(expected100Minus90 == person1.debit(90));
        //2. Möglichkeit? - Assertions.assertEquals(expected100Minus90, person1.debit(90));
        double expectedAmount = 10.0;
        Assertions.assertEquals(expectedAmount,person1.getAmount());
    }

    @Test
    @DisplayName("Von 100 soll 100 abgezogen werden")
    void debit100(){

        boolean expected100Minus100 = true;

        //Assertions.assertEquals(expected100Minus100,person1.debit(100));
        Assertions.assertTrue(expected100Minus100 == person1.debit(100));

        double expectedAmount = 0.0;
        Assertions.assertEquals(expectedAmount, person1.getAmount());
    }

    @Test
    @DisplayName("Von 100 soll 120 abgezogen werden")
    void debit(){
        boolean expected100Minus120 = false;
        Assertions.assertTrue(expected100Minus120 == person1.debit(120));
        //oder: Assertions.assertEquals(expected100Minus120,person1.debit(120));

        //wann assertFalse??

        double expectedValue = 100.00;
        Assertions.assertEquals(expectedValue,person1.getAmount());

    }
}