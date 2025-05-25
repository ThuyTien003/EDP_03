package bai2_facade_5;

public class Main {
    public static void main(String[] args) {
        OrderService order = new OrderService();
        order.placeOrder("Laptop", 1500.0, "1234-5678-9999", "Hà Nội", "abc@gmail.com");
    }
}

