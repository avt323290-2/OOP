package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/**
 * Класс ViewRU предоставляет функции для вывода данных на русском языке и имплементирует интерфейс iGetView.
 */
public class ViewRU implements iGetView {
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
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите команду из списка [LIST, EXIT, DELETE, READ, CREATE, UPDATE]: ");
            return in.nextLine();
        }
    }

    /**
     * Запрашивает у пользователя идентификатор студента для удаления.
     *
     * @return Идентификатор студента для удаления
     */
    public Long getStudentIdToDelete() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите ID студента, которого хотите удалить: ");
            return (long) in.nextInt();
        }
    }

    @Override
    public void displayStudents(List<Student> students) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayStudents'");
    }

    @Override
    public Student readStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readStudent'");
    }

    @Override
    public Long getStudentIdToUpdate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToUpdate'");
    }
}
