package DZ4.accounts;

public abstract class Account {
    protected long balance;

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

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

    public long getBalance(){
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
