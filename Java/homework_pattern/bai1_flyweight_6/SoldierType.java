package bai1_flyweight_6;

public class SoldierType {
    private String weapon;
    private String uniform;

    public SoldierType(String weapon, String uniform) {
        this.weapon = weapon;
        this.uniform = uniform;
    }

    public void display(int x, int y) {
        System.out.println("Lính với " + weapon + ", " + uniform + " tại (" + x + "," + y + ")");
    }
}
