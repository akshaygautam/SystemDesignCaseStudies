package designPatterns.structuralPatterns.adapter;

import designPatterns.structuralPatterns.adapter.impls.MallardDuck;
import designPatterns.structuralPatterns.adapter.impls.WildTurkey;
import designPatterns.structuralPatterns.adapter.interfaces.Duck;
import designPatterns.structuralPatterns.adapter.interfaces.Turkey;

public class Test {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Mallard Duck says:");
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("\nThe Wild Turkey says:");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe Turkey Adapter says (pretending to be a duck):");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
