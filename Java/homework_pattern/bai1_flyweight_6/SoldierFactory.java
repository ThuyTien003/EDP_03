package bai1_flyweight_6;

import java.util.HashMap;

public class SoldierFactory {
    private static HashMap<String, SoldierType> soldierTypes = new HashMap<>();

    public static SoldierType getSoldierType(String weapon, String uniform) {
        String key = weapon + "-" + uniform;
        if (!soldierTypes.containsKey(key)) {
            soldierTypes.put(key, new SoldierType(weapon, uniform));
        }
        return soldierTypes.get(key);
    }
}
