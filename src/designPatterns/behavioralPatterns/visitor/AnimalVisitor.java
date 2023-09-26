package designPatterns.behavioralPatterns.visitor;

import designPatterns.behavioralPatterns.visitor.animals.*;

public interface AnimalVisitor {
    void visit(Lion lion);

    void visit(Monkey monkey);

    void visit(Elephant elephant);
}
