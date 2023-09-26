package designPatterns.behavioralPatterns.visitor;

import designPatterns.behavioralPatterns.visitor.animals.Elephant;
import designPatterns.behavioralPatterns.visitor.animals.Lion;
import designPatterns.behavioralPatterns.visitor.animals.Monkey;

public class ZooTest {
    public static void main(String[] args) {
        Animal[] animals = {new Lion(), new Monkey(), new Elephant()};
        AnimalVisitor zookeeper = new Zookeeper();

        for (Animal animal : animals) {
            animal.accept(zookeeper);
        }
    }
}
