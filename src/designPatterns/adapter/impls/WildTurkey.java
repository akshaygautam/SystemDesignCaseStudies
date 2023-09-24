package designPatterns.adapter.impls;

import designPatterns.adapter.interfaces.Turkey;

import java.util.*;

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
