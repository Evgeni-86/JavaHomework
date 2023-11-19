package DZ4.buchUchet.taxSys;

public abstract class TaxSystem {
    protected int percent;
    public abstract int calcTaxFor(int debit, int credit);
}
