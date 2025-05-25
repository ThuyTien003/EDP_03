package bai2_adapter_1;

public class PaymentClient {
    private PaymentProcessor processor;

    public PaymentClient(PaymentProcessor processor) {
        this.processor = processor;
    }

    public void makePayment(double amount) {
        processor.pay(amount);
    }
}

