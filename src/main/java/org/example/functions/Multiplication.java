package org.example.functions;

public class Multiplication implements Function {
    private final String text = "*";
    private final int argumentsNumber = 2;
    private final int priority = 6;
    @Override
    public String getText() {
        return text;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public int getArgumentsNumber() {
        return argumentsNumber;
    }

    @Override
    public Double calculate(double[] params) {
        if (params == null) {
            throw new IllegalArgumentException("Params can't be null");
        }
        if (params.length < argumentsNumber) {
            throw new IllegalArgumentException("For " + text + " needed " + argumentsNumber + " parameters");
        }
        return params[0] * params[1];
    }
}