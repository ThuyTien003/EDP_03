package plant_zombie;

public class Sunflower extends GameObject{

    public Sunflower(int x, int y){
        super(80, x, y);
    }

    public void produceSun(){
        System.out.println("Sunflower at (" + x + "," + y + ") produces 25 sun points");
    }
    @Override
    public void update() {
        produceSun();
    }
}
