package designPatterns.creationalPatterns.prototype;

public class MonsterFactory {
    private static Monster prototypeMonster = new CuteMonster("Bob", "Blue", "Blublub");

    public static Monster createMonster() {
        return prototypeMonster.clone();
    }

}
