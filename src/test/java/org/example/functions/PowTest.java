package org.example.functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowTest {
    Pow pow = new Pow();

    @Test
    void calculateTest() {
        assertEquals(1, pow.calculate(new double[]{1.0, -1.0}), 0.0001);
        assertEquals(0.2, pow.calculate(new double[]{5.0, -1.0}), 0.0001);
        assertEquals(4, pow.calculate(new double[]{2.0, 2.0}), 0.0001);
        assertEquals(27, pow.calculate(new double[]{3.0, 3.0}), 0.0001);
        assertEquals(5, pow.calculate(new double[]{25.0, 0.5}), 0.0001);
    }
}