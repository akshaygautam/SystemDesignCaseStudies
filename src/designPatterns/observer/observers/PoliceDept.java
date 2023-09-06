package designPatterns.observer.observers;

import designPatterns.observer.Observer;

import java.util.*;

public class PoliceDept implements Observer {
    @Override
    public void notify(String message) {
        System.out.println("Police notified : "+ message);
    }
}
