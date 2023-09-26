package designPatterns.creationalPatterns.prototype;

public class Test {
    public static void main(String[] args) {
        Monster monster1 = MonsterFactory.createMonster();
        Monster monster2 = MonsterFactory.createMonster();

        monster1.scare();
        monster2.scare();
        System.out.println(monster1 == monster2);
    }
}
