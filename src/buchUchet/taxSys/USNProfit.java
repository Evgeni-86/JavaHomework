package buchUchet.taxSys;

//Налог 6% от доходов
public class USNProfit extends TaxSystem {
    public USNProfit(int percent) {
        this.percent = Math.max(percent, 0);
    }

    @Override
    public int calcTaxFor(int debit, int credit) {
        return (int) (debit * (percent / 100.0));
    }
}
