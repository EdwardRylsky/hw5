package org.example.functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerTest {
    Power power = new Power();

    @Test
    void calculateTest() {
        assertEquals(1, power.calculate(new double[]{1.0, -1.0}), 0.0001);
        assertEquals(0.2, power.calculate(new double[]{5.0, -1.0}), 0.0001);
        assertEquals(4, power.calculate(new double[]{2.0, 2.0}), 0.0001);
        assertEquals(27, power.calculate(new double[]{3.0, 3.0}), 0.0001);
        assertEquals(5, power.calculate(new double[]{25.0, 0.5}), 0.0001);
    }
}