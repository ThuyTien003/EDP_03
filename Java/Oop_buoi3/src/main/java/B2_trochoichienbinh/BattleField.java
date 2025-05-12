package B2_trochoichienbinh;

import java.util.ArrayList;
import java.util.List;

public class BattleField {
    private List<Fighter> fighters = new ArrayList<>();

    public void addFighter(Fighter fighter) {
        fighters.add(fighter);
    }

    public void startBattle() {
        System.out.println("Bắt đầu \n");

        for (Fighter f : fighters) {
            if (f.isAlive()) {
                f.attack();
                Actor actor = (Actor) f;
                System.out.println("- " + actor.getName() + " còn lại " + actor.getEnergy() + " năng lượng\n");
            }
        }

        System.out.println("Kết thúc");
    }
}

