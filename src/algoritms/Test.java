package algoritms;

import java.util.*;

public class Test {


    public static void main(String[] args) {

        Map<String, Double[]> lessons = new HashMap<>();

//        lessons.put("рис", new Double[]{8.00, 10.00});
//        lessons.put("анг", new Double[]{9.30, 10.30});
//        lessons.put("мат-ка", new Double[]{10.00, 11.00});
//        lessons.put("инф-ка", new Double[]{10.30, 11.30});
//        lessons.put("муз-ка", new Double[]{11.00, 12.00});

        lessons.put("рис", new Double[]{8.00, 9.10});
        lessons.put("анг", new Double[]{9.00, 11.00});
        lessons.put("мат-ка", new Double[]{9.20, 12.00});
        lessons.put("инф-ка", new Double[]{10.50, 11.30});


        List<String> result = new ArrayList<>();

        Double[] targetPeriod = new Double[]{8.00, 12.00};
        Map<String, Double[]> lessonsTemp = new HashMap<>(lessons);


        double targetPeriodEnd = targetPeriod[1];
        double endTimeLastLesson = targetPeriod[0];


        while (true) {

            String bestLessonNameTemp = null;
            double bestLessonEndTimeTemp = 0;
            double bestTimeToStartLessonTemp = targetPeriodEnd;

            for (Map.Entry<String, Double[]> entry : lessonsTemp.entrySet()) {

                String currentLessonName = entry.getKey();
                double startCurrenLesson = entry.getValue()[0];
                double endCurrenLesson = entry.getValue()[1];

                if (startCurrenLesson >= endTimeLastLesson && endCurrenLesson <= targetPeriodEnd) {

                    double timeToStartCurrentLesson = startCurrenLesson - endTimeLastLesson;
                    if (timeToStartCurrentLesson <= bestTimeToStartLessonTemp) {

                        bestLessonNameTemp = currentLessonName;
                        bestLessonEndTimeTemp = endCurrenLesson;
                        bestTimeToStartLessonTemp = timeToStartCurrentLesson;
                    }

                }

            }
            if (bestLessonNameTemp == null) {
                break;
            }

            endTimeLastLesson = bestLessonEndTimeTemp;
            result.add(bestLessonNameTemp);
            lessonsTemp.remove(bestLessonNameTemp);

        }
        System.out.println(result);
    }

}
