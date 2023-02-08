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
    void debit() {
    }
}