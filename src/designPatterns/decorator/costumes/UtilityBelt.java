package designPatterns.decorator.costumes;

import designPatterns.decorator.Costume;

public class UtilityBelt implements Costume {
    private Costume costume;
    public UtilityBelt(Costume costume) {
        this.costume = costume;
    }

    @Override
    public void wear() {
        this.costume.wear();
        System.out.println("Adding Utility Belt");
    }
}
