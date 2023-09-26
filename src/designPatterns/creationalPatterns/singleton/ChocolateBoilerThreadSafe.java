package designPatterns.creationalPatterns.singleton;

public class ChocolateBoilerThreadSafe {
    private volatile static ChocolateBoilerThreadSafe instance;

    private ChocolateBoilerThreadSafe() {}

    public static ChocolateBoilerThreadSafe getInstance() {
        if (instance == null) {
            synchronized (ChocolateBoilerThreadSafe.class) {
                if (instance == null) {
                    instance = new ChocolateBoilerThreadSafe();
                }
            }
        }
        return instance;
    }


}

