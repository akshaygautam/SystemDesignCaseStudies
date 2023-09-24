package designPatterns.adapter.impls;

import designPatterns.adapter.interfaces.Duck;

import java.util.*;

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
