package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Teacher;
import StudentDomen.UserComparator;

/**

Класс Сервис преподавателей имплементирует интерфейс Сервис Пользователей
*/
public class TeacherService implements iUserService<Teacher> {
// счетчик количества элементов типа Teacher, так же используется в качестве
// идентификатора для элементов
private int count;
// список преподавателей, созданных внутри сервиса
private List<Teacher> teachers;
// конструктор класса, параметры не принимает, определяет поле teachers как
// пустой массив
public TeacherService() {
this.teachers = new ArrayList<Teacher>();
}

// создание элемента с учетом ученой степени
public void create(String firstName, String secondName, String patronimic, int age, String academicDegree) {
Teacher per = new Teacher(firstName, secondName, patronimic, age, count, academicDegree);
count++;
teachers.add(per);
}

// перегрузка метода создания элемента
@Override
public void create(String lastName, String firstName, String patronymic, int age) {
Teacher per = new Teacher(lastName, firstName, patronymic, age, count, "");
count++;
teachers.add(per);
}

// перегрузка метода получения всех элементов
@Override
public List<Teacher> getAll() {
return teachers;
}

// метод получения отсортированных преподавателей по ФИО
public List<Teacher> getSortedByFIOStudentGroup() {
List<Teacher> teachs = new ArrayList<>(teachers);
teachs.sort(new UserComparator<Teacher>());
return teachs;
}
}