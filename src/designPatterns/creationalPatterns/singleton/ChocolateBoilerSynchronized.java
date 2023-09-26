package designPatterns.creationalPatterns.singleton;

public class ChocolateBoilerSynchronized {
    private static ChocolateBoilerSynchronized instance;

    private ChocolateBoilerSynchronized() {}

    public static synchronized ChocolateBoilerSynchronized getInstance() {
        if (instance == null) {
            instance = new ChocolateBoilerSynchronized();
        }
        return instance;
    }
}

