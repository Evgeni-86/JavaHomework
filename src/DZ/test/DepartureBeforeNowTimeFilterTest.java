package DZ.test;

import DZ.source.DepartureBeforeNowTimeFilter;
import DZ.source.Flight;
import DZ.source.Segment;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;
import java.util.Arrays;



class DepartureBeforeNowTimeFilterTest {

    static LocalDateTime date;

    @BeforeAll
    static void initialise() {
        date = LocalDateTime.now();
    }


    @Test
    @DisplayName("IfDepartureTimeBeforeCurrentTime")
    void filterFalse() {
        Segment segment1 = new Segment(date, date);
        Segment segment2 = new Segment(date.minusSeconds(1), date);
        Flight flight = new Flight(Arrays.asList(segment1, segment2));
        DepartureBeforeNowTimeFilter nowTimeFilter = new DepartureBeforeNowTimeFilter();
        Assertions.assertFalse(nowTimeFilter.filter(flight));
    }

    @Test
    @DisplayName("IfCurrentTimeMoreOrEqualsDepartureTime")
    void filterTrue() {
        //TODO: текущая дата в тесте и текущая дата в методе тестируемого класса должны совпадать в моменте (добавить в конструктор flightsFilter)
        Segment segment1 = new Segment(date, date);
        Segment segment2 = new Segment(date.plusSeconds(1), date.plusSeconds(2));
        Flight flight = new Flight(Arrays.asList(segment1, segment2));
        DepartureBeforeNowTimeFilter nowTimeFilter = new DepartureBeforeNowTimeFilter();
        Assertions.assertTrue(nowTimeFilter.filter(flight));
    }


}