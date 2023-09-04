package designPatterns.decorator.costumes;

import designPatterns.decorator.Costume;

public class BasicCostume implements Costume {
    @Override
    public void wear() {
        System.out.println("Wearing basic Suit");
    }
}
