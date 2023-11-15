package buchUchet;

import buchUchet.taxSys.TaxSystem;


public class Company {
    private final String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    private void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.printf("Компания %s уплатила налог в размере %d руб.\n", title, tax);
        debit = 0;
        credit = 0;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) debit += amount;
        else if (amount < 0) credit += Math.abs(amount);
    }

    public int applyDeals(Deal[] deals) {
        if (taxSystem == null) throw new IllegalStateException("Система налогооблажения не установлена");
        for (Deal deal : deals) {
            credit += deal.getCreditChange();
            debit += deal.getDebitChange();
        }
        int difference = Math.abs(credit - debit);
        payTaxes();
        return difference;
    }

    public int getDebit() {
        return debit;
    }

    public int getCredit() {
        return credit;
    }
}
