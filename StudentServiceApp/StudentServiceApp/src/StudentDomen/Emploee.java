package StudentDomen;

public class Emploee extends User {

    private int empId;

    public Emploee(String firstName, String secondName, int age, int empId) {
        super(firstName, secondName, age);
        this.empId = empId;
    }

    public Emploee(int i, String string, String string2) {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFullName() {
        return null;
    }

}