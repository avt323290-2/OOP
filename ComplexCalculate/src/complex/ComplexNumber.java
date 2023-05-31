package complex;

/**
 * Представляет комплексное число.
 */
public class ComplexNumber {
    private double real;
    private double imaginary;

    /**
     * Создает комплексное число с указанными вещественной и мнимой частями.
     *
     * @param real      Вещественная часть комплексного числа.
     * @param imaginary Мнимая часть комплексного числа.
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Возвращает вещественную часть комплексного числа.
     *
     * @return Вещественная часть комплексного числа.
     */
    public double getReal() {
        return real;
    }

    /**
     * Возвращает мнимую часть комплексного числа.
     *
     * @return Мнимая часть комплексного числа.
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * Выполняет сложение данного комплексного числа с другим комплексным числом.
     *
     * @param other Другое комплексное число.
     * @return Результат сложения комплексных чисел.
     */
    public ComplexNumber add(ComplexNumber other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(sumReal, sumImaginary);
    }

    /**
     * Выполняет умножение данного комплексного числа на другое комплексное число.
     *
     * @param other Другое комплексное число.
     * @return Результат умножения комплексных чисел.
     */
    public ComplexNumber multiply(ComplexNumber other) {
        double productReal = this.real * other.real - this.imaginary * other.imaginary;
        double productImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(productReal, productImaginary);
    }

    /**
     * Выполняет деление данного комплексного числа на другое комплексное число.
     *
     * @param other Другое комплексное число.
     * @return Результат деления комплексных чисел.
     */
    public ComplexNumber divide(ComplexNumber other) {
        double divisor = other.real * other.real + other.imaginary * other.imaginary;
        double quotientReal = (this.real * other.real + this.imaginary * other.imaginary) / divisor;
        double quotientImaginary = (this.imaginary * other.real - this.real * other.imaginary) / divisor;
        return new ComplexNumber(quotientReal, quotientImaginary);
    }

    /**
     * Возвращает строковое представление комплексного числа.
     *
     * @return Строковое представление комплексного числа.
     */
    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
}
