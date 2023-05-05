package StudentDomen;

import java.util.Iterator;
import java.util.List;

/**
 * Класс Группа студентов, расширенный интерфейсом Iterable для возможности
 * перебора элементов внутри него,
 * и интерфейсом Comparable для указания метода сравнения групп студентов
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;
    private long groupID;

    /**
     * конструктор класса
     * 
     * @param students список студентов
     * @param groupID  номер группы
     */
    public StudentGroup(List<Student> students, long groupID) {
        this.students = students;
        this.groupID = groupID;
    }

    public StudentGroup(String string) {
    }

    /* получение списка студентов в группе */
    public List<Student> getStudents() {
        return students;
    }

    /* установка списка студентов группы */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /* получение номера группы */
    public long getGroupID() {
        return groupID;
    }

    /* установка номера группы */
    public void setGroupID(long groupID) {
        this.groupID = groupID;
    }

    /* перегрузка метода Итератора с использованием анонимного класса */
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < students.size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                // counter++;
                return students.get(index++);
            }

        };
    }

    /* перегрузка метода сравнения двух студенческих групп */
    @Override
    public int compareTo(StudentGroup o) {
        if (this.students.size() == o.getStudents().size()) {
            return 0;
        }
        if (this.students.size() < o.getStudents().size()) {
            return -1;
        }
        return 1;
    }

    public void addStudent(Object byId) {
    }

    public char[] getName() {
        return null;
    }

}