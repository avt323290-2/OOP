// package View;

// import java.util.List;
// import java.util.Scanner;

// import Controller.Commands;
// import Controller.iGetView;
// import Model.Student;

// /**
//  * Класс ViewEn - представление на английском языке
//  */
// public class ViewEng implements iGetView {
//     private Scanner scanner;

//     /**
//      * Конструктор класса
//      */
//     public ViewEng() {
//         scanner = new Scanner(System.in);
//     }

//     @Override
//     public String prompt() {
//         System.out.print("Enter the command from the list [LIST, EXIT, DELETE, READ, CREATE, UPDATE]: ");
//         return scanner.nextLine();
//     }

//     @Override
//     public void displayStudents(List<Student> students) {
//         System.out.println("Students:");
//         for (Student student : students) {
//             System.out.println(student);
//         }
//     }

//     @Override
//     public Long getStudentIdToDelete() {
//         System.out.print("Enter the ID of the student to delete: ");
//         return scanner.nextLong();
//     }

//     @Override
//     public Student readStudent() {
//         scanner.nextLine(); // Clear the newline character from the input buffer
//         System.out.print("Enter the student's first name: ");
//         String firstName = scanner.nextLine();
//         System.out.print("Enter the student's last name: ");
//         String lastName = scanner.nextLine();
//         System.out.print("Enter the student's age: ");
//         int age = scanner.nextInt();
//         System.out.print("Enter the student's ID: ");
//         Long id = scanner.nextLong();
//         return new Student(firstName, lastName, age, id);
//     }

//     @Override
//     public Long getStudentIdToUpdate() {
//         System.out.print("Enter the ID of the student to update: ");
//         return scanner.nextLong();
//     }

//     @Override
//     public void printAllStudent(List<Student> students) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'printAllStudent'");
//     }
// }
package View;

import java.util.List;
import java.util.Scanner;
import Controller.iGetView;
import Model.Student;

/**
 * Класс ViewEng представляет представление данных на английском языке и реализует интерфейс iGetView.
 */
public class ViewEng implements iGetView {
    private Scanner scanner;

    /**
     * Конструктор класса ViewEng.
     */
    public ViewEng() {
        scanner = new Scanner(System.in);
    }

    /**
     * Выводит всех студентов в списке.
     * 
     * @param students Список студентов
     */
    public void printAllStudent(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    /**
     * Просит пользователя ввести команду.
     * 
     * @return Введенная пользователем команда
     */
    public String prompt() {
        System.out.print("Enter the command from the list [LIST, EXIT, DELETE, READ, CREATE, UPDATE]: ");
        return scanner.nextLine().trim();
    }

    /**
     * Получает идентификатор студента для удаления.
     * 
     * @return Идентификатор студента для удаления
     */
    public Long getStudentIdToDelete() {
        System.out.print("Enter the ID of the student to delete: ");
        return scanner.nextLong();
    }

    /**
     * Отображает список студентов.
     * 
     * @param students Список студентов
     */
    public void displayStudents(List<Student> students) {
        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    /**
     * Запрашивает у пользователя информацию о новом студенте.
     * 
     * @return Объект студента, введенный пользователем
     */
    public Student readStudent() {
        System.out.print("Enter the student's first name: ");
        String firstName = scanner.next();
        System.out.print("Enter the student's last name: ");
        String lastName = scanner.next();
        System.out.print("Enter the student's age: ");
        int age = scanner.nextInt();
        System.out.print("Enter the student's ID: ");
        long id = scanner.nextLong();
        return new Student(firstName, lastName, age, id);
    }

    /**
     * Получает идентификатор студента для обновления.
     * 
     * @return Идентификатор студента для обновления
     */
    public Long getStudentIdToUpdate() {
        System.out.print("Enter the ID of the student to update: ");
        return scanner.nextLong();
    }
}
