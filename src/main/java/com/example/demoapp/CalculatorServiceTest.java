package com.example.demoapp;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(4, calculatorService.add(2, 2));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculatorService.divide(4, 2));
    }

}
