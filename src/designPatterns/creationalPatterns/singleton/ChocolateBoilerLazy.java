package designPatterns.creationalPatterns.singleton;

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
