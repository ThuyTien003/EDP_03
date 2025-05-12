package B2_trochoichienbinh;

public class Archer extends Actor {
    public Archer(String name) {
        super(name, 80);
    }

    @Override
    public void attack() {
        System.out.println("- " + name + " bắn tên từ xa");
        reduceEnergy(7);
    }
}
