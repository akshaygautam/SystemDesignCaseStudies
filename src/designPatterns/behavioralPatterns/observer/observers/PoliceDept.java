package designPatterns.behavioralPatterns.observer.observers;

import designPatterns.behavioralPatterns.observer.Observer;

public class PoliceDept implements Observer {
    @Override
    public void notify(String message) {
        System.out.println("Police notified : "+ message);
    }
}
