import java.util.HashMap;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.Model;
import Model.ModelHash;
import Model.Student;
import View.ViewEng;
import View.ViewRU;

/**
 * Класс App представляет точку входа в приложение.
 */
public class App {

    /**
     * Метод main запускает приложение.
     *
     * @param args Аргументы командной строки
     * @throws Exception В случае возникновения исключения
     */
    public static void main(String[] args) throws Exception {
        // Создаем список студентов
        HashMap<Long, Student> hashStudents = new HashMap<Long, Student>();
        hashStudents.put((long) 101, new Student("Дмитрий", "Петров", 21, (long) 122));
        hashStudents.put((long) 111, new Student("Тимофей", "Трудов", 22, (long) 211));
        hashStudents.put((long) 121, new Student("Иван", "Смирнов", 22, (long) 125));
        hashStudents.put((long) 301, new Student("Петр", "Чусов", 23, (long) 307));
        hashStudents.put((long) 171, new Student("Елена", "Громова", 25, (long) 291));
        hashStudents.put((long) 104, new Student("Таисия", "Повалий", 23, (long) 174));
        hashStudents.put((long) 238, new Student("Снежанна", "Снегина", 22, (long) 238));
        hashStudents.put((long) 345, new Student("Дмитрий", "Костюшин", 21, (long) 345));

        // Выбираем модель для дальнейшей работы
        iGetModel model = new ModelHash(hashStudents);

        // Выбираем язык View
        iGetView view = new ViewEng();

        // Создаем экземпляр класса Controller с параметрами view и model
        Controller control = new Controller(view, model);
        control.run();
    }
}
