package org.example.functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SinTest {
    Sin sin = new Sin();

    @Test
    void calculateTest() {
        assertEquals(1, sin.calculate(new double[]{Math.PI / 2}), 0.0001);
        assertEquals(0, sin.calculate(new double[]{0}), 0.0001);
    }
}