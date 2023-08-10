package Office;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class YearlyReport {
    private static boolean read;
    private static TreeMap<String, ArrayList<YearlyReportItem>> dataReports = new TreeMap<>();

    private YearlyReport() {
    }

    public static boolean isRead() {
        return read;
    }

    public static TreeMap<String, ArrayList<YearlyReportItem>> getDataReports() {
        return dataReports;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    public static void readYearlyReports(File directory) {
        dataReports.clear();
        if (directory.listFiles() == null) {
            System.out.println("не верный путь к файлам");
            return;
        }

        for (File curFile : directory.listFiles()) {
            if (curFile.getName().startsWith("y")) {

                ArrayList<YearlyReportItem> currentYear = new ArrayList<>();

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

                        currentYear.add(currentItem);
                    }

                    dataReports.put(curFile.getName(), currentYear);

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
//        File file = new File("src/Office/Reports");
//        YearlyReport.readYearlyReports(file);
//    }


//    public static void readYearlyReports(File directory) {
//
//        try {
//
//            for (File curFile : directory.listFiles()) {
//                if (curFile.getName().startsWith("y")) {
//
//                    ArrayList<YearlyReportItem> currentYear = new ArrayList<>();
//
//                    String currentReport = Files.readString(Path.of(curFile.getAbsolutePath()));
//                    String[] reportArr = currentReport.split("\\r?\\n|\\r");
//
//                    for (int i = 1; i < reportArr.length; i++) {
//                        YearlyReportItem currentItem = new YearlyReportItem();
//
//                        String[] rep = reportArr[i].split(",");
//
//                        currentItem.setMonth(Integer.parseInt(rep[0]));
//                        currentItem.setAmount(Integer.parseInt(rep[1]));
//                        currentItem.setIs_expense(Boolean.parseBoolean(rep[2]));
//
//                        currentYear.add(currentItem);
//                    }
//
//                    dataReports.put(curFile.getName(), currentYear);
//                }
//
//                read = true;
//            }
//            System.out.println("Done!");
//
//        } catch (IOException e) {
//            System.out.println("данные не считались");
//            e.printStackTrace();
//        }
//
//    }
//
}
