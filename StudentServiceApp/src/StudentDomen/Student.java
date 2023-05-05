package StudentDomen;


/**
 * Класс Студент дочерний от Пользователь, с добавлением интерфейса для
 * сравнения студентов
 */
public class Student extends User implements Comparable<Student> {
    private long studentID;

    /**
     * конструктор класса
     * 
     * @param firstName  имя
     * @param secondName фамилия
     * @param patronymic отчество
     * @param age        возраст
     * @param studentID  идентификационный номер
     */
    public Student(String firstName, String secondName, String patronymic, int age, long studentID) {
        super(firstName, secondName, patronymic, age);
        this.studentID = studentID;
    }

    /* получение идентификационного номера студента */
    public long getStudentID() {
        return studentID;
    }

    /* установка идентификационного номера студента */
    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    /* перегрузка метода вывода */
    @Override
    public String toString() {
        return "Student{"
                + "firstName=" + super.getFirstName()
                + ", secondName=" + super.getSecondName()
                + ", patronymic=" + super.getPatronymic()
                + ", age=" + super.getAge() +
                ", studentID=" + studentID +
                '}';
    }

    /* перегрузка метода для сравнения двух студентов */
    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()) {
            if (this.studentID == o.studentID) {
                return 0;
            }
            if (this.studentID < o.studentID) {
                return -1;
            }
            return 1;
        }
        if (super.getAge() < o.getAge()) {
            return -1;
        }
        return 1;
    }
}
