package designPatterns.compound;

import java.util.*;

public class PenguinManager {
    private static volatile PenguinManager instance;
    private Map<String, Penguin> penguinMap;

    private PenguinManager() {
        penguinMap = new HashMap<>();
    }

    public static PenguinManager getInstance() {
        if (instance == null) {
            synchronized (PenguinManager.class) {
                if(instance == null) instance = new PenguinManager();
            }
        }
        return instance;
    }

    public void addPenguin(String name) {
        Penguin penguin = PenguinFactory.createPenguin(name);
        penguinMap.put(name, penguin);
    }

    public Penguin getPenguin(String name) {
        return penguinMap.get(name);
    }
}
