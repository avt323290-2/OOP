package calculator;

import complex.ComplexNumber;
import logger.Logger;

public class ComplexCalculator implements Calculator {
    private Logger logger;

    public ComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    @Override
    public ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.add(num2);
        logger.log("Performed addition: " + num1 + " + " + num2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.multiply(num2);
        logger.log("Performed multiplication: " + num1 + " * " + num2 + " = " + result);
        return result;
    }

    @Override
    public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = num1.divide(num2);
        logger.log("Performed division: " + num1 + " / " + num2 + " = " + result);
        return result;
    }
}
