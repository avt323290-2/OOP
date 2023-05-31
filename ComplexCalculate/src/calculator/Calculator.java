package calculator;

import complex.ComplexNumber;

public interface Calculator {
    ComplexNumber add(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2);
    ComplexNumber divide(ComplexNumber num1, ComplexNumber num2);
}
