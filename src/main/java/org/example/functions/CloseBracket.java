package org.example.functions;

public class CloseBracket implements Function {
    private final String text = ")";
    private final int argumentsNumber = 0;
    private final int priority = 9;
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
        throw new RuntimeException();
    }
}