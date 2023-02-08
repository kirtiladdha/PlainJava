package com.tomgregory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.tomgregory.*;
public class CalculatorTest {
    @Test
    public void canRunApplication() {
        Calculator calc = new Calculator();
        int result = calc.add(1, 2);
        assertEquals(3, result);
    }
}
