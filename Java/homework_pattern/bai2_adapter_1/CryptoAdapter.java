package bai2_adapter_1;

public class CryptoAdapter implements PaymentProcessor {
    private CryptoAPI crypto = new CryptoAPI();

    public void pay(double amount) {
        crypto.transferCrypto(amount);
    }
}
