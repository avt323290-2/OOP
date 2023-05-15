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
 * Класс ViewEng для представления данных на английском языке, реализует интерфейс iGetView
 */
public class ViewEng implements iGetView {
    private Scanner scanner;

    public ViewEng() {
        scanner = new Scanner(System.in);
    }

    public void printAllStudent(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public String prompt() {
        System.out.print("Enter the command from the list [LIST, EXIT, DELETE, READ, CREATE, UPDATE]: ");
        return scanner.nextLine().trim();
    }

    public Long getStudentIdToDelete() {
        System.out.print("Enter the ID of the student to delete: ");
        return scanner.nextLong();
    }

    public void displayStudents(List<Student> students) {
        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

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

    public Long getStudentIdToUpdate() {
        System.out.print("Enter the ID of the student to update: ");
        return scanner.nextLong();
    }
}