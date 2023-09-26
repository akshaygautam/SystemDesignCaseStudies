package designPatterns.structuralPatterns.decorator.costumes;

import designPatterns.structuralPatterns.decorator.Costume;

public class Armour implements Costume {
    private Costume costume;

    public Armour(Costume costume) {
        this.costume = costume;
    }

    @Override
    public void wear() {
        this.costume.wear();
        System.out.println("Adding Armour");
    }
}
