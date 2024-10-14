package org.example.functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplicationTest {
    Multiplication multiplication = new Multiplication();

    @Test
    void calculateTest() {
        assertEquals(-15.0, multiplication.calculate(new double[]{-3.0, 5.0}), 0.0001);
        assertEquals(-1, multiplication.calculate(new double[]{1.0, -1.0}), 0.0001);
        assertEquals(4, multiplication.calculate(new double[]{2.0, 2.0}), 0.0001);
        assertEquals(-3, multiplication.calculate(new double[]{1.0, -3.0}), 0.0001);
        assertEquals(6, multiplication.calculate(new double[]{-2.0, -3.0}), 0.0001);
    }
}