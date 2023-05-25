package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }
//    Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить
//    num1 и num2 и вернуть результат в формате “5 + 5 = 10”.

    @GetMapping(path = "plus") //rio-centr.ru/calculator/plus
    public String plus(
            @RequestParam(value = "num1", required = false) Integer num1,
            @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "divide")
    public String divide(
            @RequestParam(value = "num1", required = false) Double num1,
            @RequestParam(value = "num2", required = false) Double num2) {
        return calculatorService.divide(num1, num2);
    }
}
