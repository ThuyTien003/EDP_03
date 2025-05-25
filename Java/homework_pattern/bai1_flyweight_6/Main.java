package bai1_flyweight_6;

public class Main {
    public static void main(String[] args) {
        SoldierType infantry = SoldierFactory.getSoldierType("Súng trường", "Đồng phục xanh");

        Soldier s1 = new Soldier(10, 20, infantry);
        Soldier s2 = new Soldier(30, 40, infantry);

        s1.display();
        s2.display();
    }
}
