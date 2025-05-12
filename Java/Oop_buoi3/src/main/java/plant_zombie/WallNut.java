package plant_zombie;

public class WallNut extends GameObject{
    public WallNut(int x, int y){
        super(300, x, y);
    }
    @Override
    public void update() {
        System.out.println("WallNut at (" + x + ", " + y + ") is blocking");
    }
}
