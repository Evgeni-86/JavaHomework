package algoritms;

import java.util.Comparator;

public class Test implements Comparable<String> {

    int a = 10;

    @Override
    public int compareTo(String o) {
        return o.length() - a;
    }
}
