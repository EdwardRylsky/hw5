package org.example.functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrTest {
    Sqr sqr = new Sqr();

    @Test
    void calculateTest() {
        assertEquals(16, sqr.calculate(new double[]{4}), 0.0001);
        assertEquals(4, sqr.calculate(new double[]{-2}), 0.0001);
        assertEquals(625, sqr.calculate(new double[]{25}), 0.0001);
        assertEquals(1, sqr.calculate(new double[]{-1.0}), 0.0001);
        assertEquals(100, sqr.calculate(new double[]{10}), 0.0001);
    }
}