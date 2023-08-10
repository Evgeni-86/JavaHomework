package Office;

import java.io.File;
import java.util.*;

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
            //ГОД ОТЧЕТА 4 ЦИФРЫ
            String currentYearNumber = entryYear.getKey().replaceAll(".(\\d{4})*", "$1");
            //КОПИЯ МАССИВА ЭЛЕМЕНТОВ ГОДОВОГО ОТЧЕТА ЧТОБЫ ИЗ НЕЕ МОЖНО БЫЛО УДАЛЯТЬ
            LinkedList<YearlyReportItem> yearReportItemsArrayListCopy = new LinkedList<>(entryYear.getValue());
            StringBuilder checkProfit = new StringBuilder();
            StringBuilder checkSpend = new StringBuilder();
            StringBuilder checkAvailableProfit = new StringBuilder();
            StringBuilder checkAvailableSpend = new StringBuilder();


            //-------Цикл по месячным отчетам--------------------------------
            for (Map.Entry<String, ArrayList<MonthlyReportItem>> entryMonth : monthlyReportData.entrySet()) {
                String currentMonthReport = entryMonth.getKey();
                String currentReportMonthYearNumber = currentMonthReport.replaceAll(".(\\d{4})*", "$1");
                //ЕСЛИ МЕСЯЦ НЕ ЭТОГО ГОДА -> БЕРЕМ СЛЕДУЮЩИЙ
                if (!currentReportMonthYearNumber.equals(currentYearNumber)) {
                    continue;
                }

                int currentReportMonthNumber = Integer.parseInt(currentMonthReport.replaceAll(".(\\d{2})*", "$1"));
                int yearReportItemAmountProfit = 0;
                int yearReportItemAmountSpend = 0;

                //ИЩЕМ ДАННЫЕ О ТЕКУЩЕМ МЕСЯЦЕ В ТЕКУЩЕМ ГОДОВОМ ОТЧЕТЕ
                Iterator<YearlyReportItem> iterator = yearReportItemsArrayListCopy.iterator();
                while (iterator.hasNext()) {
                    YearlyReportItem yearlyReportItem = iterator.next();
                    if (yearlyReportItem.getMonth() == currentReportMonthNumber) {
                        int itemAmount = yearlyReportItem.getAmount();

                        if (!yearlyReportItem.getIs_expense()) { //если строка дохода
                            yearReportItemAmountProfit += itemAmount;
                        } else {
                            yearReportItemAmountSpend += itemAmount;
                        }
                        iterator.remove();//удаление элемента после чтения
                    }
                }

                int profitCurrentMonthly = MonthlyReport.getProfitMonthly(currentMonthReport);
                int spendCurrentMonthly = MonthlyReport.getSpendMonthly(currentMonthReport);

                //ЕСЛИ ДАННЫЕ ГОДОВОГО ОТЧЕТА ПО МЕСЯЦУ НУЛЕВЫЕ ТО ЗАПИСЫВАЕМ (НЕТ ДАННЫХ)
                //ИНАЧЕ СВЕРКА ДАННЫХ ТЕКУЩЕГО МЕСЯЦА С ГОДОВЫМ ОТЧЕТОМ И ЗАПИСЬ НЕСООТВЕТСТВИЯ
                if (yearReportItemAmountProfit == 0) {
                    checkAvailableProfit.append("год : " + currentYearNumber + " месяц : " + currentReportMonthNumber + "\n");
                } else if (yearReportItemAmountProfit != profitCurrentMonthly) {
                    checkProfit.append("год : " + currentYearNumber + " месяц : " + currentReportMonthNumber + "\n");
                }

                if (yearReportItemAmountSpend == 0) {
                    checkAvailableSpend.append("год : " + currentYearNumber + " месяц : " + currentReportMonthNumber + "\n");
                } else if (yearReportItemAmountSpend != spendCurrentMonthly) {
                    checkSpend.append("год : " + currentYearNumber + " месяц : " + currentReportMonthNumber + "\n");
                }

            }
            //--ИТОГИ СВЕРКИ ОТЧЕТОВ-----------------------------------------------------------
            boolean rezultChecking = true;
            if (yearReportItemsArrayListCopy.size() > 0) {
                System.out.println("нет месячного отчета для годового отчета : ");
                for (YearlyReportItem yearlyReport : yearReportItemsArrayListCopy) {
                    System.out.println("год : " + currentYearNumber + ", месяц : " + yearlyReport.getMonth() +
                            ", Is_expense : " + yearlyReport.getIs_expense());
                }
                System.out.println();
                rezultChecking = false;
            }
            if (checkAvailableProfit.length() > 0) {
                System.out.println("нет данных дохода, проверьте годовой отчет : \n" + checkAvailableProfit);
                rezultChecking = false;
            }
            if (checkAvailableSpend.length() > 0) {
                System.out.println("нет данных расхода, проверьте годовой отчет : \n" + checkAvailableSpend);
                rezultChecking = false;
            }
            if (checkProfit.length() > 0) {
                System.out.println("несоответствие отчетов доходы : \n" + checkProfit);
                rezultChecking = false;
            }
            if (checkSpend.length() > 0) {
                System.out.println("несоответствие отчетов расходы : \n" + checkSpend);
                rezultChecking = false;
            }
            if (rezultChecking) {
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
                    System.out.println("Прибыль за " + Service.getMonthString(currentMonth.getMonth()) + " = " + sumMonth);
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
