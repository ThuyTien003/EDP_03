package bai2_flyweight_6;

public class CharacterStyle {
    private String font;
    private int size;
    private String color;

    public CharacterStyle(String font, int size, String color) {
        this.font = font;
        this.size = size;
        this.color = color;
    }

    public void applyStyle(char c, int x, int y) {
        System.out.println("Char '" + c + "' tại (" + x + "," + y + "), font: " + font + ", size: " + size + ", màu: " + color);
    }
}
