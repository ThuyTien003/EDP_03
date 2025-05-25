package bai2_facade_5;

class PaymentGateway {
    public boolean processPayment(String cardNumber, double amount) {
        System.out.println("Xử lý thanh toán " + amount + " bằng thẻ " + cardNumber);
        return true;
    }
}