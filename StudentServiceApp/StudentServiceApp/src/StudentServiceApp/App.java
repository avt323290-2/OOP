package StudentServiceApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentGroupIterator;
import StudentDomen.StudentStream;

public class App {
public static void main(String[] args) {
// Создание экземпляров классов Employee и Student
Emploee employee = new Emploee(1, "Иванов", "Иван");
Student student1 = new Student(101, "Петров", "Петр", "Группа 1");
Student student2 = new Student(102, "Сидоров", "Сидор", "Группа 1");
Student student3 = new Student(103, "Иванов", "Иван", "Группа 2");
Student student4 = new Student(104, "Петров", "Петр", "Группа 2");
// Вызов статического метода класса EmployeeController
System.out.println("Сотрудник: " + employee.getFullName());
EmploeeController.processEmploee(employee);

// Создание списка учебных групп
List<StudentGroup> groups = new ArrayList<>();
groups.add(new StudentGroup("Группа 1", List.of(student1, student2)));
groups.add(new StudentGroup("Группа 2", List.of(student3, student4)));

// Создание экземпляра класса StudentStream
StudentStream studentStream = new StudentStream(1, groups);

// Вывод групп студентов через for, используя реализацию интерфейса Iterable
for (StudentGroup group : studentStream) {
    System.out.println(group.getGroupName() + ":");
    for (Student student : group) {
        System.out.println("\t" + student.getFullName());
    }
}

// Сортировка групп студентов и вывод в консоль, используя реализацию интерфейса Comparable
Collections.sort(groups);
System.out.println("Отсортированные группы:");
for (StudentGroup group : groups) {
    System.out.println(group.getGroupName() + " (" + group.getSize() + "):");
    StudentGroupIterator iterator = group.getIterator();
    while (iterator.hasNext()) {
        System.out.println("\t" + iterator.next().getFullName());
    }
}
}
}