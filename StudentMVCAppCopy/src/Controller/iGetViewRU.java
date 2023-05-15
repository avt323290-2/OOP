package Controller;

import java.util.List;

import Model.Student;

/**
 * Интерфейс iGetViewRU предоставляет методы для взаимодействия с пользовательским интерфейсом на русском языке.
 */
public interface iGetViewRU {

    /**
     * Отображает список студентов.
     *
     * @param students список студентов
     */
    void displayStudents(List<Student> students);

    /**
     * Запрашивает ввод команды от пользователя.
     *
     * @return введенная команда
     */
    String prompt();

    /**
     * Запрашивает идентификатор студента для удаления.
     *
     * @return идентификатор студента для удаления
     */
    Long getStudentIdToDelete();

    /**
     * Запрашивает данные нового студента.
     *
     * @return объект Student, содержащий данные нового студента
     */
    Student readStudent();

    /**
     * Запрашивает идентификатор студента для обновления.
     *
     * @return идентификатор студента для обновления
     */
    Long getStudentIdToUpdate();

}
