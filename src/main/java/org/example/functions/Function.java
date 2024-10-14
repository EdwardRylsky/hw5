package org.example.functions;

public interface Function {
    String getText();
    int getPriority();
    int getArgumentsNumber();
    Double calculate(double[] params);
}