package StudentDomen;

/**
 * Класс Работник дочерний от Пользователь
 */
public class Emploee extends User {

    private int empId;

    /**
     * Конструктор класса
     * 
     * @param firstName  имя
     * @param secondName фамилия
     * @param patronymic отчество
     * @param age        возраст
     * @param empId      идентификационный номер
     */
    public Emploee(String firstName, String secondName, String patronymic, int age, int empId) {
        super(firstName, secondName, patronymic, age);
        this.empId = empId;
    }

    /**
     * Конструктор класса для создания объекта без идентификационного номера
     * 
     * @param firstName  имя
     * @param secondName фамилия
     * @param patronymic отчество
     * @param age        возраст
     */
    public Emploee(String firstName, String secondName, String patronymic, int age) {
        super(firstName, secondName, patronymic, age);
    }

    /* получение идентификационного номера работника */
    public int getEmpId() {
        return empId;
    }

    /* установка идентификационного номера работника */
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    /* перегрузка метода вывода */
    @Override
    public String toString() {
        return "Employee{"
                + "firstName=" + super.getFirstName()
                + ", secondName=" + super.getSecondName()
                + ", patronymic=" + super.getPatronymic()
                + ", age=" + super.getAge()
                + ", empID=" + empId
                + '}';
    }

    public String getId() {
        return null;
    }
}
