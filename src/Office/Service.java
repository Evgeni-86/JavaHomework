package Office;

import java.util.Scanner;

public class Service {

    private Service() {
    }

    ;

    public static final Scanner SC = new Scanner(System.in);

    public static final String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь",
            "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};

    public static void menu() {
        System.out.println("----Меню----");
        System.out.println("Считать все месячные отчёты 1\n" +
                "Считать годовой отчёт 2\n" +
                "Сверить отчёты 3\n" +
                "Вывести информацию о всех месячных отчётах 4\n" +
                "Вывести информацию о годовом отчёте 5\n");
    }

    public static String getMonthString(int numberMonth) {
        return months[numberMonth - 1];
    }
}
