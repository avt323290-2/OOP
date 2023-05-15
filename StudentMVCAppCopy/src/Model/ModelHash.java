package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

/**
 * Класс ModelHash для передачи данных о студентах, имплементирует интерфейс iGetModel
 */
public class ModelHash implements iGetModel {
    // приватное поле список студентов
    private HashMap<Long, Student> students;

    /**
     * конструктор класса
     * 
     * @param students список студентов
     */
    public ModelHash(HashMap<Long, Student> students) {
        this.students = students;
    }

    // определение метода из интерфейса, возвращает список студентов
    public List<Student> getAllStudents() {
        List<Student> studList = new ArrayList<Student>();

        for (var stud : students.entrySet())
            studList.add(stud.getValue());

        return studList;
    }

    // метод удаления студента по заданному id
    public int deleteStudentById(Long id) {
        if (students.containsKey(id)) {
            students.remove(id);
            return 1;
        }
        return -1;
    }

    public boolean createStudent(Student student) {
        if (students.containsKey(student.getId())) {
            return false; // Студент с таким идентификатором уже существует
        } else {
            students.put((Long) student.getId(), student);
            return true; // Студент успешно создан
        }
    }

    public void updateStudentById(Long updateId, Student updatedStudent) {
        if (students.containsKey(updateId)) {
            students.put(updateId, updatedStudent);
        } else {
            throw new IllegalArgumentException("Студент с указанным идентификатором не найден!");
        }
    }

    @Override
    public List<Student> getAllStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllStudent'");
    }
}
