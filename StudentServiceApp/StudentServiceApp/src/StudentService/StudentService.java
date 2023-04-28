package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;

public class StudentService implements iUserService<Student> {
    private int count;
    private List<Student> students;
    public StudentService() {
        this.students = new ArrayList<Student>();
    }
    @Override
    public void create(String firstName, String secondName, int age) {
       Student per = new Student(firstName, secondName, age, count);
       count++;  
       students.add(per);      
    }

    @Override
    public List<Student> getAll() {
        return students;
    }   

    // public List<Student> getAll()
    // {
    //     return students;
    // }


}