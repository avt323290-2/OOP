package StudentDomen;

/**
Класс Преподаватель дочерний от Пользователь
*/
public class Teacher extends User {

private String patronymic;
private int teacherId;
private String academicDegree;

/**

конструктор класса
@param firstName имя
@param secondName фамилия
@param patronymic отчество
@param age возраст
@param academicDegree ученая степень
*/
public Teacher(String firstName, String secondName, String patronymic, int age, int teacherId, String academicDegree) {
super(firstName, secondName, patronymic, age);
//this.patronymic = patronymic;
this.teacherId = teacherId;
this.academicDegree = academicDegree;
}
/* получение идентификационного номера преподавателя */
public int getTeacherId() {
return teacherId;
}

/* установка идентификационного номера преподавателя */
public void setTeacherId(int teacherId) {
this.teacherId = teacherId;
}

/* получение ученой степени преподавателя */
public String getAcademicDegree() {
return academicDegree;
}

/* установка ученой степени преподавателя */
public void setAcademicDegree(String academicDegree) {
this.academicDegree = academicDegree;
}

/* перегрузка метода вывода */
@Override
public String toString() {
return "Teacher{" +
"firstName=" + getFirstName() +
", secondName=" + getSecondName() +
", patronymic=" + getPatronymic() +
", age=" + getAge() +
", teacherId=" + teacherId +
", academicDegree=" + academicDegree +
'}';
}

}