package designPatterns.behavioralPatterns.visitor.animals;

import designPatterns.behavioralPatterns.visitor.Animal;
import designPatterns.behavioralPatterns.visitor.AnimalVisitor;

public class Lion implements Animal {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }

    public void roar() {
        System.out.println("The lion roars!");
    }
}
