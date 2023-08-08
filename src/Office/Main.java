package Office;

import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        File directory = new File("src/Office/Reports");

        loop:
        while (true) {
            Service.menu();
            String input = Service.SC.nextLine();

            switch (input) {
                case "1":
                    MonthlyReport.readMonthlyReports(directory);
                    break;
                case "2":
                    YearlyReport.readYearlyReports(directory);
                    break;
                case "3":
                    if (MonthlyReport.isRead() && YearlyReport.isRead()) {
                        checkReports(YearlyReport.getDataReports(), MonthlyReport.getDataReports());
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
                case "end":
                    break loop;
                default:
                    System.out.println("error input");
            }
        }
    }

    //------------------------------------------------------------------------------------------------
    static public void checkReports(TreeMap<String, ArrayList<YearlyReportItem>> yearlyReportData,
                                    TreeMap<String, ArrayList<MonthlyReportItem>> monthlyReportData) {

        for (Map.Entry<String, ArrayList<YearlyReportItem>> entryYear : yearlyReportData.entrySet()) {
            String nameCurrentYearReport = entryYear.getKey();
            String currentYearNumber = nameCurrentYearReport.replaceAll(".(\\d{4})*", "$1");

            ArrayList<YearlyReportItem> yearReportItemsArrayListCopy = new ArrayList<>(entryYear.getValue()); //МАССИВ ЭЛЕМЕНТОВ ГОДОВОГО ОТЧЕТА
            StringBuilder checkProfit = new StringBuilder();
            StringBuilder checkSpend = new StringBuilder();

            //-------Цикл по месячным отчетам--------------------------------
            for (Map.Entry<String, ArrayList<MonthlyReportItem>> entryMonth : monthlyReportData.entrySet()) {
                String currentMonthReport = entryMonth.getKey();

                int currentReportMonthNumber = Integer.parseInt(currentMonthReport.replaceAll(".(\\d{2})*", "$1"));

                int yearlyReportItemAmountProfit = 0;
                int yearlyReportItemAmountSpend = 0;

                //ИЩЕМ ДАННЫЕ О ТЕКУЩЕМ МЕСЯЦЕ В ТЕКУЩЕМ ГОДОВОМ ОТЧЕТЕ
                for (int i = 0; i < yearReportItemsArrayListCopy.size(); i++) {
                    YearlyReportItem yearlyReportItem = yearReportItemsArrayListCopy.get(i);

                    if (yearlyReportItem.getMonth() == currentReportMonthNumber) {
                        int yearlyReportItemAmount = yearlyReportItem.getAmount();

                        if (!yearlyReportItem.getIs_expense()) { //если строка дохода
                            yearlyReportItemAmountProfit += yearlyReportItemAmount;
                        } else {
                            yearlyReportItemAmountSpend += yearlyReportItemAmount;
                        }

                        yearReportItemsArrayListCopy.remove(i);//удаление элемента после чтения
                        i--;
                    }
                }

                //СВЕРКА ДАННЫХ ТЕКУЩЕГО МЕСЯЦА В ГОДОВОМ ОТЧЕТЕ
                int profitCurrentMonthly = MonthlyReport.getProfitMonthly(currentMonthReport);
                int spendCurrentMonthly = MonthlyReport.getSpendMonthly(currentMonthReport);
                //ЗАПИШЕМ НЕСООТВЕТСТВИЯ
                if (profitCurrentMonthly != yearlyReportItemAmountProfit) {
                    checkProfit.append("год : " + currentYearNumber + " месяц : " + currentReportMonthNumber + ",\n");
                }
                if (spendCurrentMonthly != yearlyReportItemAmountSpend) {
                    checkSpend.append("год : " + currentYearNumber + " месяц : " + currentReportMonthNumber + ",\n");
                }

            }
            //--ИТОГИ СВЕРКИ ОТЧЕТОВ-----------------------------------------------------------
            if (yearReportItemsArrayListCopy.size() > 0) {
                System.out.println("нет месячного отчета для годового отчета : ");
                for (YearlyReportItem yearlyReport :yearReportItemsArrayListCopy               ) {
                    System.out.println("год : " + currentYearNumber + " месяц : " + yearlyReport.getMonth() +
                            " Is_expense : " + yearlyReport.getIs_expense() + ", ");
                }
            } else if (checkProfit.length() > 0) {
                System.out.println("несоответствие отчетов доходы : \n" + checkProfit);
            } else if (checkSpend.length() > 0) {
                System.out.println("несоответствие отчетов расходы : \n" + checkSpend);
            } else {
                System.out.println("отчеты соответствуют");
            }

        }
    }


    //-----------------------------------------------------------------------------------------------
    static public void printMonthlyReports(TreeMap<String, ArrayList<MonthlyReportItem>> data) {

        for (Map.Entry<String, ArrayList<MonthlyReportItem>> entry : data.entrySet()) {
            String nameMonth = entry.getKey().split("\\.")[1]; //берем строку только месяц
            System.out.println("Название месяца : " + nameMonth);

            ArrayList<MonthlyReportItem> items = entry.getValue();
            String bigProfitName = "";
            String bigSpendName = "";
            int bigProfit = 0;
            int bigSpend = 0;

            for (MonthlyReportItem currentItem : items) {
                boolean is_expense = currentItem.isIs_expense();
                int quantity = currentItem.getQuantity();
                int sum_of_one = currentItem.getSum_of_one();

                if (!is_expense) { //если доход
                    if (quantity * sum_of_one > bigProfit) {     //если профит больше базового
                        bigProfitName = currentItem.getItem_name();
                        bigProfit = quantity * sum_of_one;
                    }
                } else { //если расход
                    if (quantity * sum_of_one > bigSpend) {
                        bigSpendName = currentItem.getItem_name();
                        bigSpend = quantity * sum_of_one;
                    }
                }

            }

            System.out.println("Самый прибыльный товар : " + bigProfitName + ", сумма : " + bigProfit);
            System.out.println("Самая большая трата : " + bigSpendName + ", сумма : " + bigSpend);
        }
    }

    //-----------------------------------------------------------------------------------------------
    static public void printYearsReports(TreeMap<String, ArrayList<YearlyReportItem>> data) {

        int numberMonthly = -1;
        int sumMonth = 0;
        int profitGeneral = 0; //доход общий
        int spendGeneral = 0; //расход общий

        for (Map.Entry<String, ArrayList<YearlyReportItem>> entry : data.entrySet()) {
            String nameYear = entry.getKey().split("\\.")[1];
            System.out.println("Рассматриваемый год : " + nameYear);

            ArrayList<YearlyReportItem> months = entry.getValue();

            for (int i = 0; i < months.size(); i++) {
                YearlyReportItem currentMonth = months.get(i);
                //Запишем доход или расход за месяц
                if (!currentMonth.getIs_expense()) { //если строка доход
                    sumMonth += currentMonth.getAmount(); //прибавляем
                    profitGeneral += currentMonth.getAmount(); //увеличиваем общий доход
                } else {
                    sumMonth -= currentMonth.getAmount(); //вычитаем
                    spendGeneral += currentMonth.getAmount(); //увеличиваем общий расход
                }
                //Подсчет прибыли за месяц
                if (currentMonth.getMonth() == numberMonthly || i == months.size() - 1) {
                    System.out.println("Прибыль за " + Service.months[currentMonth.getMonth() - 1] + " = " + sumMonth);
                    sumMonth = 0;
                    numberMonthly = -1;//удаляем номер месяца из переменной
                }
                numberMonthly = currentMonth.getMonth(); //запомним текущий месяц
            }

//            for (YearlyReportItem currentMonth : months) {
//                //Запишем доход или расход за месяц
//                if (!currentMonth.getIs_expense()) { //если строка доход
//                    sumMonth += currentMonth.getAmount(); //прибавляем
//                    profitGeneral += currentMonth.getAmount(); //увеличиваем общий доход
//                } else {
//                    sumMonth -= currentMonth.getAmount(); //вычитаем
//                    spendGeneral += currentMonth.getAmount(); //увеличиваем общий расход
//                }
//                //Подсчет прибыли за месяц
//                if (currentMonth.getMonth() == numberMonthly ||) {
//                    System.out.println("Прибыль за " + Service.months[currentMonth.getMonth() - 1] + " = " + sumMonth);
//                    sumMonth = 0;
//                    numberMonthly = -1;//удаляем номер месяца из переменной
//                }
//                numberMonthly = currentMonth.getMonth(); //запомним текущий месяц
//            }

            System.out.println("Средний расход за все месяцы в году : " + (spendGeneral / (months.size() / 2)));
            System.out.println("Средний доход за все месяцы в году : " + (profitGeneral / (months.size() / 2)));
        }
    }

}
