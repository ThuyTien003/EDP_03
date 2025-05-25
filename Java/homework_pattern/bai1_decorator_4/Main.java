package bai1_decorator_4;

public class Main {
    public static void main(String[] args) {
        Coffee myCoffee = new SimpleCoffee();
        myCoffee = new Sugar(myCoffee);
        myCoffee = new Milk(myCoffee);
        myCoffee = new Cream(myCoffee);

        System.out.println("Mô tả: " + myCoffee.getDescription());
        System.out.println("Giá: " + myCoffee.getCost() + " VNĐ");
    }
}

