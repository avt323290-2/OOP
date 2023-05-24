/*
 * 4) Переписать код в соответствии с Liskov Substitution Principle:
public class Rectangle {
private int width;
private int height;
public void setWidth(int width) {
this.width = width;
}
public void setHeight(int height) {
this.height = height;
}
public int area() {
return this.width * this.height;
}
}
public class Square extends Rectangle {
@Override
public void setWidth(int width) {
super.width = width;
super.height = width;
}
@Override
public void setHeight(int height) {
super.width = height;
super.height = height;
}
}
 */
package Solid;

/**
 * Класс Rectangle представляет прямоугольную фигуру.
 */
public class Rectangle {
    protected int width;
    protected int height;

    /**
     * Устанавливает ширину прямоугольника.
     *
     * @param width ширина прямоугольника
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Устанавливает высоту прямоугольника.
     *
     * @param height высота прямоугольника
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Вычисляет и возвращает площадь прямоугольника.
     *
     * @return площадь прямоугольника
     */
    public int area() {
        return this.width * this.height;
    }
}

/**
 * Класс Square представляет квадратную фигуру.
 */
public class Square extends Rectangle {
    /**
     * Устанавливает ширину и высоту квадрата равными переданному значению.
     *
     * @param sideLength длина стороны квадрата
     */
    @Override
    public void setWidth(int sideLength) {
        super.setWidth(sideLength);
        super.setHeight(sideLength);
    }

    /**
     * Устанавливает ширину и высоту квадрата равными переданному значению.
     *
     * @param sideLength длина стороны квадрата
     */
    @Override
    public void setHeight(int sideLength) {
        super.setWidth(sideLength);
        super.setHeight(sideLength);
    }
}

/**
 * Главный класс, демонстрирующий использование классов Rectangle и Square.
 */
public class Main {
    public static void main(String[] args) {
        // Создание прямоугольника
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println("Площадь прямоугольника: " + rectangle.area());

        // Создание квадрата
        Square square = new Square();
        square.setWidth(5);
        System.out.println("Площадь квадрата: " + square.area());
    }
}
