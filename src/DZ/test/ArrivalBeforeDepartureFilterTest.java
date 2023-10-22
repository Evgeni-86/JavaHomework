package DZ.test;

import DZ.source.ArrivalBeforeDepartureFilter;
import DZ.source.Flight;
import DZ.source.Segment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArrivalBeforeDepartureFilterTest {

    static LocalDateTime date;

    @BeforeAll
    static void initialise() {
        date = LocalDateTime.now();
    }

    @Test
    @DisplayName("IfArrivalTimeLessThenDepartureTime")
    void filterFalse() {
        Segment segment1 = new Segment(date, date);
        Segment segment2 = new Segment(date, date.minusSeconds(1));
        Flight flight = new Flight(Arrays.asList(segment1, segment2));
        ArrivalBeforeDepartureFilter departureFilter = new ArrivalBeforeDepartureFilter();
        Assertions.assertFalse(departureFilter.filter(flight));
    }

    @Test
    @DisplayName("IfDepartureTimeLessOrEqualsArrivalTime")
    void filterTrue() {
        Segment segment1 = new Segment(date, date);
        Segment segment2 = new Segment(date, date.plusSeconds(1));
        Flight flight = new Flight(Arrays.asList(segment1, segment2));
        ArrivalBeforeDepartureFilter departureFilter = new ArrivalBeforeDepartureFilter();
        Assertions.assertTrue(departureFilter.filter(flight));
    }

}