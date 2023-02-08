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
    }

    @Test
    void debit() {
    }
}