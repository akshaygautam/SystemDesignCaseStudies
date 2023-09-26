package designPatterns.behavioralPatterns.interpreter.expressionModifiers;

import designPatterns.behavioralPatterns.interpreter.ModifiedExpression;

public class DivisionExpression implements ModifiedExpression {
    private ModifiedExpression left;
    private ModifiedExpression right;

    public DivisionExpression(ModifiedExpression left, ModifiedExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        int divisor = right.interpret();
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return left.interpret() / divisor;
    }
}
