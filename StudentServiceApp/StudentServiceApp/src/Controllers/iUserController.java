package Controllers;

import StudentDomen.User;

public interface iUserController<T extends User> {
    void create(String firstName, String secondName, int age);
}
