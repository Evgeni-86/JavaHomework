package Zaur;

class BankAccount {
    private double balance;

    void popolnenieScheta(double num) {
        this.balance += num;
    }
    void snyatieSosheta(double num) {
        this.balance -= num;
    }
    double getBalance() {
        return this.balance;
    }
}

class Bank {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.popolnenieScheta(100.1);
        ba1.snyatieSosheta(50.50);
        System.out.println(ba1.getBalance());
    }
}