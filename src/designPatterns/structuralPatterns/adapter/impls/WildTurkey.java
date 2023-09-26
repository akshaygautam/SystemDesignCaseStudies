package designPatterns.structuralPatterns.adapter.impls;

import designPatterns.structuralPatterns.adapter.interfaces.Turkey;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble Gobble!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying! Short Distance");
    }
}
