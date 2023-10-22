package DZ.test;

import DZ.source.Flight;
import DZ.source.Segment;
import DZ.source.TimeOnGroundMoreThenTwoHourFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TimeOnGroundMoreThenTwoHourFilterTest {

    static LocalDateTime date;

    @BeforeAll
    static void initialise() {
        date = LocalDateTime.now();
    }

    @Test
    @DisplayName("IfTimeOnGroundMoreTwoHour")
    void filterTest1() {
        Segment segment1 = new Segment(date, date.plusHours(2));
        Segment segment2 = new Segment(date.plusHours(4).plusSeconds(1), date.plusHours(6));
        Flight flight = new Flight(Arrays.asList(segment1, segment2));

        TimeOnGroundMoreThenTwoHourFilter hourFilter = new TimeOnGroundMoreThenTwoHourFilter();
        Assertions.assertFalse(hourFilter.filter(flight));
    }

    @Test
    @DisplayName("IfTimeOnGroundTwoHour")
    void filterTest2() {
        Segment segment1 = new Segment(date, date.plusHours(2));
        Segment segment2 = new Segment(date.plusHours(4), date.plusHours(6));
        Flight flight = new Flight(Arrays.asList(segment1, segment2));

        TimeOnGroundMoreThenTwoHourFilter hourFilter = new TimeOnGroundMoreThenTwoHourFilter();
        Assertions.assertTrue(hourFilter.filter(flight));
    }

    @Test
    @DisplayName("IfTimeOnGroundLessTwoHour")
    void filterTest3() {
        Segment segment1 = new Segment(date, date.plusHours(2));
        Segment segment2 = new Segment(date.plusHours(4).minusSeconds(1), date.plusHours(6));
        Flight flight = new Flight(Arrays.asList(segment1, segment2));

        TimeOnGroundMoreThenTwoHourFilter hourFilter = new TimeOnGroundMoreThenTwoHourFilter();
        Assertions.assertTrue(hourFilter.filter(flight));
    }

    @Test
    @DisplayName("IfListSegmentsLessTwo")
    void filterTest4() {
        Segment segment1 = new Segment(date, date.plusHours(2));
        Flight flight = new Flight(Arrays.asList(segment1));

        TimeOnGroundMoreThenTwoHourFilter hourFilter = new TimeOnGroundMoreThenTwoHourFilter();
        Assertions.assertTrue(hourFilter.filter(flight));
    }



}