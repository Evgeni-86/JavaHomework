package buchUchet.taxSys;

//налог 15% от разницы доходов и расходов
public class USNProfitMinusLess extends TaxSystem {
    public USNProfitMinusLess(int percent) {
        this.percent = Math.max(percent, 0);
    }

    @Override
    public int calcTaxFor(int debit, int credit) {
        return (int) (Math.abs(debit - credit) * (percent / 100.0));
    }
}
