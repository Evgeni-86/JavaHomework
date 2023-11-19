package DZ4.accounts.tests;

import DZ4.accounts.CreditAccount;
import DZ4.accounts.SimpleAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class SimpleAccountTest {

    private SimpleAccount simpleAccount;
    private CreditAccount creditAccount;

    @BeforeEach
    void init() {
        simpleAccount = new SimpleAccount();
        simpleAccount.setBalance(1000);
        creditAccount = new CreditAccount(1000);
    }

    @Test
    void pay1() {
        Assertions.assertTrue(simpleAccount.pay(500));
        Assertions.assertEquals(500, simpleAccount.getBalance());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1})
    void pay2(int amount) {
        Assertions.assertFalse(simpleAccount.pay(amount));
        Assertions.assertEquals(1000, simpleAccount.getBalance());
    }

    @Test
    void pay3() {
        Assertions.assertFalse(simpleAccount.pay(1001));
        Assertions.assertEquals(1000, simpleAccount.getBalance());
    }
    //--------------------------------------------------------------

    @Test
    void add1() {
        Assertions.assertTrue(simpleAccount.add(100));
        Assertions.assertEquals(1100, simpleAccount.getBalance());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1})
    void add2(int amount) {
        Assertions.assertFalse(simpleAccount.add(amount));
        Assertions.assertEquals(1000, simpleAccount.getBalance());
    }
    //-----------------------------------------------------------

    @Test
    void transfer1() {
        creditAccount.setBalance(-700);
        Assertions.assertTrue(simpleAccount.transfer(creditAccount, 600));
        Assertions.assertEquals(400, simpleAccount.getBalance());
        Assertions.assertEquals(-100, creditAccount.getBalance());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, 1001})
    void transfer2(int amount) {
        creditAccount.setBalance(-700);
        Assertions.assertFalse(creditAccount.transfer(simpleAccount, amount));
        Assertions.assertEquals(-700, creditAccount.getBalance());
        Assertions.assertEquals(1000, simpleAccount.getBalance());
    }

}