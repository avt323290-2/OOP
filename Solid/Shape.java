package Solid;

/**
 * Интерфейс, представляющий геометрическую фигуру.
 */
public interface Shape {
    /**
     * Рассчитать площадь фигуры.
     *
     * @return площадь фигуры
     */
    double area();
}

/**
 * Класс, представляющий круг.
 */
public class Circle implements Shape {
    private double radius;

    /**
     * Конструктор класса Circle.
     *
     * @param radius радиус круга
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Рассчитать площадь круга.
     *
     * @return площадь круга
     */
    @Override
    public double area() {
        return 2 * Math.PI * radius;
    }
}

/**
 * Класс, представляющий куб.
 */
public class Cube implements Shape {
    private int edge;

    /**
     * Конструктор класса Cube.
     *
     * @param edge длина стороны куба
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    /**
     * Рассчитать площадь поверхности куба.
     *
     * @return площадь поверхности куба
     */
    @Override
    public double area() {
        return 6 * edge * edge;
    }
}
