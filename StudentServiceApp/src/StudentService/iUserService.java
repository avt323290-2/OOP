package StudentService;

import java.util.List;

/**
 * Интерфейс Серсис Пользователей с параметрическим типом Т
 */
public interface iUserService<T> {
    // метод получения всех элементов данного сервиса
    List<T> getAll();

    // создание нового элемента внутри Сервиса, заданного типа Т
    void create(String lastName, String firstName, String patronymic, int age);
}