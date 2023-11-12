package accounts;

public class SimpleAccount extends Account {
    @Override
    public boolean add(long amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean pay(long amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public boolean transfer(Account account, long amount) {
        long tempBalance1 = balance;
        long tempBalance2 = account.balance;

        boolean pay = pay(amount);
        boolean add = account.add(amount);

        if (pay && add) return true;

        this.setBalance(tempBalance1);
        account.setBalance(tempBalance2);
        return false;
    }
}
