package org.example.functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinusTest {
    Minus minus = new Minus();

    @Test
    void calculateTest() {
        assertEquals(-8, minus.calculate(new double[]{-3.0, 5.0}), 0.0001);
        assertEquals(2, minus.calculate(new double[]{1.0, -1.0}), 0.0001);
        assertEquals(0, minus.calculate(new double[]{2.0, 2.0}), 0.0001);
        assertEquals(4, minus.calculate(new double[]{1.0, -3.0}), 0.0001);
    }
}