package Solid;
/*
 * 3) Переписать код в соответствии с Interface Segregation Principle:
public interface Shape {
double area();
double volume();
}
public class Circle implements Shape {
private double radius;
public Circle(double radius) {
this.radius = radius;
}
@Override
public double area() {
return 2 * 3.14 * radius;
}
@Override
public double volume() {
throw new UnsupportedOperationException();
}
}
public class Cube implements Shape {
private int edge;
public Cube(int edge) {
this.edge = edge;
}
@Override
public double area() {
return 6 * edge * edge;
}
@Override
public double volume() {
return edge * edge * edge;
}
}

Подсказка: круг не объемная фигура и этому классу не нужен метод volume().
 */

 /**
 * Интерфейс для двумерных фигур.
 */
public interface TwoDimensionalShape {
    /**
     * Вычисляет площадь двумерной фигуры.
     *
     * @return площадь фигуры
     */
    double area();
}

/**
 * Интерфейс для трехмерных фигур.
 */
public interface ThreeDimensionalShape {
    /**
     * Вычисляет объем трехмерной фигуры.
     *
     * @return объем фигуры
     */
    double volume();
}

/**
 * Класс, представляющий круг.
 */
public class Circle implements TwoDimensionalShape {
    private double radius;

    /**
     * Конструктор класса Circle.
     *
     * @param radius радиус круга
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * Math.PI * radius;
    }
}

/**
 * Класс, представляющий куб.
 */
public class Cube implements TwoDimensionalShape {
    private int edge;

    /**
     * Конструктор класса Cube.
     *
     * @param edge длина ребра куба
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }
}
