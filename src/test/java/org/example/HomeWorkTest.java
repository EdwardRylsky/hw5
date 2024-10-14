package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeWorkTest {

    HomeWork homeWork = new HomeWork();

    @Test
    void check() {
        assertEquals(1.1, 1.10000000001, 0.0001);
    }

    @Test
    void calculateTest() {
        assertEquals(-1.0, homeWork.calculate("1 + 2 * ( 3 - 4 )"), 0.0001);
        assertEquals(1, homeWork.calculate("( sin ( 10 ) ) ^ 2 + ( cos ( 10 ) ) ^ 2"), 0.0001);
        assertEquals(1, homeWork.calculate("sqr ( sin ( 10 ) ) + sqr ( cos ( 10 ) )"), 0.0001);
        assertEquals(1, homeWork.calculate("pow ( sin ( 10 ) , 2 ) + pow ( cos ( 10 ) , 2 )"), 0.0001);
        assertEquals(18, homeWork.calculate("pow ( 2 , 3 ) + 10"), 0.0001);

        assertEquals(1024, homeWork.calculate("2 ^ 10"), 0.0001);
        assertEquals(0.5, homeWork.calculate("10 / 20"), 0.0001);
    }
}