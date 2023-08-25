package Office2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.TreeMap;

public class MonthlyReport {
    private static boolean read;
    private static final TreeMap<YearMonth, ArrayList<MonthlyReportItem>> dataReports = new TreeMap<>();

    private MonthlyReport() {
    }

    public static boolean isRead() {
        return read;
    }

    public static TreeMap<YearMonth, ArrayList<MonthlyReportItem>> getDataReports() {
        return dataReports;
    }

    //----------------------------------------------------------------------------------
    public static int getProfitMonthly(YearMonth yearAndMonth) {
        int profit = 0;

        ArrayList<MonthlyReportItem> currentMonthly = dataReports.get(yearAndMonth); //получаем месяц

        for (int i = 0; i < currentMonthly.size(); i++) {
            MonthlyReportItem curItem = currentMonthly.get(i);
            if (!curItem.isIs_expense()) {
                profit += curItem.getQuantity() * curItem.getSum_of_one();
            }
        }
        return profit;
    }

    //--------------------------------------------------------------------------------
    public static int getSpendMonthly(YearMonth yearAndMonth) {
        int spend = 0;

        ArrayList<MonthlyReportItem> currentMonthly = dataReports.get(yearAndMonth);

        for (int i = 0; i < currentMonthly.size(); i++) {
            MonthlyReportItem curItem = currentMonthly.get(i);
            if (curItem.isIs_expense()) {
                spend += curItem.getQuantity() * curItem.getSum_of_one();
            }
        }
        return spend;
    }

    //-------------------------------------------------------------
    public static void readMonthlyReports(File directory) {
        dataReports.clear();
        if (directory.listFiles() == null) {
            System.out.println("не верный путь к файлам");
            return;
        }

        for (File curFile : directory.listFiles()) {
            if (curFile.getName().startsWith("m")) {

                ArrayList<MonthlyReportItem> currentMonthlyItems = new ArrayList<>();

                try (BufferedReader bReader = new BufferedReader(new FileReader(curFile))) {
                    //Можно было прочитать и Files.readAllLines(path) -> получим List<String>
                    bReader.readLine(); //пропустим первую строку
                    String s;
                    while ((s = bReader.readLine()) != null) {
                        if (s.length() == 0) {
                            continue;
                        }
                        String[] s_arr = s.split(",");

                        MonthlyReportItem currentItem = new MonthlyReportItem();

                        currentItem.setItem_name(s_arr[0]);
                        currentItem.setIs_expense(Boolean.parseBoolean(s_arr[1]));
                        currentItem.setQuantity(Integer.parseInt(s_arr[2]));
                        currentItem.setSum_of_one(Integer.parseInt(s_arr[3]));

                        currentMonthlyItems.add(currentItem);
                    }
                    //РАБОТА С ДАТОЙ
                    String currentMonthReportName = curFile.getName().replaceAll("\\D+", "");
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMM");
                    YearMonth monthYearData = YearMonth.parse(currentMonthReportName,formatter);

                    dataReports.put(monthYearData, currentMonthlyItems);

                } catch (IOException e) {
                    System.out.println("отчет не считан");
                    throw new RuntimeException(e);
                }
            }
        }

        if (dataReports.size() > 0) {
            read = true;
            System.out.println("Done!");
        } else {
            System.out.println("отчеты не считаны");
        }
    }

}
