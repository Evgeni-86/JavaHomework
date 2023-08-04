//package Office;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class MonthlyReport {
//    private static boolean read;
//    private static HashMap<String, ArrayList<MonthlyReportItem>> dataReports = new HashMap<>();
//
//    private MonthlyReport() {
//    }
//
//    public static boolean isRead() {
//        return read;
//    }
//
//    public static HashMap<String, ArrayList<MonthlyReportItem>> getDataReports() {
//        return dataReports;
//    }
//    /////////////////////////////////////////////////////////////////////////////////////////////////
////----------------------------------------------------------------------------------
//    public static int getProfitMonthly(String monthly) {
//        int profit = 0;
//
//        ArrayList<MonthlyReportItem> currentMonthly = dataReports.get(monthly); //получаем месяц
//
//        for (int i = 0; i < currentMonthly.size(); i++) {
//            MonthlyReportItem curItem = currentMonthly.get(i);
//            if (!curItem.isIs_expense()) {
//                profit += curItem.getQuantity() * curItem.getSum_of_one();
//            }
//        }
//        return profit;
//    }
//    //--------------------------------------------------------------------------------
//    public static int getSpendMonthly(String monthly) {
//        int spend = 0;
//
//        ArrayList<MonthlyReportItem> currentMonthly = dataReports.get(monthly);
//
//        for (int i = 0; i < currentMonthly.size(); i++) {
//            MonthlyReportItem curItem = currentMonthly.get(i);
//            if (curItem.isIs_expense()) {
//                spend += curItem.getQuantity() * curItem.getSum_of_one();
//            }
//        }
//        return spend;
//    }
//
//
//    //-------------------------------------------------------------------------------------
//    public static void readMonthlyReports(File directory) {
//        try {
//
//            for (File curFile : directory.listFiles()) {
//                if (curFile.getName().startsWith("m")) {
//
//                    ArrayList<MonthlyReportItem> currentMonthly = new ArrayList<>();
//
//                    String currentReport = Files.readString(Path.of(curFile.getAbsolutePath()));
//                    String[] reportArr = currentReport.split("\n");
//
//                    for (int i = 1; i < reportArr.length; i++) {
//                        MonthlyReportItem currentItem = new MonthlyReportItem();
//
//                        String[] rep = reportArr[i].split(",");
//
//                        currentItem.setItem_name(rep[0]);
//                        currentItem.setIs_expense(Boolean.parseBoolean(rep[1]));
//                        currentItem.setQuantity(Integer.parseInt(rep[2]));
//                        currentItem.setSum_of_one(Integer.parseInt(rep[3]));
//
//                        currentMonthly.add(currentItem);
//                    }
//
//                    dataReports.put(curFile.getName(), currentMonthly);
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
//    //////////test
//    public static void main(String[] args) {
//        File file = new File("src/Office/Reports");
//        MonthlyReport.readMonthlyReports(file);
//    }
//
//}
