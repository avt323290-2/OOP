import calculator.*;
import complex.*;
import logger.*;

public class Main {
    public static void main(String[] args) {
        // Create a logger (choose either ConsoleLogger or FileLogger)
        Logger logger = new ConsoleLogger(); // or new FileLogger("log.txt");

        // Create an instance of the complex calculator
        Calculator calculator = new ComplexCalculator(logger);

        // Perform some calculations
        ComplexNumber num1 = new ComplexNumber(2.5, 3.2);
        ComplexNumber num2 = new ComplexNumber(1.8, -2.7);

        ComplexNumber sum = calculator.add(num1, num2);
        ComplexNumber product = calculator.multiply(num1, num2);
        ComplexNumber quotient = calculator.divide(num1, num2);

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
