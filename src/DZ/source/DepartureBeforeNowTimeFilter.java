package DZ.source;

import java.time.LocalDateTime;

public class DepartureBeforeNowTimeFilter implements FilterType{//1. вылет до текущего момента времени
    @Override
    public boolean filter(Flight flight) {
        for (Segment currentSegment : flight.getSegments()) {
            if (currentSegment != null && currentSegment.getDepartureDate().isBefore(LocalDateTime.now())) {
                return false;
            }
        }
        return true;
    }
}
