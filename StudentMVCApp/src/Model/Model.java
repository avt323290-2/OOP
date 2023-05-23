package Model;

import java.util.List;

import Controller.iGetModel;

/**
 * Класс Model предоставляет методы для передачи данных о студентах и реализует интерфейс iGetModel.
 */
public class Model implements iGetModel {
    private List<Student> students;

    /**
     * Конструктор класса Model.
     * 
     * @param students Список студентов
     */
    public Model(List<Student> students) {
        this.students = students;
    }

    /**
     * Возвращает список всех студентов.
     * 
     * @return Список студентов
     */
    public List<Student> getAllStudent() {
        return students;
    }

    /**
     * Удаляет студента по заданному идентификатору.
     * 
     * @param id Идентификатор студента для удаления
     * @return Индекс удаленного студента (-1, если студент не найден)
     */
    public int deleteStudentById(Long id) {
        int i = -1;
        for (Student pers : students) {
            if (pers.getStudentID() == id) {
                i = students.indexOf(pers);
            }
        }
        students.remove(i);
        return i;
    }

    /**
     * Создает нового студента.
     * 
     * @param newStudent Новый студент для создания
     * @return true, если студент успешно создан, false, если студент с таким идентификатором уже существует
     */
    @Override
    public boolean createStudent(Student newStudent) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Unimplemented method 'createStudent'");
    }

    /**
     * Обновляет данные студента по заданному идентификатору.
     * 
     * @param updateId        Идентификатор студента для обновления
     * @param updatedStudent Обновленные данные студента
     */
    @Override
    public void updateStudentById(Long updateId, Student updatedStudent) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Unimplemented method 'updateStudentById'");
    }

    /**
     * Возвращает список всех студентов.
     * 
     * @return Список студентов
     */
    @Override
    public List<Student> getAllStudents() {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Unimplemented method 'getAllStudents'");
    }
}
