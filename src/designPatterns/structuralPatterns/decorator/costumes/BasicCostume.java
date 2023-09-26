package designPatterns.structuralPatterns.decorator.costumes;

import designPatterns.structuralPatterns.decorator.Costume;

public class BasicCostume implements Costume {
    @Override
    public void wear() {
        System.out.println("Wearing basic Suit");
    }
}
