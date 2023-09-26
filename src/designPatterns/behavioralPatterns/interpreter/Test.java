package designPatterns.behavioralPatterns.interpreter;

import designPatterns.behavioralPatterns.interpreter.expressionModifiers.*;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (scanner) {
            System.out.print("Enter a quirky expression (e.g., 2 ++ 3 ** 4): ");
            String expressionStr = scanner.nextLine();
            ModifiedExpression expression = parseExpression(expressionStr);
            int result = expression.interpret();
            System.out.println("The quirky result is: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    private static ModifiedExpression parseExpression(String expressionStr) {
        String[] tokens = expressionStr.split("\\s+");

        Stack<ModifiedExpression> expressionStack = new Stack<>();
        Stack<String> operatorStack = new Stack<>();

        for (String token : tokens) {
            if (isNumeric(token)) {
                expressionStack.push(new ValueExpression(Integer.parseInt(token)));
            } else if (isOperator(token)) {
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(token)) {
                    processOperator(expressionStack, operatorStack);
                }
                operatorStack.push(token);
            }
        }

        while (!operatorStack.isEmpty()) {
            processOperator(expressionStack, operatorStack);
        }

        return expressionStack.pop();
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+");
    }

    private static boolean isOperator(String str) {
        return str.matches("[+\\-*/]+");
    }

    private static int precedence(String operator) {
        switch (operator) {
            case "++":
            case "--":
                return 1;
            case "**":
            case "//":
                return 2;
            default:
                return 0;
        }
    }

    private static void processOperator(Stack<ModifiedExpression> expressionStack, Stack<String> operatorStack) {
        String operator = operatorStack.pop();
        ModifiedExpression right = expressionStack.pop();
        ModifiedExpression left = expressionStack.pop();

        ModifiedExpression expression;
        switch (operator) {
            case "++":
                expression = new AdditionExpression(left, right);
                break;
            case "--":
                expression = new SubtractionExpression(left, right);
                break;
            case "**":
                expression = new MultiplicationExpression(left, right);
                break;
            case "//":
                expression = new DivisionExpression(left, right);
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }

        expressionStack.push(expression);
    }
}
