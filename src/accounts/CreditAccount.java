package accounts;

public class CreditAccount extends Account {
    private long creditLimit;

    public CreditAccount(long creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        if (amount > 0 && amount <= Math.abs(balance)) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean pay(long amount) {
        if (amount > 0 && amount <= creditLimit - Math.abs(balance)) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
