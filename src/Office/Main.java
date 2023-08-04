package Office;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        File directly = new File("src/Office/Reports");

        while (true) {
            Service.menu();
            String input = Service.SC.nextLine();

            switch (input) {
                case "1":
                    MonthlyReport.readMonthlyReports(directly);
                    break;
                case "2":
                    YearlyReport.readMonthlyReports(directly);
                    break;
                case "3":
                    if (MonthlyReport.isRead() && YearlyReport.isRead()) {
                        checkReports(YearlyReport.getDataReports());
                    } else {
                        System.out.println("считайте все отчеты");
                    }
                    break;
                case "4":
                    if (MonthlyReport.isRead()) {
                        printMonthlyReports(MonthlyReport.getDataReports());
                    } else {
                        System.out.println("считайте отчеты за месяц");
                    }
                    break;
                case "5":
                    if (YearlyReport.isRead()) {
                        printYearsReports(YearlyReport.getDataReports());
                    } else {
                        System.out.println("считайте отчеты за год");
                    }
                    break;
                default:
                    System.out.println("error input");
            }
        }
    }

    //-----------------------------------------------------------------------------------------------
    static public void checkReports(HashMap<String, ArrayList<YearlyReportItem>> data) {
        StringBuilder check = new StringBuilder();

        for (Map.Entry<String, ArrayList<YearlyReportItem>> entry : data.entrySet()) {
            String nameYear = entry.getKey();
            String numbersYear = nameYear.split("\\.")[1];

            ArrayList<YearlyReportItem> months = entry.getValue();

            for (YearlyReportItem currentMonth : months) {
                //имя месячного отсчета
                String monthlyReportName = "m." + numbersYear + String.format("%02d", currentMonth.getMonth()) + ".csv";

                if (!currentMonth.getIs_expense()) { //если строка дохода
                    //сумма строк дохода за месяц
                    int profitMonthly = MonthlyReport.getProfitMonthly(monthlyReportName);
                    if (currentMonth.getAmount() != profitMonthly) {
                        check.append("доходы : ").append(String.format("%02d", currentMonth.getMonth())).append(", ");
                    }
                } else {
                    //сумма строк расхода за месяц
                    int spendMonthly = MonthlyReport.getSpendMonthly(monthlyReportName);
                    if (currentMonth.getAmount() != spendMonthly) {
                        check.append("расходы : ").append(String.format("%02d", currentMonth.getMonth())).append(", ");
                    }
                }

            }
        }

        if (check.length() > 0) {
            System.out.println("несоответствие отчетов : " + check);
        } else {
            System.out.println("отчеты соответствуют");
        }
    }

    //-----------------------------------------------------------------------------------------------
    static public void printMonthlyReports(HashMap<String, ArrayList<MonthlyReportItem>> data) {

        for (Map.Entry<String, ArrayList<MonthlyReportItem>> entry : data.entrySet()) {
            String nameMonth = entry.getKey().split("\\.")[1];
            System.out.println("Название месяца : " + nameMonth);

            ArrayList<MonthlyReportItem> items = entry.getValue();
            String bigProfitItem = "";
            String bigSpendingItem = "";
            int bigProfit = 0;
            int bigSpend = 0;

            for (MonthlyReportItem currentItem : items) {
                boolean is_expense = currentItem.isIs_expense();
                int quantity = currentItem.getQuantity();
                int sum_of_one = currentItem.getSum_of_one();

                if (!is_expense) { //если доход
                    if (quantity * sum_of_one > bigProfit) {     //если профит больше базового
                        bigProfitItem = currentItem.getItem_name();
                        bigProfit = quantity * sum_of_one;
                    }
                } else { //если расход
                    if (quantity * sum_of_one > bigSpend) {
                        bigSpendingItem = currentItem.getItem_name();
                        bigSpend = quantity * sum_of_one;
                    }
                }

            }

            System.out.println("Самый прибыльный товар : " + bigProfitItem + ", сумма : " + bigProfit);
            System.out.println("Самая большая трата : " + bigSpendingItem + ", сумма : " + bigSpend);
        }
    }

    //-----------------------------------------------------------------------------------------------
    static public void printYearsReports(HashMap<String, ArrayList<YearlyReportItem>> data) {

        int numberMonthly = -1;
        int sumMonth = 0;
        int profitGeneral = 0; //доход общий
        int spendGeneral = 0; //расход общий

        for (Map.Entry<String, ArrayList<YearlyReportItem>> entry : data.entrySet()) {
            String nameYear = entry.getKey().split("\\.")[1];
            System.out.println("Рассматриваемый год : " + nameYear);
            ArrayList<YearlyReportItem> months = entry.getValue();

            for (YearlyReportItem currentMonth : months) {
                //Запишем доход или расход за месяц
                if (!currentMonth.getIs_expense()) { //если строка доход
                    sumMonth += currentMonth.getAmount(); //прибавляем
                    profitGeneral += currentMonth.getAmount(); //увеличиваем общий доход
                } else {
                    sumMonth -= currentMonth.getAmount(); //вычитаем
                    spendGeneral += currentMonth.getAmount(); //увеличиваем общий расход
                }
                //Подсчет прибыли за месяц
                if (currentMonth.getMonth() == numberMonthly) {
                    System.out.println("Прибыль за " + Service.months[currentMonth.getMonth() - 1] + " = " + sumMonth);
                    sumMonth = 0;
                    numberMonthly = -1;//удаляем номер месяца из переменной
                }
                numberMonthly = currentMonth.getMonth(); //запомним текущий месяц
            }

            System.out.println("Средний расход за все месяцы в году : " + (spendGeneral / (months.size() / 2)));
            System.out.println("Средний доход за все месяцы в году : " + (profitGeneral / (months.size() / 2)));
        }
    }

}
