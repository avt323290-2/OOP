package Controllers;

import StudentDomen.User;

// интерфейс контроллера за пользователем
public interface iUserController<T extends User> {
    // метод создания экземпляра типа Т
    void create(String firstName, String secondName, String patronimic, int age);
}