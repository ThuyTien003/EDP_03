package bai2_flyweight_6;

public class TextCharacter {
    private char character;
    private int x, y;
    private CharacterStyle style;

    public TextCharacter(char character, int x, int y, CharacterStyle style) {
        this.character = character;
        this.x = x;
        this.y = y;
        this.style = style;
    }

    public void display() {
        style.applyStyle(character, x, y);
    }
}
