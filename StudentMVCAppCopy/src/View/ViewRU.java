package View;

import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/**
 * Класс View для организации вывода, имплементирует поведение из интерфейса
 * iGetView
 */
public class ViewRU implements iGetView {
    // определение метода вывода всех студентов в консоль
    public void printAllStudent(List<Student> students) {
        System.out.println("-----Вывод списка студентов-----");
        for (Student person : students) {
            System.out.println(person);
        }
        System.out.println("-----Конец списка-----");
    }

    // выбор команды
    public String prompt() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите команду из списка [LIST,EXIT, DELETE]:");
            return in.nextLine();
        }
    }

    // запрос id удаляемого студента
    public Long getStudentIdToDelete() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите id студента, которого хотите удалить:");
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