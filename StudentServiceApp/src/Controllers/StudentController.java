package Controllers;

import StudentDomen.Student;
import StudentService.StudentGroupService;
import StudentService.StudentService;

/**
 * Класс Контроллер Стедентов, имплементированный интерфейсом контроллера за
 * пользователями
 */
public class StudentController implements iUserController<Student> {
    // поле данные сервиса студентов
    private final StudentService dataService = new StudentService();
    // поле данные сервиса группы студентов
    private final StudentGroupService groupService = new StudentGroupService();

    // перегрузка метода создания экземпляра
    @Override
    public void create(String firstName, String secondName, String patronimic, int age) {
        dataService.create(firstName, secondName, patronimic, age);
    }

    /**
     * @param firstName
     * @param secondName
     * @param patronimic
     * @param age
     */
    
    }

