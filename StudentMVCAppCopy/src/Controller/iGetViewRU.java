package Controller;

import java.util.List;

import Model.Student;

public interface iGetViewRU {

    void displayStudents(List<Student> students);

    String prompt();

    Long getStudentIdToDelete();

    Student readStudent();

    Long getStudentIdToUpdate();

}
