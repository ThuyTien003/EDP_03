package plant_zombie;

public class Zombie extends GameObject implements Mover{
    public Zombie(int x, int y){
        super(50, x, y);
    }
    @Override
    public void update() {
        move();
        System.out.println("Zombie moves to (" + x + ", " + y + ") ");
    }

    @Override
    public void move() {
        x--;
    }
}
