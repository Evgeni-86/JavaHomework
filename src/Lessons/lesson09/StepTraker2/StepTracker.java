package Lessons.lesson09.StepTraker2;

public class StepTracker {
    private int targetStep = 10000;
    private final MonthData[] monthToData;

    StepTracker() {
        monthToData = new MonthData[12];
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public void setTargetStep(int targetStep) { //Изменение цели
        if (targetStep >= 0) {
            this.targetStep = targetStep;
        }
    }

    public void addData(int[] inputData) { //Ввод данных
        //Доступ к месяцу если номер верен (inputData = [месяц, день, количество])
        if (inputData[0] >= 0 && inputData[0] < monthToData.length) {
            MonthData monthCurrent = monthToData[inputData[0]];
            monthCurrent.getDayData()[inputData[1]] = inputData[2];
        }
    }

    public void getStatistic(int number) {
        int stepsMonth = 0;
        int maxStepsMonth = 0;
        int counter = 0;
        int bestSeries = 0;

        int[] thisMonth = monthToData[number].getDayData();

        for (int i = 0; i < thisMonth.length; i++) {
            System.out.print("День: "+ (i + 1) + " Шагов: " + thisMonth[i] + ", ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }

            stepsMonth += thisMonth[i];

            if (thisMonth[i] > maxStepsMonth) {
                maxStepsMonth = thisMonth[i];
            }

            if (thisMonth[i] > targetStep) {
                counter++;
                if (counter > bestSeries) {
                    bestSeries = counter;
                }
            } else {
                counter = 0;
            }
        }

        System.out.printf("Общее количество шагов за месяц: %s%n", stepsMonth);
        System.out.printf("Максимальное пройденное количество шагов в месяце: %s%n", maxStepsMonth);
        System.out.printf("Среднее количество шагов в месяце: %s%n", stepsMonth / 30);
        double dist = (stepsMonth / 0.7) / 1000;
        System.out.printf("Пройденная дистанция (в км): %.2f%n", dist);
        double kkal = (1.15 * 70 * stepsMonth * 70) / 100000;
        System.out.printf("Количество сожжённых килокалорий: %.2f%n", kkal);
        System.out.printf("Лучшая серия месяца: %s д.%n", bestSeries);
    }

}
