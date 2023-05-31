package calculator;

import complex.ComplexNumber;

/**
 * Интерфейс калькулятора для работы с комплексными числами.
 */
public interface Calculator {
    /**
     * Складывает два комплексных числа.
     *
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат сложения комплексных чисел.
     */
    ComplexNumber add(ComplexNumber num1, ComplexNumber num2);

    /**
     * Умножает два комплексных числа.
     *
     * @param num1 Первое комплексное число.
     * @param num2 Второе комплексное число.
     * @return Результат умножения комплексных чисел.
     */
    ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2);

    /**
     * Делит одно комплексное число на другое.
     *
     * @param num1 Делимое комплексное число.
     * @param num2 Делитель комплексное число.
     * @return Результат деления комплексных чисел.
     */
    ComplexNumber divide(ComplexNumber num1, ComplexNumber num2);
}
