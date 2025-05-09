package hethongnganhang;

public class SavingsAccount extends BankAccount {
    private final double interestRate = 0.04;

    public SavingsAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}

