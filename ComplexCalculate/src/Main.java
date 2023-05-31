import calculator.*;
import complex.*;
import logger.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a logger (choose either ConsoleLogger or FileLogger)
        Logger logger = new ConsoleLogger(); // or new FileLogger("log.txt");

        // Create an instance of the complex calculator
        Calculator calculator = new ComplexCalculator(logger);

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first complex number
        System.out.println("Введите действительную часть первого комплексного числа:");
        double real1 = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого комплексного числа:");
        double imaginary1 = scanner.nextDouble();
        ComplexNumber num1 = new ComplexNumber(real1, imaginary1);

        // Prompt the user to enter the second complex number
        System.out.println("Введите действительную часть второго комплексного числа:");
        double real2 = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого комплексного числа:");
        double imaginary2 = scanner.nextDouble();
        ComplexNumber num2 = new ComplexNumber(real2, imaginary2);

        // Perform calculations
        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber quotient = calculator.divide(num1, num2);

        // Print the results
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
        System.out.println("ЧАстное: " + quotient);

        // Close the Scanner object
        scanner.close();
    }
}
