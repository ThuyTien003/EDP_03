package B2_trochoichienbinh;

public class Main {
    public static void main(String[] args) {
        BattleField bf = new BattleField();

        bf.addFighter(new Knight("Butterfly"));
        bf.addFighter(new Archer("Yorn"));
        bf.addFighter(new Mage("Krixi"));


        for (int i = 1; i <= 3; i++) {
            System.out.println("\nLượt " + i);
            bf.startBattle();
        }
    }
}
