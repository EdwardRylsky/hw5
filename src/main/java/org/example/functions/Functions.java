package org.example.functions;

public enum Functions {
    PLUS(new Plus()),
    MINUS(new Minus()),
    MULTIPLICATION(new Multiplication()),
    DIVISION(new Division()),
    POWER(new Power()),
    SIN (new Sin()),
    COS(new Cos()),
    SQR(new Sqr()),
    POW(new Pow()),
    OPEN_BRAKET(new OpenBracket()),
    CLOSE_BRAKET(new CloseBracket());

    final Function function;
    Functions(Function function) {
        this.function = function;
    }

    public static Functions fromString(String text) {
        for (Functions b : Functions.values()) {
            if (b.toString().equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }

    public Function getFunction() {
        return function;
    }

    @Override
    public String toString() {
        return function.getText();
    }
}