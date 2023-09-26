package designPatterns.behavioralPatterns.visitor.animals;

import designPatterns.behavioralPatterns.visitor.Animal;
import designPatterns.behavioralPatterns.visitor.AnimalVisitor;

public class Elephant implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }

    public void trumpet() {
        System.out.println("The elephant trumpets!");
    }
}
