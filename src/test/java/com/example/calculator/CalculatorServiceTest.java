package com.example.calculator;

import com.example.calculator.exception.DivByZero;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.DigestException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void plusTest() {
        String actual = calculatorService.plus(1, 2);
        String excpected = "1 + 2 = 3";
        assertEquals(excpected, actual);

        actual = calculatorService.plus(300, 700);
        excpected = "300 + 700 = 1000";
        assertEquals(excpected, actual);

    }

    @Test
    public void minusTest() {
        String actual = calculatorService.minus(1, 2);
        String excpected = "1 - 2 = -1";
        assertEquals(excpected, actual);

        actual = calculatorService.minus(300, 700);
        excpected = "300 - 700 = -400";
        assertEquals(excpected, actual);

    }

    @Test
    public void multiplyTest() {
        String actual = calculatorService.multiply(1, 2);
        String excpected = "1 * 2 = 2";
        assertEquals(excpected, actual);

        actual = calculatorService.multiply(3, 7);
        excpected = "3 * 7 = 21";
        assertEquals(excpected, actual);

    }

    @Test
    public void divideTest() {
        String actual = calculatorService.divide(1.0, 2.0);
        String excpected = "-1.0 / 2.0 = 2.0";
        actual = calculatorService.divide(-1.0, 2.0);
        excpected = "-1.0 / 2.0 = -0.5";
        assertEquals(excpected, actual);
    }

    @Test
    public void divideNegativeTest() {
        Assertions.assertThrows(DivByZero.class, () -> calculatorService.divide(1.0, 0.0));
    }
}
