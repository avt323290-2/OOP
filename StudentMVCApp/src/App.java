import java.util.HashMap;
import java.util.Scanner;
import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.ModelHash;
import Model.Student;
import View.ViewRU;
import View.ViewEng;

public class App {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
         System.out.print("Выберите язык:\nR. Русский\nE. English\nВведите букву выбранного языка: ");
           String languageChoice = scanner.nextLine().toLowerCase();

           iGetView view;
           if (languageChoice.equals("r")) {
               view = new ViewRU();
           } else if (languageChoice.equals("e")) {
               view = new ViewEng();
           } else {
               System.out.println("Неверный выбор языка. Запуск приложения прерван.");
               return;
           }

           Student s1 = new Student("Дмитрий", "Петров", 21, (long) 122);
           Student s2 = new Student("Тимофей", "Трудов", 22, (long) 211);
           Student s3 = new Student("Иван", "Смирнов", 22, (long) 125);
           Student s4 = new Student("Петр", "Чусов", 23, (long) 307);
           Student s5 = new Student("Елена", "Громова", 25, (long) 291);
           Student s6 = new Student("Таисия", "Повалий", 23, (long) 174);
           Student s7 = new Student("Снежанна", "Снегина", 22, (long) 238);
           Student s8 = new Student("Дмитрий", "Костюшин", 21, (long) 345);

           HashMap<Long, Student> hashStudents = new HashMap<Long, Student>();
           hashStudents.put((long) 101, s1);
           hashStudents.put((long) 111, s2);
           hashStudents.put((long) 121, s3);
           hashStudents.put((long) 301, s4);
           hashStudents.put((long) 171, s5);
           hashStudents.put((long) 104, s6);
           hashStudents.put((long) 238, s7);
           hashStudents.put((long) 345, s8);

           iGetModel model = new ModelHash(hashStudents);
           Controller control = new Controller(view, model);
           control.run();
      }
    }
}
