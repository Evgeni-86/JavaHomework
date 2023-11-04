package DZ3.test;

import DZ3.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest
    @ValueSource(strings = {"())", "()()(()))", ")())()"})
    @DisplayName("methodTest1NotValidArguments")
    void test1Valid(String value) {
        boolean result = Solution.test1(value);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"(())", "()()((()))", "()(())()"})
    @DisplayName("methodTest1ValidArguments")
    void test1NotValid(String value) {
        boolean result = Solution.test1(value);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"]()[]{[]}]", "(]", "([)]", "[][]{{]]]"})
    @DisplayName("methodTest2ValidArguments")
    void test2Valid(String value) {
        boolean result = Solution.test2(value);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"[]{}[[()]]", "[{(){{[]}}()}]"})
    @DisplayName("methodTest2NotValidArguments")
    void test2NotValid(String value) {
        boolean result = Solution.test2(value);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"]()[]{[]}]", "(]", "([)]", "[][]{{]]]"})
    @DisplayName("methodTest3ValidArguments")
    void test3Valid(String value) {
        boolean result = Solution.test2(value);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"[]{}[[()]]", "[{(){{[]}}()}]"})
    @DisplayName("methodTest3NotValidArguments")
    void test3NotValid(String value) {
        boolean result = Solution.test2(value);
        Assertions.assertTrue(result);
    }
}