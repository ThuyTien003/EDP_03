package plant_zombie;

import java.util.ArrayList;
import java.util.List;

public class EntityManager {
    private List<GameObject> objects = new ArrayList<>();

    public void add(GameObject gameObject){
        objects.add(gameObject);
    }

    public void updateAll(){
        for (GameObject gameObject : objects){
            if (gameObject.isAlive()) gameObject.update();
        }
    }

    public List<Zombie> getZombiesInRange(int x, int y, int range){
        List<Zombie> result = new ArrayList<>();
        for (GameObject gameObject : objects){
            if (gameObject instanceof Zombie && gameObject.isAlive()){
                if (Math.abs(gameObject.x - x) <= range && gameObject.y == y){
                    result.add((Zombie) gameObject);
                }
            }
        }
        return result;
    }

    public boolean isZombieAlive(){
        for (GameObject gameObject : objects){
            if (gameObject instanceof Zombie && gameObject.isAlive())
                return true;
        }
        return false;
    }
}
