package DZ.source;
/*
3. общее время, проведённое на земле превышает два часа (время на земле — это интервал между прилётом одного сегмента и вылетом следующего за ним)
*/

import java.time.Duration;
import java.util.List;

public class TimeOnGroundMoreThenTwoHourFilter implements FilterType {
    @Override
    public boolean filter(Flight flight) {
        List<Segment> segmentList = flight.getSegments();

        if (segmentList.size() < 2) {
            return true;
        }

        for (int i = 1; i < segmentList.size(); i++) {
            Segment arrival = segmentList.get(i - 1);
            Segment departure = segmentList.get(i);

            if (arrival == null || departure == null){
                continue;
            }

            if (departure.getDepartureDate().isAfter(arrival.getArrivalDate())) {
                Duration duration = Duration.between(arrival.getArrivalDate(), departure.getDepartureDate());
                if (duration.getSeconds() > 7200){
                    return false;
                }
            }
        }

        return true;
    }
}
