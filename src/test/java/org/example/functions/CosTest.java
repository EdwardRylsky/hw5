package org.example.functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CosTest {
    Cos cos = new Cos();

    @Test
    void calculateTest() {
        assertEquals(0, cos.calculate(new double[]{Math.PI / 2}), 0.0001);
        assertEquals(1, cos.calculate(new double[]{0}), 0.0001);
    }
}