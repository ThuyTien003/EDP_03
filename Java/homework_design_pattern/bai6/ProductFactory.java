package bai6;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ProductFactory {
    private static final Map<String, Supplier<Product>> registry = new HashMap<>();

    public static void register(String type, Supplier<Product> supplier) {
        registry.put(type.toLowerCase(), supplier);
    }

    public static Product create(String type) {
        Supplier<Product> supplier = registry.get(type.toLowerCase());
        if (supplier != null) {
            return supplier.get();
        } else {
            System.out.println("Ko co sp nao duoc dk cho loai: " + type);
            return null;
        }
    }
}

