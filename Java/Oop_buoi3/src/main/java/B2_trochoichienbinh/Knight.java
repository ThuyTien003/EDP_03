package B2_trochoichienbinh;

public class Knight extends Actor{
    public Knight(String name) {
        super(name, 100);
    }

    @Override
    public void attack() {
        System.out.println("- " + name + " chém mạnh bằng kiếm");
        reduceEnergy(10);
    }
}
