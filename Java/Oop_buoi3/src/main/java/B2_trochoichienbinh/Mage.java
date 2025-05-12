package B2_trochoichienbinh;

public class Mage extends Actor {
    public Mage(String name) {
        super(name, 90);
    }

    @Override
    public void attack() {
        System.out.println("- " + name + " tung phép thuật");
        reduceEnergy(15);
    }
}
