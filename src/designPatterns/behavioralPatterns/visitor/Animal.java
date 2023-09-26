package designPatterns.behavioralPatterns.visitor;

public interface Animal {
    void accept(AnimalVisitor visitor);
}
