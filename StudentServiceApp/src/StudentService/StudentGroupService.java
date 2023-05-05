package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

/**
 * Класс Сервис групп студентов
 */
public class StudentGroupService {
    // поле группы внутри сервиса
    private List<StudentGroup> groups;

    // конструктор класса, параметры не принимает, инициализирует поле groups как
    // пустой массив
    public StudentGroupService() {
        this.groups = new ArrayList<>();
    }

    // метод получения всех групп
    public List<StudentGroup> getAll() {
        return this.groups;
    }

    // метод получения отсортированных студентов по ФИО
    public List<Student> getSortedByFIOStudentGroup(int numberGroup) {
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}
