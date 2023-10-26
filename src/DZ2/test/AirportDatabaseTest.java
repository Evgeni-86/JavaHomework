package DZ2.test;

import DZ2.AirportDatabase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class AirportDatabaseTest {

    @Test
    @DisplayName("getAirportByCodeExceptionTest")
    void getAirportByCodeException() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> AirportDatabase.getAirportByCode("AAAA"), "неверный код аэропорта");
    }

    @ParameterizedTest
    @DisplayName("getAirportByCodeValidCodeTest")
    @ValueSource(strings = {"VKO", "LED", "SVX", "VVO"})
    void getAirportByCodeValidCode(String args) {
        Assertions.assertDoesNotThrow(()-> AirportDatabase.getAirportByCode(args));
    }


}