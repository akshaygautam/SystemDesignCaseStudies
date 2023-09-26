package designPatterns.behavioralPatterns.observer;

import java.util.*;

public class Reporter {
    private List<Observer> observers;

    public Reporter() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void sendUpdates(String message){
        for (Observer observer: this.observers) {
            observer.notify(message);
        }
    }
}
