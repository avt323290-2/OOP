import calculator.*;
import complex.*;
import logger.*;

import java.util.Scanner;

/**
 * Главный класс Main является точкой входа в программу и содержит логику для взаимодействия с пользователем 
 * и выполнения операций над комплексными числами.
 */
public class Main {
    public static void main(String[] args) {
        // Создаем логгер (выберите ConsoleLogger или FileLogger)
        Logger logger = new ConsoleLogger(); // или new FileLogger("log.txt");

        // Создаем экземпляр калькулятора комплексных чисел
        Calculator calculator = new ComplexCalculator(logger);

        // Создаем объект Scanner для считывания ввода от пользователя
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести первое комплексное число
        System.out.println("Введите действительную часть первого комплексного числа:");
        double real1 = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого комплексного числа:");
        double imaginary1 = scanner.nextDouble();
        ComplexNumber num1 = new ComplexNumber(real1, imaginary1);

        // Просим пользователя ввести второе комплексное число
        System.out.println("Введите действительную часть второго комплексного числа:");
        double real2 = scanner.nextDouble();
        System.out.println("Введите мнимую часть второго комплексного числа:");
        double imaginary2 = scanner.nextDouble();
        ComplexNumber num2 = new ComplexNumber(real2, imaginary2);

        // Выполняем вычисления
        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber quotient = calculator.divide(num1, num2);

        // Выводим результаты
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);

        // Закрываем объект Scanner
        scanner.close();
    }
}
