package designPatterns.adapter;

import designPatterns.adapter.interfaces.Duck;
import designPatterns.adapter.interfaces.Turkey;

import java.util.*;

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
