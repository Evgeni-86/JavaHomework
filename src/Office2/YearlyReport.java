package Office2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.TreeMap;

public class YearlyReport {
    private static boolean read;
    private static final TreeMap<Year, ArrayList<YearlyReportItem>> dataReports = new TreeMap<>();

    private YearlyReport() {
    }

    public static boolean isRead() {
        return read;
    }

    public static TreeMap<Year, ArrayList<YearlyReportItem>> getDataReports() {
        return dataReports;
    }

    //-------------------------------------------------------------------
    public static void readYearlyReports(File directory) {
        dataReports.clear();
        if (directory.listFiles() == null) {
            System.out.println("не верный путь к файлам");
            return;
        }

        for (File curFile : directory.listFiles()) {
            if (curFile.getName().startsWith("y")) {

                ArrayList<YearlyReportItem> currentYearReportItems = new ArrayList<>();

                try (BufferedReader bReader = new BufferedReader(new FileReader(curFile))) {

                    bReader.readLine(); //пропускаем первую строку
                    String s;
                    while ((s = bReader.readLine()) != null) {
                        if (s.length() == 0) {
                            continue;
                        }
                        String[] s_arr = s.split(",");
                        YearlyReportItem currentItem = new YearlyReportItem();

                        currentItem.setMonth(Integer.parseInt(s_arr[0]));
                        currentItem.setAmount(Integer.parseInt(s_arr[1]));
                        currentItem.setIs_expense(Boolean.parseBoolean(s_arr[2]));

                        currentYearReportItems.add(currentItem);
                    }
                    //РАБОТА С ДАТОЙ
                    String currentReportYearName = curFile.getName().replaceAll("\\D+", "");
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
                    Year yearData = Year.parse(currentReportYearName,formatter);

                    dataReports.put(yearData, currentYearReportItems);

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

    //    //////////test
//    public static void main(String[] args) {
//        File file = new File("src/Office2/Reports");
//        YearlyReport.readYearlyReports(file);
//    }

}
