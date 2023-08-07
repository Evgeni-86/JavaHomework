package Office;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;

public class YearlyReport {
    private static boolean read;
    private static HashMap<String, ArrayList<YearlyReportItem>> dataReports = new HashMap<>();

    private YearlyReport() {
    }

    public static boolean isRead() {
        return read;
    }

    public static HashMap<String, ArrayList<YearlyReportItem>> getDataReports() {
        return dataReports;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    public static void readYearlyReports(File directory) {

        try {
            for (File curFile : directory.listFiles()) {
                if (curFile.getName().startsWith("y")) {

                    ArrayList<YearlyReportItem> currentYear = new ArrayList<>();

                    BufferedReader bReader = new BufferedReader(new FileReader(curFile));
                    bReader.readLine(); //пропускаем первую строку
                    String s;
                    while ((s = bReader.readLine()) != null) {
                        String[] s_arr = s.split(",");
                        YearlyReportItem currentItem = new YearlyReportItem();

                        currentItem.setMonth(Integer.parseInt(s_arr[0]));
                        currentItem.setAmount(Integer.parseInt(s_arr[1]));
                        currentItem.setIs_expense(Boolean.parseBoolean(s_arr[2]));

                        currentYear.add(currentItem);
                    }

                    dataReports.put(curFile.getName(), currentYear);
                }
            }
            read = true;
            System.out.println("Done!");

        } catch (IOException e) {
            System.out.println("данные не считались");
            e.printStackTrace();
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