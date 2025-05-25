package bai2_adapter_1;

public class Main {
    public static void main(String[] args) {
        PaymentClient paypalClient = new PaymentClient(new PayPalAdapter());
        paypalClient.makePayment(150.0);

        PaymentClient stripeClient = new PaymentClient(new StripeAdapter());
        stripeClient.makePayment(250.0);

        PaymentClient cryptoClient = new PaymentClient(new CryptoAdapter());
        cryptoClient.makePayment(500.0);
    }
}

