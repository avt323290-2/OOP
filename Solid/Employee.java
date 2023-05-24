package Solid;

/*
 * 1) Переписать код в соответствии с Single Responsibility Principle:
public class Employee {
private String name;
private Date dob;
private int baseSalary;
public Employee(String name, Date dob, int baseSalary) {
this.name = name;
this.dob = dob;
this.baseSalary = baseSalary;
}
public String getEmpInfo() {
return "name - " + name + " , dob - " + dob.toString();
}
public int calculateNetSalary() {
int tax = (int) (baseSalary * 0.25);//calculate in otherway
return baseSalary - tax;
}
}

Подсказка: вынесите метод calculateNetSalary() в отдельный класс
 */

 
import java.util.Date;

/**
 * Класс, представляющий сотрудника и отвечающий за информацию о нём.
 */
public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    /**
     * Конструктор класса Employee.
     *
     * @param name       имя сотрудника
     * @param dob        дата рождения сотрудника
     * @param baseSalary базовая заработная плата сотрудника
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    /**
     * Возвращает информацию о сотруднике.
     *
     * @return строка с информацией о сотруднике
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    // Остальные методы и свойства класса Employee...

    /**
     * Класс, отвечающий за расчет чистой заработной платы.
     */
    private class SalaryCalculator {
        /**
         * Вычисляет чистую заработную плату на основе базовой заработной платы.
         *
         * @return чистая заработная плата (с учетом вычета налога)
         */
        public int calculateNetSalary() {
            int tax = (int) (baseSalary * 0.25); // Вычисление налога по-другому
            return baseSalary - tax;
        }
    }
}
