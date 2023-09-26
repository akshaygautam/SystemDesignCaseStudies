package designPatterns.behavioralPatterns.visitor;

import designPatterns.behavioralPatterns.visitor.animals.Elephant;
import designPatterns.behavioralPatterns.visitor.animals.Lion;
import designPatterns.behavioralPatterns.visitor.animals.Monkey;

public class Zookeeper implements AnimalVisitor{
    @Override
    public void visit(Lion lion) {
        System.out.println("The zookeeper feeds the lion.");
        lion.roar();
    }

    @Override
    public void visit(Monkey monkey) {
        System.out.println("The zookeeper cleans the monkey exhibit.");
        monkey.swing();
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("The zookeeper entertains the elephant.");
        elephant.trumpet();
    }
}
