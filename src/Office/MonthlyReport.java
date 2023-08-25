package Office;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class MonthlyReport {
    private static boolean read;
    private static TreeMap<String, ArrayList<MonthlyReportItem>> dataReports = new TreeMap<>();

    private MonthlyReport() {
    }

    public static boolean isRead() {
        return read;
    }

    public static TreeMap<String, ArrayList<MonthlyReportItem>> getDataReports() {
        return dataReports;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////
//----------------------------------------------------------------------------------
    public static int getProfitMonthly(String monthly) {
        int profit = 0;

        ArrayList<MonthlyReportItem> currentMonthly = dataReports.get(monthly); //получаем месяц

        for (int i = 0; i < currentMonthly.size(); i++) {
            MonthlyReportItem curItem = currentMonthly.get(i);
            if (!curItem.isIs_expense()) {
                profit += curItem.getQuantity() * curItem.getSum_of_one();
            }
        }
        return profit;
    }

    //--------------------------------------------------------------------------------
    public static int getSpendMonthly(String monthly) {
        int spend = 0;

        ArrayList<MonthlyReportItem> currentMonthly = dataReports.get(monthly);

        for (int i = 0; i < currentMonthly.size(); i++) {
            MonthlyReportItem curItem = currentMonthly.get(i);
            if (curItem.isIs_expense()) {
                spend += curItem.getQuantity() * curItem.getSum_of_one();
            }
        }
        return spend;
    }

    /////////////////////////////////////////////////////////////////////////
    public static void readMonthlyReports(File directory) {
        dataReports.clear();
        if (directory.listFiles() == null) {
            System.out.println("не верный путь к файлам");
            return;
        }

        for (File curFile : directory.listFiles()) {
            if (curFile.getName().startsWith("m")) {

                ArrayList<MonthlyReportItem> currentMonthly = new ArrayList<>();

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

                        currentMonthly.add(currentItem);
                    }

                    dataReports.put(curFile.getName(), currentMonthly);

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

//    public static void readMonthlyReports(File directory) {
//        dataReports.clear();
//        try {
//            for (File curFile : directory.listFiles()) {
//                if (curFile.getName().startsWith("m")) {
//
//                    ArrayList<MonthlyReportItem> currentMonthly = new ArrayList<>();
//                    //Можно было прочитать и Files.readAllLines(path) -> получим List<String>
//                    BufferedReader bReader = new BufferedReader(new FileReader(curFile));
//                    bReader.readLine(); //пропустим первую строку
//                    String s;
//                    while ((s = bReader.readLine()) != null) {
//                        if (s.length() == 0) {
//                            continue;
//                        }
//                        String[] s_arr = s.split(",");
//
//                        MonthlyReportItem currentItem = new MonthlyReportItem();
//
//                        currentItem.setItem_name(s_arr[0]);
//                        currentItem.setIs_expense(Boolean.parseBoolean(s_arr[1]));
//                        currentItem.setQuantity(Integer.parseInt(s_arr[2]));
//                        currentItem.setSum_of_one(Integer.parseInt(s_arr[3]));
//
//                        currentMonthly.add(currentItem);
//                    }
//                    bReader.close();
//                    dataReports.put(curFile.getName(), currentMonthly);
//                }
//            }
//            if (dataReports.size() > 0) {
//                read = true;
//                System.out.println("Done!");
//            } else {
//                System.out.println("отчеты не считаны");
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("данные не считались");
//        }
//
//    }

//    //////////test
//    public static void main(String[] args) {
//        File file = new File("src/Office/Reports");
//        MonthlyReport.readMonthlyReports(file);
//    }

}
