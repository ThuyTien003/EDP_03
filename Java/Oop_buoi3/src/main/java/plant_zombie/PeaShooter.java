package plant_zombie;

import javax.xml.stream.events.StartDocument;

public class PeaShooter extends GameObject implements Shooter{
    public PeaShooter(int x, int y){
        super(100, x, y);
    }

    @Override
    public void update() {
        System.out.println("PeaShooter at ( " + x + ", " + y + ") is waiting");
    }

    @Override
    public void shoot(Zombie target) {
        System.out.println("PeaShooter at ( " + x + ", " + y + ") shoots zombie at ( " + target.x + ", " + target.y + ")");
        target.takeDamage(20);
    }
}
