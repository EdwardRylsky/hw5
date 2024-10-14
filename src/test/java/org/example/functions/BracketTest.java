package org.example.functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

class BracketTest {
    OpenBracket openBracket = new OpenBracket();
    CloseBracket closeBracket = new CloseBracket();

    @Test
    void calculateTest() {
        assertNull(openBracket.calculate(null));
        assertNull(openBracket.calculate(null));
    }
}