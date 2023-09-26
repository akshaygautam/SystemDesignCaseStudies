package designPatterns.behavioralPatterns.visitor.animals;

import designPatterns.behavioralPatterns.visitor.Animal;
import designPatterns.behavioralPatterns.visitor.AnimalVisitor;

public class Monkey implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }

    public void swing() {
        System.out.println("The monkey swings from a branch!");
    }
}
