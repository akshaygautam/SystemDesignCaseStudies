package designPatterns.singleton;

import java.util.*;

public class ChocolateBoilerLazy {
    private static ChocolateBoilerLazy instance;
    private ChocolateBoilerLazy () {

    }
    public static ChocolateBoilerLazy getInstance() {
        if (instance == null) {
            instance = new ChocolateBoilerLazy();
        }
        return instance;
    }
}
