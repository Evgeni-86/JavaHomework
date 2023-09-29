package algoritms;

import java.util.*;
import java.util.stream.Collectors;

public class Test3 {

    public static void main(String[] args) {

        Map<String, Double[]> lessons = new LinkedHashMap<>();

        lessons.put("рис", new Double[]{8.00, 10.00});
        lessons.put("анг", new Double[]{9.30, 10.30});
        lessons.put("мат-ка", new Double[]{10.00, 11.00});
        lessons.put("инф-ка", new Double[]{10.30, 11.30});
        lessons.put("муз-ка", new Double[]{11.00, 12.00});

//        lessons.put("рис", new Double[]{8.00, 9.10});
//        lessons.put("анг", new Double[]{9.00, 11.00});
//        lessons.put("мат-ка", new Double[]{9.20, 12.00});
//        lessons.put("инф-ка", new Double[]{10.50, 11.30});

//        рис анг    2
//        рис мат-ка 3  \
//        рис инф-ка 1
//
//        анг мат-ка 2
//        анг инф-ка 3
//
//        мат инф-ка 3
//

        Map<String, LinkedList<String>> parenAndChildren = new HashMap<>();

        Iterator<Map.Entry<String, Double[]>> iterator = lessons.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double[]> currentElement = iterator.next();
            String nameCurrentLesson = currentElement.getKey();
            Double[] startEndCurrentLesson = currentElement.getValue();
            iterator.remove();

            for (Map.Entry<String, Double[]> checkLesson : lessons.entrySet()) {
                double[] resultCheck = checkInterval(startEndCurrentLesson, checkLesson.getValue());
                if (resultCheck.length == 0) { //если не пересекаются
//                    System.out.println("nameCurrentLesson : " + nameCurrentLesson + " checkLesson : " + checkLesson.getKey());

                    if (parenAndChildren.containsKey(nameCurrentLesson)) {
                        parenAndChildren.get(nameCurrentLesson).add(new String(checkLesson.getKey()));
                    } else {
                        parenAndChildren.put(nameCurrentLesson, new LinkedList<>(Arrays.asList(new String(checkLesson.getKey()))));
                    }

                    //                    double sumCurrentAndCheckLessons =
//                            startEndCurrentLesson[1] - startEndCurrentLesson[0] +
//                                    checkLesson.getValue()[1] - checkLesson.getValue()[0];
//
//                    pairLessonsAndTime.put(nameCurrentLesson + "," + checkLesson.getKey(), sumCurrentAndCheckLessons);
                }
            }
        }

        double generalInterval = 4.0;
    }


    public static double[] checkInterval(Double[] interval1, Double[] interval2) {
        double start = Math.max(interval1[0], interval2[0]);
        double end = Math.min(interval1[1], interval2[1]);
        if (start >= end) {
            return new double[]{};
        } else {
            return new double[]{start, end};
        }
    }
}
