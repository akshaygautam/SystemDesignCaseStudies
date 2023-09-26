package designPatterns.structuralPatterns.decorator.costumes;

import designPatterns.structuralPatterns.decorator.Costume;

public class GrappleHook implements Costume {
    private Costume costume;
    public GrappleHook(Costume costume) {
       this.costume = costume;
    }

    @Override
    public void wear() {
        this.costume.wear();
        System.out.println("Adding Grapple hook");
    }
}
