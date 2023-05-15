package Controller;

import java.util.List;
import Model.Student;

/**
 * Интерфейс для создания блока model в модели MVC
 */
public interface iGetModel {
    // метод получения всех студентов
    public List<Student> getAllStudent();

    // метод удаления студента по заданному id
    public int deleteStudentById(Long id);

    public boolean createStudent(Student newStudent);

    public void updateStudentById(Long updateId, Student updatedStudent);

    public List<Student> getAllStudents();
}