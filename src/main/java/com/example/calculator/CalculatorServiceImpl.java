package com.example.calculator;

import com.example.calculator.exception.DivByZero;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome() {
        return "Добро пожаловать";
    }

    @Override
    public String plus(Integer num1, Integer num2) {
        if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        }
        return num1 + " + " + num2 + " = " + (num1 + num2); // “5 + 5 = 10”
    }

    @Override
    public String minus(Integer num1, Integer num2) {
        if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        }
        return num1 + " - " + num2 + " = " + (num1 - num2); // “5 + 5 = 10”
    }

    @Override
    public String multiply(Integer num1, Integer num2) {
        if (num1 == null) {
            return "Введите первое число";
        } else if (num2 == null) {
            return "Введите второе число";
        }
        return num1 + " * " + num2 + " = " + (num1 * num2); // “5 + 5 = 10”
    }

    @Override
    public String divide(Double num1, Double num2) {
        if (num1 == null) {
            return "Введите первое число";
        }
        if (num2 == null) {
            return "Введите второе число";
        }
        if (num2 == 0) {
            throw new DivByZero();
        }
        return Double.toString(num1) + " / " + Double.toString(num2) + " = " +
                Double.toString(num1 / num2);
    }
}
