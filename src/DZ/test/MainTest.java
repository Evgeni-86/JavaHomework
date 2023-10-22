package DZ.test;

import DZ.Main;
import DZ.source.*;
import org.junit.jupiter.api.*;
import java.time.LocalDateTime;
import java.util.*;


class MainTest {

    static LocalDateTime date;

    @BeforeAll
    static void initialise() {
        date = LocalDateTime.now();
    }

    @Test
    @DisplayName("mainTestNullInputValue")
    void flightsFilterNull() {
        List<Flight> flightList = null;
        Assertions.assertEquals(flightList, Main.flightsFilter(flightList, el -> 2 > 1));
    }

    @Test
    @DisplayName("mainTestIfValidValue")
    void flightsFilterValid() {
        Segment segment = null;
        Flight flight = new Flight(Arrays.asList(segment));
        List<Flight> flightList = Arrays.asList(flight);
        Assertions.assertNotSame(flightList, Main.flightsFilter(flightList, el -> el.equals(flight)));
        Assertions.assertEquals(flightList, Main.flightsFilter(flightList, el -> el.equals(flight)));
    }

}