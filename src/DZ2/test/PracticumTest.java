package DZ2.test;

import DZ2.Practicum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.*;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class PracticumTest {

    @Test
    @DisplayName("printFlightInformationValidArgumentsTest")
    void printFlightInformation() {

        try {
            Method printFlightInformation = Practicum.class.getDeclaredMethod("printFlightInformation",
                    String.class,
                    String.class,
                    String.class,
                    int.class,
                    int.class,
                    int.class
                    );
            printFlightInformation.setAccessible(true);

            Assertions.assertDoesNotThrow(()-> {
                printFlightInformation.invoke(null, "12:15 02.11.21", "VKO", "LED", 30, 1, 55);
            });

        } catch (NoSuchMethodException e) {
            System.out.println("метод printFlightInformation не найден");
        }
    }
}