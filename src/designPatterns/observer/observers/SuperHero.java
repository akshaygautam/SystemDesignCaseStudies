package designPatterns.observer.observers;

import designPatterns.observer.Observer;

import java.util.*;

public class SuperHero implements Observer {
    private String name;

    public SuperHero(String name) {
        this.name = name;
    }

    @Override
    public void notify(String message) {
        System.out.println(this.name + " notified : "+ message);
    }
}
