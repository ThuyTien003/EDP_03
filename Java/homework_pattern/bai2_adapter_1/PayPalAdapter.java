package bai2_adapter_1;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalAPI paypal = new PayPalAPI();

    public void pay(double amount) {
        paypal.sendPayment(amount);
    }
}
