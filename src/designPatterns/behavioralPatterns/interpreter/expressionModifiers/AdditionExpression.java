package designPatterns.behavioralPatterns.interpreter.expressionModifiers;

import designPatterns.behavioralPatterns.interpreter.ModifiedExpression;

public class AdditionExpression implements ModifiedExpression {
    private ModifiedExpression left;
    private ModifiedExpression right;

    public AdditionExpression(ModifiedExpression left, ModifiedExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() + right.interpret();
    }
}
