package DZ;

import DZ.source.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Flight> flightList = FlightBuilder.createFlights();

        System.out.println(flightsFilter(flightList, new ArrivalBeforeDepartureFilter()));
        System.out.println(flightsFilter(flightList, new DepartureBeforeNowTimeFilter()));
        System.out.println(flightsFilter(flightList, new TimeOnGroundMoreThenTwoHourFilter()));

    }

    public static List<Flight> flightsFilter(List<Flight> flightList, FilterType filterType) {
        if (flightList == null || flightList.size() == 0 || filterType == null) {
            return flightList;
        }
        return flightList.stream().filter(elem -> filterType.filter(elem)).toList();
    }

}




