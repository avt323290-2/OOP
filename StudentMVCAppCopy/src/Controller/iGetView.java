package Controller;

import java.util.List;
import Model.Student;

/**
 * Интерфейс для создания блока view в модели MVC
 */
public interface iGetView {
    // печать всех студентов в консоль
    void printAllStudent(List<Student> students);

    // метод для вывода в консоль сообщения message, и приема слова из консоли
    String prompt();

    // запрос id удаляемого студента
    Long getStudentIdToDelete();

    // отображение студентов
    void displayStudents(List<Student> students);

    // чтение данных студента
    Student readStudent();

    // запрос id обновляемого студента
    Long getStudentIdToUpdate();
}
