package DZ4.buchUchet;

public abstract class Deal {
    private final String comment;
    private final int debitChange;
    private final int creditChange;

    public Deal(String comment, int debitChange, int creditChange) {
        this.comment = comment;
        this.debitChange = debitChange;
        this.creditChange = creditChange;
    }

    public String getComment() {
        return comment;
    }

    public int getDebitChange() {
        return debitChange;
    }

    public int getCreditChange() {
        return creditChange;
    }
}
