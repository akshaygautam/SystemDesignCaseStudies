package designPatterns.singleton;

import java.util.*;

public class ChocolateBoilerPreLoad {
    private static final ChocolateBoilerPreLoad chocolateBoilerPreLoad = new ChocolateBoilerPreLoad();

    private ChocolateBoilerPreLoad() {}

    public static ChocolateBoilerPreLoad getInstance(){
        return chocolateBoilerPreLoad;
    }
}
