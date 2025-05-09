package hethongnganhang;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addAccount(new SavingsAccount("S01", "Tien", 5000));
        bank.addAccount(new CheckingAccount("C01", "Linh", 3000, 1000));

        bank.showAllAccounts();

        bank.calculateAllInterests();

        System.out.println("Tong so tien trong ngan hang: " + bank.getTotalBalance());
    }
}

