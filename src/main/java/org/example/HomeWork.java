package org.example;

import org.example.functions.Functions;

import java.util.*;

public class HomeWork {
    private final static Set<Functions> FUNCTIONS = EnumSet.allOf(Functions.class);
    private final static String COMMA = ",";

    /**
     * <h1>Задание 1.</h1>
     * Требуется реализовать метод, который по входной строке будет вычислять математические выражения.
     * <br/>
     * Операции: +, -, *, / <br/>
     * Функции: sin, cos, sqr, pow <br/>
     * Разделители аргументов в функции: , <br/>
     * Поддержка скобок () для описания аргументов и для группировки операций <br/>
     * Пробел - разделитель токенов, пример валидной строки: "1 + 2 * ( 3 - 4 )" с результатом -1.0 <br/>
     * <br/>
     * sqr ( x ) = x^2 <br/>
     * pow ( x, y ) = x^y
     */
    double calculate(String expr) {
        String rpnExpr = translate(expr);

        String[] input = rpnExpr.split(" ");
        Stack<Double> stack = new Stack<>();

        for (String cur : input) {
            //Если токен — число, кладем в стек
            if (isNumber(cur)) {
                stack.add(Double.valueOf(cur));
                continue;
            }

            Functions function = Functions.fromString(cur);

            int argumentsNumber = function.getFunction().getArgumentsNumber();

            double[] params = new double[argumentsNumber];

            for (int i = argumentsNumber - 1; i >= 0; i--) {
                params[i] = stack.pop();
            }

            stack.push(function.getFunction().calculate(params));

        }

        return stack.pop();
    }


    /**
     * Алгоритм сортировочной станции
     * без функций
     * @see <a href="https://ru.wikipedia.org/wiki/Алгоритм_сортировочной_станции">https://ru.wikipedia.org/wiki/Алгоритм_сортировочной_станции</a>
     * @param inputString
     * @return
     */
    private static String translate(String inputString) {
        String[] input = inputString.split(" ");
        StringJoiner output = new StringJoiner(" ");
        Deque<Functions> stack = new LinkedList<>();
        for (String cur : input) {
            //Если токен — число, то добавить его в очередь вывода.
            if (isNumber(cur)) {
                output.add(cur);
                continue;
            }

            if(COMMA.equals(cur)){
                if (!stack.isEmpty() && stack.peek() != Functions.OPEN_BRAKET) {
                    output.add(stack.pop().toString());
                }
                continue;
            }

            Functions function = Functions.fromString(cur);

            if (function == null) {
                throw new RuntimeException("Unknown function " + cur);
            }

            if (FUNCTIONS.contains(function)) {
                //Пока присутствует на вершине стека токен оператор op2, чей приоритет выше или равен приоритету op1,
                // и при равенстве приоритетов op1 является левоассоциативным:
                while (!stack.isEmpty() && stack.peek() != Functions.OPEN_BRAKET
                        && stack.peek().getFunction().getPriority() >= function.getFunction().getPriority()) {
                    //Переложить op2 из стека в выходную очередь;
                    output.add(stack.pop().toString());
                }
                //Положить op1 в стек.
                if (function != Functions.OPEN_BRAKET && function != Functions.CLOSE_BRAKET) {
                    stack.push(function);
                }
            }
            //Если токен — оператор op1, то:
            //Если токен — открывающая скобка, то положить его в стек.
            if (function == Functions.OPEN_BRAKET) {
                stack.push(function);
            }
            //Если токен — закрывающая скобка:
            if (function == Functions.CLOSE_BRAKET) {
                //Пока токен на вершине стека не открывающая скобка
                while (!stack.isEmpty() && stack.peek() != Functions.OPEN_BRAKET) {
                    //Переложить оператор из стека в выходную очередь.
                    output.add(stack.pop().toString());
                }
                //Если стек закончился до того, как был встречен токен открывающая скобка, то в выражении пропущена скобка.
                if (stack.isEmpty()) {
                    throw new IllegalArgumentException("Missing '(' in expression");
                }
                //Выкинуть открывающую скобку из стека, но не добавлять в очередь вывода.
                stack.pop();
            }
        }
        //Если больше не осталось токенов на входе:
        //Пока есть токены операторы в стеке:
        while (!stack.isEmpty()) {
            //Если токен оператор на вершине стека — открывающая скобка, то в выражении пропущена скобка.
            if (stack.peek() == Functions.OPEN_BRAKET) {
                throw new IllegalArgumentException("Missing ')' in expression");
            }
            //Переложить оператор из стека в выходную очередь.
            output.add(stack.pop().toString());
        }

        return output.toString();
    }

    private static boolean isNumber(String number) {
        try{
            Integer.valueOf(number);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}