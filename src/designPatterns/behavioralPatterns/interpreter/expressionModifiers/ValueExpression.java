package designPatterns.behavioralPatterns.interpreter.expressionModifiers;

import designPatterns.behavioralPatterns.interpreter.ModifiedExpression;

public class ValueExpression implements ModifiedExpression {
    int value;
    public ValueExpression(int value) {
        this.value = value;
    }

    @Override
    public int interpret() {
        return value;
    }
}
