package hethongnganhang;

import java.util.*;

public class Bank {
    private List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount acc) {
        accounts.add(acc);
    }

    public void showAllAccounts() {
        for (BankAccount acc : accounts) {
            acc.display();
        }
    }

    public void calculateAllInterests() {
        for (BankAccount acc : accounts) {
            double interest = acc.calculateInterest();
            System.out.println("Lai tai khoan " + acc.accountNumber + ": " + interest);
        }
    }

    public double getTotalBalance() {
        double sum = 0;
        for (BankAccount acc : accounts) {
            sum += acc.balance;
        }
        return sum;
    }
}
