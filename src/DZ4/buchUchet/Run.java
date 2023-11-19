package DZ4.buchUchet;


import DZ4.buchUchet.taxSys.USNProfit;
import DZ4.buchUchet.taxSys.USNProfitMinusLess;

public class Run {
    public static void main(String[] args) {
        USNProfit usnProfit = new USNProfit(6);
        USNProfitMinusLess usnProfitMinusLess = new USNProfitMinusLess(16);
        Company companyOne = new Company("CompanyOne", usnProfit);
//        companyOne.setTaxSystem(null);

        Sale sale1 = new Sale("Sale1", 1500);
        System.out.println(sale1.getComment());
        Sale sale2 = new Sale("Sale1", 3000);
        System.out.println(sale2.getComment());
        Expenditure expenditure1 = new Expenditure("Expenditure1", 500);
        System.out.println(expenditure1.getComment());
        Expenditure expenditure2 = new Expenditure("Expenditure1", 700);
        System.out.println(expenditure2.getComment());

        companyOne.applyDeals(new Deal[]{sale1, sale2, expenditure1, expenditure2});

        System.out.println(companyOne.getDebit());
        System.out.println(companyOne.getCredit());
    }
}
