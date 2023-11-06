package DZ.source;

import java.util.List;
import java.util.stream.Collectors;

public class Flight {
    private final List<Segment> segments;
    //TODO: был default
    public Flight(final List<Segment> segs) {
        segments = segs;
    }

    List<Segment> getSegments() {
        return segments;
    }

    @Override
    public String toString() {
        return segments.stream().map(Object::toString)
                .collect(Collectors.joining(" "));
    }
}