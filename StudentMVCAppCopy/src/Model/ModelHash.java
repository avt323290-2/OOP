package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

/**
 * Класс ModelHash предоставляет методы для передачи данных о студентах с использованием хэш-таблицы и реализует интерфейс iGetModel.
 */
public class ModelHash implements iGetModel {
    private HashMap<Long, Student> students;

    /**
     * Конструктор класса ModelHash.
     * 
     * @param students Список студентов в виде хэш-таблицы
     */
    public ModelHash(HashMap<Long, Student> students) {
        this.students = students;
    }
  
    /**
     * Возвращает список всех студентов.
     * 
     * @return Список студентов
     */
    public List<Student> getAllStudents() {
        List<Student> studList = new ArrayList<Student>();

        for (var stud : students.entrySet())
            studList.add(stud.getValue());

        return studList;
    }

    /**
     * Удаляет студента по заданному идентификатору.
     * 
     * @param id Идентификатор студента для удаления
     * @return 1, если студент успешно удален, -1, если студент с указанным идентификатором не найден
     */
    public int deleteStudentById(Long id) {
        if (students.containsKey(id)) {
            students.remove(id);
            return 1;
        }
        return -1;
    }

    /**
     * Создает нового студента.
     * 
     * @param student Новый студент для создания
     * @return true, если студент успешно создан, false, если студент с таким идентификатором уже существует
     */
    public boolean createStudent(Student student) {
        if (students.containsKey(student.getId())) {
            return false; // Студент с таким идентификатором уже существует
        } else {
            students.put((Long) student.getId(), student);
            return true; // Студент успешно создан
        }
    }

    /**
     * Обновляет данные студента по заданному идентификатору.
     * 
     * @param updateId        Идентификатор студента для обновления
     * @param updatedStudent Обновленные данные студента
     * @throws IllegalArgumentException если студент с указанным идентификатором не найден
     */
    public void updateStudentById(Long updateId, Student updatedStudent) {
        if (students.containsKey(updateId)) {
            students.put(updateId, updatedStudent);
        } else {
            throw new IllegalArgumentException("Студент с указанным идентификатором не найден!");
        }
    }

    @Override
    public List<Student> getAllStudent() {
        return getAllStudents();
    }
}
