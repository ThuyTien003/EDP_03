package bai1_flyweight_6;

public class Soldier {
    private int x, y;
    private SoldierType type;

    public Soldier(int x, int y, SoldierType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void display() {
        type.display(x, y);
    }
}
