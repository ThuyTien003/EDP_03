package bai2_flyweight_6;

import java.util.HashMap;

public class StyleFactory {
    private static HashMap<String, CharacterStyle> styles = new HashMap<>();

    public static CharacterStyle getStyle(String font, int size, String color) {
        String key = font + "-" + size + "-" + color;
        if (!styles.containsKey(key)) {
            styles.put(key, new CharacterStyle(font, size, color));
        }
        return styles.get(key);
    }
}
