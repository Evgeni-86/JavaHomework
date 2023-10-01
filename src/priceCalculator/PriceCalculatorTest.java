package priceCalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class PriceCalculatorTest {


    static PriceCalculator priceCalculator;

    @BeforeAll
    static void init() {
        priceCalculator = new PriceCalculator();
    }


    @Test
    @DisplayName("Test CalculatorPrise bike valid value")
    void calculatePriceForBikeIsValidArgument() {
        int expected = 100;
        int actual = priceCalculator.calculatePrice(TransportType.BIKE, 10);
        Assertions.assertEquals(expected, actual, "Неверный результат");
    }

    @Test
    @DisplayName("Test CalculatorPrise bike negative value")
    void calculatePriceForBikeIsNegativeValue() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            priceCalculator.calculatePrice(TransportType.BIKE, -1);
        });
        Assertions.assertEquals("Distance should be more than 0 km", exception.getMessage());
    }

    @Test
    @DisplayName("Test CalculatorPrise bike overriding value")
    void calculatePriceForBikeIsOverridingValue() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            priceCalculator.calculatePrice(TransportType.BIKE, 25);
        });
        Assertions.assertEquals("Bike can not go for more than 20 km", exception.getMessage());
    }

    @Test
    @DisplayName("ew")
    void calculatePriceForIncorrectTransport() {
        UnsupportedOperationException exception = Assertions.assertThrows(UnsupportedOperationException.class,() -> {
                    priceCalculator.calculatePrice(TransportType.DRONE, 10);
                },"transport type is not handled correctly");
    }


}