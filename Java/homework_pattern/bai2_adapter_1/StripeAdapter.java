package bai2_adapter_1;

public class StripeAdapter implements PaymentProcessor {
    private StripeAPI stripe = new StripeAPI();

    public void pay(double amount) {
        stripe.makePayment(amount);
    }
}