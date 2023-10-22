package DZ.source;

public class ArrivalBeforeDepartureFilter implements FilterType {//2. имеются сегменты с датой прилёта раньше даты вылета

    @Override
    public boolean filter(Flight flight) {
        for (Segment currentSegment : flight.getSegments()) {
            if (currentSegment != null && currentSegment.getArrivalDate().isBefore(currentSegment.getDepartureDate())) {
                return false;
            }
        }
        return true;
    }
}
