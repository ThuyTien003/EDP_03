package bai1_decorator_4;

public class Sugar extends CoffeeDecorator {
    public Sugar(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", thêm đường";
    }

    public double getCost() {
        return super.getCost() + 3_000;
    }
}

