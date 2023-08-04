package Lessons.lesson09.StepTraker2;

public class Main {
    public static void main(String[] args) {

        StepTracker stepTracker = new StepTracker();

        stepTracker.addData(new int[]{0,27, 20000});
        stepTracker.addData(new int[]{0,28, 20000});
        stepTracker.addData(new int[]{0,29, 20000});
        stepTracker.addData(new int[]{1,0, 25000});
        stepTracker.addData(new int[]{1,1, 30000});
        stepTracker.addData(new int[]{1,2, 30000});
        stepTracker.addData(new int[]{1,3, 30000});
        stepTracker.addData(new int[]{1,4, 30000});

        int input = 0;

        while (input != 4) {
            input = Menu.showBasicMenu(); //выбор пункта главного меню
            switch (input) {
                case 1 -> { //ввод данных
                    int[] data = Menu.showInputMenu();//return int[месяц, день, шаги]
                    stepTracker.addData(data);
                }
                case 2 -> { //установка новой цели
                    int targetNum = Menu.showChangeTargetMenu();//return int
                    stepTracker.setTargetStep(targetNum);
                }
                case 3 -> { //статистика
                    int statisticMonth = Menu.showStatisticMenu();//return int - номер месяца
                    stepTracker.getStatistic(statisticMonth);
                }
            }
        }
    }
}
