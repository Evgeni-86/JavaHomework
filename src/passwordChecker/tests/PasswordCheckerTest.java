package passwordChecker.tests;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import passwordChecker.PasswordChecker;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

//КОНФЛИКТ ТЕСТОВ ПРИ РАБОТЕ С ОДНИМ ОБЬЕКТОМ(тесты паралельно)???
//тесты будут выполняться в порядке, указанном в аннотации @Order
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PasswordCheckerTest {

    private static PasswordChecker passwordChecker;

    @BeforeAll
    static void init() {
        passwordChecker = PasswordChecker.getPasswordChecker();//SINGLETON
    }

    @Order(1)
    @Test
    void notInitCheckerParamsRepeats() {
        passwordChecker.setMinLength(2);
        IllegalStateException ex = Assertions.assertThrows(IllegalStateException.class, () -> {
            passwordChecker.verify("AAA");
        });
        Assertions.assertEquals("minLength or maxRepeats not available", ex.getMessage());
    }

    @Order(2)
    @Test
    void notInitCheckerParamsLength() {
        Field maxRep = null;
        try {
            maxRep = passwordChecker.getClass().getDeclaredField("minLength");
            maxRep.setAccessible(true);
            maxRep.set(passwordChecker, -1);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("test notInitCheckerParamsLength error");
            return;
        }
        passwordChecker.setMaxRepeats(2);
        IllegalStateException ex = Assertions.assertThrows(IllegalStateException.class, () -> {
            passwordChecker.verify("AAA");
        });
        Assertions.assertEquals("minLength or maxRepeats not available", ex.getMessage());
    }

    @Order(3)
    @Test
    void setMinLength() {
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            passwordChecker.setMinLength(-1);
        });
        Assertions.assertEquals("unavailable min length", ex.getMessage());
    }

    @Order(4)
    @Test
    void setMaxRepeats() {
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            passwordChecker.setMaxRepeats(0);
        });
        Assertions.assertEquals("unavailable max repeats", ex.getMessage());
    }

    @Order(5)
    @ParameterizedTest
    @ValueSource(strings = {"AASS", "ASS", "SSA", "SSASS"})
    void verifyValid(String pass) {
        passwordChecker.setMaxRepeats(2);
        passwordChecker.setMinLength(2);
        Assertions.assertTrue(passwordChecker.verify(pass));
    }

    @Order(6)
    @ParameterizedTest
    @ValueSource(strings = {"AASS", "ASS", "SSA", "SSASS"})
    void verifyNotValid(String pass) {
        passwordChecker.setMaxRepeats(1);
        passwordChecker.setMinLength(2);
        Assertions.assertFalse(passwordChecker.verify(pass));
    }

    @Order(7)
    @ParameterizedTest
    @ValueSource(strings = {"AASS", "ASS", "SSA", "SSASS"})
    void verifyValidLength(String pass) {
        passwordChecker.setMaxRepeats(2);
        passwordChecker.setMinLength(3);
        Assertions.assertTrue(passwordChecker.verify(pass));
    }

    @Order(8)
    @ParameterizedTest
    @ValueSource(strings = {"AASS", "ASS", "SSA", "SSASS"})
    void verifyNotValidLength(String pass) {
        passwordChecker.setMaxRepeats(2);
        passwordChecker.setMinLength(6);
        Assertions.assertFalse(passwordChecker.verify(pass));
    }
}