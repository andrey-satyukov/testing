package com.example.calculator;

public interface CalculatorService {
    String welcome();
    String plus(Integer num1, Integer num2);
    String minus(Integer num1, Integer num2);
    String multiply(Integer num1, Integer num2);
    String divide(Double num1, Double num2);
}
