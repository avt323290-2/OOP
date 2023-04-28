package StudentDomen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentGroup implements Comparable<StudentGroup> {
    private List<Student> students;
    private String groupName;

    public StudentGroup(String groupName) {
        this.students = new ArrayList<>();
        this.groupName = groupName;
    }

    public StudentGroup(String string, List<Student> of) {
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    public int getNumberOfStudents() {
        return this.students.size();
    }

    public String getGroupName() {
        return this.groupName;
    }

    @Override
    public int compareTo(StudentGroup o) {
        return Integer.compare(this.getNumberOfStudents(), o.getNumberOfStudents());
    }

    public void sort() {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getSurname().compareTo(s2.getSurname());
            }
        });
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSurname());
        }
    }

    public String getSize() {
        return null;
    }

    public StudentGroupIterator getIterator() {
        return null;
    }
}
