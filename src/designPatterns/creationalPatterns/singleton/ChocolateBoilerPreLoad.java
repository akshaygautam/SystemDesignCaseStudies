package designPatterns.creationalPatterns.singleton;

public class ChocolateBoilerPreLoad {
    private static final ChocolateBoilerPreLoad chocolateBoilerPreLoad = new ChocolateBoilerPreLoad();

    private ChocolateBoilerPreLoad() {}

    public static ChocolateBoilerPreLoad getInstance(){
        return chocolateBoilerPreLoad;
    }
}
