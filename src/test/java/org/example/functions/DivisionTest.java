package org.example.functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisionTest {
    Division division = new Division();

    @Test
    void calculateTest() {
        assertEquals(-2, division.calculate(new double[]{-30.0, 15.0}), 0.0001);
        assertEquals(-1, division.calculate(new double[]{1.0, -1.0}), 0.0001);
        assertEquals(1, division.calculate(new double[]{2.0, 2.0}), 0.0001);
        assertEquals(-1, division.calculate(new double[]{3.0, -1.0}), 0.0001);
        assertEquals(4.4, division.calculate(new double[]{-22.0, -5.0}), 0.0001);
    }
}