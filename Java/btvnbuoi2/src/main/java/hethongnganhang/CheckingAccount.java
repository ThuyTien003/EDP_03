package hethongnganhang;

public class CheckingAccount extends BankAccount {
    private double withdrawLimit;

    public CheckingAccount(String acc, String name, double bal, double limit) {
        super(acc, name, bal);
        this.withdrawLimit = limit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= withdrawLimit && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}

