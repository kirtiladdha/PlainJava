package com.tomgregory;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void canRunApplication() {
         Calculator calc = new Calculator();
        int result = calc.add(1, 2);
        assertEquals(3, result);
    }
}
