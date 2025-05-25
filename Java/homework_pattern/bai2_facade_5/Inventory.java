package bai2_facade_5;

class Inventory {
    public boolean checkStock(String item) {
        System.out.println("Kiểm tra tồn kho: " + item);
        return true;
    }

    public void reserve(String item) {
        System.out.println("Đã giữ hàng: " + item);
    }
}
