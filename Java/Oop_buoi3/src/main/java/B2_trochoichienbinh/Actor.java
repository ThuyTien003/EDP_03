package B2_trochoichienbinh;

public abstract class Actor implements Fighter{
    protected String name;
    protected int energy;

    public Actor(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    @Override
    public boolean isAlive() {
        return energy > 0;
    }

    public void reduceEnergy(int amount) {
        energy -= amount;
        if (energy < 0) energy = 0;
    }

    public int getEnergy() {
        return energy;
    }

    public String getName() {
        return name;
    }
}
