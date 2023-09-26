package designPatterns.behavioralPatterns.observer.observers;

import designPatterns.behavioralPatterns.observer.Observer;

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
