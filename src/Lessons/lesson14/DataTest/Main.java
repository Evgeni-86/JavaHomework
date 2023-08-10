package Lessons.lesson14.DataTest;

import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String yearString = "10 2021";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM yyyy");
        YearMonth yearData = YearMonth.parse(yearString,formatter);
        System.out.println(yearData);

        System.out.println(yearData.getYear());
        System.out.println(yearData.getMonthValue());
    }
}
