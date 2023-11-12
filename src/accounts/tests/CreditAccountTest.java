package accounts.tests;

import accounts.CreditAccount;
import accounts.SimpleAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {

    static CreditAccount creditAccount;

    @BeforeEach
    void init() {
        creditAccount = new CreditAccount(1000);
    }


    @Test
    void pay1() {
        Assertions.assertTrue(creditAccount.pay(500));
        Assertions.assertEquals(-500, creditAccount.getBalance());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, 1001})
    void pay2(int amount) {
        Assertions.assertFalse(creditAccount.pay(amount));
        Assertions.assertEquals(0, creditAccount.getBalance());
    }

    @Test
    void pay3() {
        Assertions.assertTrue(creditAccount.pay(500));
        Assertions.assertEquals(-500, creditAccount.getBalance());
    }

    @Test
    void pay4() {
        creditAccount.setBalance(-400);
        Assertions.assertTrue(creditAccount.pay(500));
        Assertions.assertEquals(-900, creditAccount.getBalance());
    }
    //--------------------------------------------------------------

    @Test
    void add() {
        Assertions.assertFalse(creditAccount.add(100));
        Assertions.assertEquals(0, creditAccount.getBalance());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, 1001})
    void add1(int amount) {
        Assertions.assertFalse(creditAccount.add(amount));
        Assertions.assertEquals(0, creditAccount.getBalance());
    }

    @Test
    void add2() {
        Assertions.assertFalse(creditAccount.add(100));
        Assertions.assertEquals(0, creditAccount.getBalance());
    }

    @Test
    void add3() {
        creditAccount.setBalance(-500);
        Assertions.assertTrue(creditAccount.add(100));
        Assertions.assertEquals(-400, creditAccount.getBalance());
    }
    //-----------------------------------------------------------

    @Test
    void transfer1() {
        SimpleAccount simpleAccount = new SimpleAccount();
        simpleAccount.setBalance(100);
        creditAccount.pay(400);
        Assertions.assertFalse(creditAccount.transfer(simpleAccount, 601));
        Assertions.assertEquals(-400, creditAccount.getBalance());
        Assertions.assertEquals(100, simpleAccount.getBalance());
    }

    @Test
    void transfer2() {
        SimpleAccount simpleAccount = new SimpleAccount();
        simpleAccount.setBalance(100);
        creditAccount.pay(400);
        Assertions.assertTrue(creditAccount.transfer(simpleAccount, 600));
        Assertions.assertEquals(-1000, creditAccount.getBalance());
        Assertions.assertEquals(700, simpleAccount.getBalance());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1})
    void transfer3(int amount) {
        SimpleAccount simpleAccount = new SimpleAccount();
        simpleAccount.setBalance(100);
        creditAccount.pay(400);
        Assertions.assertFalse(creditAccount.transfer(simpleAccount, amount));
        Assertions.assertEquals(-400, creditAccount.getBalance());
        Assertions.assertEquals(100, simpleAccount.getBalance());
    }

}