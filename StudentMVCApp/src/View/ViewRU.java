package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/**
 * Класс ViewRU предоставляет функции для вывода данных на русском языке и имплементирует интерфейс iGetView.
 */
public class ViewRU implements iGetView {
    private Scanner scanner;

    public ViewRU() {
        scanner = new Scanner(System.in);
    }

    /**
     * Выводит всех студентов из списка.
     *
     * @param students Список студентов
     */
    public void printAllStudent(List<Student> students) {
        System.out.println("-----Вывод списка студентов-----");
        for (Student person : students) {
            System.out.println(person);
        }
        System.out.println("-----Конец списка-----");
    }

    /**
     * Запрашивает у пользователя ввод команды.
     *
     * @return Введенная пользователем команда
     */
    public String prompt() {
        System.out.print("Введите команду из списка [LIST, EXIT, DELETE, READ, CREATE, UPDATE]: ");
        return scanner.nextLine();
    }

    /**
     * Запрашивает у пользователя идентификатор студента для удаления.
     *
     * @return Идентификатор студента для удаления
     */
    public Long getStudentIdToDelete() {
        System.out.print("Введите ID студента, которого хотите удалить: ");
        return scanner.nextLong();
    }

    @Override
    public void displayStudents(List<Student> students) {
        System.out.println("-----Список студентов-----");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("-----Конец списка-----");
    }

    @Override
    public Student readStudent() {
        System.out.print("Введите имя студента: ");
        String firstName = scanner.nextLine();
        System.out.print("Введите фамилию студента: ");
        String lastName = scanner.nextLine();
        System.out.print("Введите возраст студента: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Пропустить оставшуюся пустую строку
        System.out.print("Введите ID студента: ");
        long id = scanner.nextLong();
        scanner.nextLine(); // Пропустить оставшуюся пустую строку
        return new Student(firstName, lastName, age, id);
    }

    @Override
    public Long getStudentIdToUpdate() {
        System.out.print("Введите ID студента для обновления: ");
        return scanner.nextLong();
    }
}
