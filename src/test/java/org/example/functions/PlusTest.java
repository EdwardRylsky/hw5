package org.example.functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlusTest {
    Plus plus = new Plus();

    @Test
    void calculateTest() {
        assertEquals(0, plus.calculate(new double[]{1.0, -1.0}), 0.0001);
        assertEquals(4, plus.calculate(new double[]{2.0, 2.0}), 0.0001);
        assertEquals(-2, plus.calculate(new double[]{1.0, -3.0}), 0.0001);
        assertEquals(2, plus.calculate(new double[]{-3.0, 5.0}), 0.0001);
    }
}