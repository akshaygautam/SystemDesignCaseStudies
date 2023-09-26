package designPatterns.structuralPatterns.adapter;

import designPatterns.structuralPatterns.adapter.interfaces.Duck;
import designPatterns.structuralPatterns.adapter.interfaces.Turkey;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
