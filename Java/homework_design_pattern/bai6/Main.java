package bai6;

public class Main {
    public static void main(String[] args) {
        ProductFactory.register("phone", Phone::new);
        ProductFactory.register("laptop", Laptop::new);

        Product p1 = ProductFactory.create("phone");
        if (p1 != null) p1.use();

        Product p2 = ProductFactory.create("laptop");
        if (p2 != null) p2.use();

        Product p3 = ProductFactory.create("tablet");
        if (p3 != null) p3.use();
    }
}

