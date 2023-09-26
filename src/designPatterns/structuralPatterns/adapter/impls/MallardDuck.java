package designPatterns.structuralPatterns.adapter.impls;

import designPatterns.structuralPatterns.adapter.interfaces.Duck;

public class MallardDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }

    @Override
    public void quack() {
        System.out.println("Quack Quack!");
    }
}
