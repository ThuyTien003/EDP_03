package bai2_adapter_1;

public class StripeAPI {
    public void makePayment(double amount) {
        System.out.println("Stripe processing payment: $" + amount);
    }
}
