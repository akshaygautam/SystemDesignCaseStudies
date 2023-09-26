package designPatterns.behavioralPatterns.observer;

import designPatterns.behavioralPatterns.observer.observers.PoliceDept;
import designPatterns.behavioralPatterns.observer.observers.SuperHero;

public class Test {
    public static void main(String[] args) {
        Reporter reporter = new Reporter();
        SuperHero batman = new SuperHero("Batman");
        SuperHero superman = new SuperHero("Superman");
        PoliceDept policeDept = new PoliceDept();

        reporter.addObserver(batman);
        reporter.addObserver(superman);
        reporter.addObserver(policeDept);
        reporter.sendUpdates("Bane was found in gym");
        reporter.removeObserver(policeDept);
        reporter.sendUpdates("Police is compromised");
    }
}
