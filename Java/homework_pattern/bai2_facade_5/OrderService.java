package bai2_facade_5;

public class OrderService {
    private Inventory inventory = new Inventory();
    private PaymentGateway payment = new PaymentGateway();
    private Shipping shipping = new Shipping();
    private Notification notification = new Notification();

    public void placeOrder(String item, double amount, String cardNumber, String address, String email) {
        System.out.println("\nXử lý đơn hàng...");

        if (inventory.checkStock(item)) {
            inventory.reserve(item);

            if (payment.processPayment(cardNumber, amount)) {
                shipping.shipItem(item, address);
                notification.sendConfirmation(email);
                System.out.println("Đơn hàng hoàn tất.");
            } else {
                System.out.println("Thanh toán thất bại.");
            }
        } else {
            System.out.println("Hết hàng.");
        }
    }
}

