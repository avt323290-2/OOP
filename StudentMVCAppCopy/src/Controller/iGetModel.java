package Controller;

import java.util.List;
import Model.Student;

/**
 * Интерфейс для создания блока model в модели MVC
 */
public interface iGetModel {
    // Метод getAllStudents() предназначен для извлечения списка всех студентов.
    public List<Student> getAllStudent();

    // Метод deleteStudentById() выполняет удаление студента по указанному id
    public int deleteStudentById(Long id);

    //Метод createStudent(Student newStudent) выполняет создание нового студента
    public boolean createStudent(Student newStudent);

    //Метод updateStudentById(Long updateId, Student updatedStudent) выполняет обновление информации о студенте по заданному id 
    public void updateStudentById(Long updateId, Student updatedStudent);

    //Метод getAllStudents() позволяет получить полную информацию о всех студентах, хранящихся в системе
    public List<Student> getAllStudents();
}