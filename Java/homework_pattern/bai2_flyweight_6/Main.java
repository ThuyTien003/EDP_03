package bai2_flyweight_6;

public class Main {
    public static void main(String[] args) {
        CharacterStyle style1 = StyleFactory.getStyle("Arial", 12, "black");

        TextCharacter c1 = new TextCharacter('H', 0, 0, style1);
        TextCharacter c2 = new TextCharacter('e', 1, 0, style1);
        TextCharacter c3 = new TextCharacter('l', 2, 0, style1);
        TextCharacter c4 = new TextCharacter('l', 3, 0, style1);
        TextCharacter c5 = new TextCharacter('o', 4, 0, style1);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
    }
}

