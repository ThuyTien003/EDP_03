package bai1_decorator_4;

public class Cream extends CoffeeDecorator {
    public Cream(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", thêm kem";
    }

    public double getCost() {
        return super.getCost() + 7_000;
    }
}

