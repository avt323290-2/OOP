package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Emploee;
import StudentDomen.UserComparator;

/**
 * Класс Сервис рабочих имплементирует интерфейс Сервис Пользователей
 */
public class EmploeeService implements iUserService<Emploee> {
    // список рабочих, созданных внутри сервиса
    private List<Emploee> emploees;

    // конструктор класса, парпметры не принимает, определяет поле emploees как
    // пустой
    // массив
    public EmploeeService() {
        this.emploees = new ArrayList<Emploee>();
    }

    // перегрузка метода создания элемента
    @Override
    public void create(String lastName, String firstName, String patronymic, int age) {
        emploees.add(new Emploee(lastName, firstName, patronymic, age));
    }

    // перегрузка метода получения всех элементов
    @Override
    public List<Emploee> getAll() {
        return emploees;
    }

    // метод получения отсортированных работников по ФИО
    public List<Emploee> getSortedByFIOStudentGroup() {
        List<Emploee> emps = new ArrayList<>(emploees);
        emps.sort(new UserComparator<Emploee>());
        return emps;
    }
}