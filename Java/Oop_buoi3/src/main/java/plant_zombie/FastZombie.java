package plant_zombie;

import B2_trochoichienbinh.Fighter;

public class FastZombie extends Zombie{
    public FastZombie(int x, int y){
        super(x, y);
        this.health = 30;
    }

    @Override
    public void update() {
        move();
        System.out.println("FastZombie dashes to (" + x + ", " + y + ") ");
    }

    @Override
    public void move() {
        x -= 2;
    }

}
