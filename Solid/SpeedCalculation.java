package Solid;
/*
 * 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
public class SpeedCalculation {
public double calculateAllowedSpeed(Vehicle vehicle) {
if (vehicle.getType().equalsIgnoreCase("Car")) {
return vehicle.getMaxSpeed() * 0.8;
} else if (vehicle.getType().equalsIgnoreCase("Bus")) {
return vehicle.getMaxSpeed() * 0.6;
}
    return 0.0;
}
}
public class Vehicle {
int maxSpeed;
String type;
public Vehicle(int maxSpeed, String type) {
this.maxSpeed = maxSpeed;
this.type = type;
}
public int getMaxSpeed() {
return this.maxSpeed;
}
public String getType() {
return this.type;
}
}

Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), напишите метод calculateAllowedSpeed(). 
Использование этого метода позволит сделать класс SpeedCalculation соответствующим OCP
 */
/**
 * Абстрактный класс, представляющий транспортное средство.
 */
/**
 * Абстрактный класс, представляющий транспортное средство.
 */
public abstract class Vehicle {
    int maxSpeed;
    String type;

    /**
     * Конструктор класса Vehicle.
     *
     * @param maxSpeed максимальная скорость транспортного средства
     * @param type     тип транспортного средства
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    /**
     * Получить максимальную скорость транспортного средства.
     *
     * @return максимальная скорость
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Получить тип транспортного средства.
     *
     * @return тип транспортного средства
     */
    public String getType() {
        return this.type;
    }

    /**
     * Рассчитать разрешенную скорость движения транспортного средства.
     *
     * @return разрешенная скорость
     */
    public abstract double calculateAllowedSpeed();
}

/**
 * Класс, представляющий автомобиль.
 */
public class Car extends Vehicle {
    /**
     * Конструктор класса Car.
     *
     * @param maxSpeed максимальная скорость автомобиля
     */
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    /**
     * Рассчитать разрешенную скорость движения автомобиля.
     *
     * @return разрешенная скорость
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}

/**
 * Класс, представляющий автобус.
 */
public class Bus extends Vehicle {
    /**
     * Конструктор класса Bus.
     *
     * @param maxSpeed максимальная скорость автобуса
     */
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    /**
     * Рассчитать разрешенную скорость движения автобуса.
     *
     * @return разрешенная скорость
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
}

/**
 * Класс, отвечающий за расчет разрешенной скорости транспортного средства.
 */
public class SpeedCalculation {
    /**
     * Рассчитать разрешенную скорость движения транспортного средства.
     *
     * @param vehicle транспортное средство
     * @return разрешенная скорость
     */
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.calculateAllowedSpeed();
    }
}
