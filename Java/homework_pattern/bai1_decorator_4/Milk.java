package bai1_decorator_4;

public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", thêm sữa";
    }

    public double getCost() {
        return super.getCost() + 5_000;
    }
}
