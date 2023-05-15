package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import Controller.iGetModel;

/**
 * Класс FileRepo для передачи данных о студентах из файла, имплементирует интерфейс iGetModel.
 */
public class FileRepo implements iGetModel {
    private String fileName;
    private List<Student> students;

    /**
     * Конструктор класса, принимает параметр.
     *
     * @param fileName Имя файла
     */
    public FileRepo(String fileName) {
        this.fileName = fileName;
        this.students = new ArrayList<>();
        try {
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file, true);
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Метод добавления студента в список
    public void addStudent(Student student) {
        this.students.add(student);
    }

    // Метод удаления студента по заданному id
    public int deleteStudentById(Long id) {
        int i = -1;
        for (Student pers : students) {
            if (pers.getStudentID() == id) {
                i = students.indexOf(pers);
                break;
            }
        }
        if (i != -1) {
            students.remove(i);
        }
        return i;
    }

    // Метод чтения всех студентов из файла
    public void readAllStudentsFromFile() {
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            // Пока есть строки
            while (line != null) {
                String[] param = line.split(" ");
                Student pers = new Student(param[0], param[1], Integer.parseInt(param[2]), Long.parseLong(param[3]));
                students.add(pers);
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Метод для сохранения студентов в файл
    public void saveAllStudentToFile() {
        try {
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file, true);
            for (Student pers : students) {
                fw.write(pers.getFirstName() + " " + pers.getSecondName() + " " + pers.getAge() + " "
                        + pers.getStudentID());
                fw.append('\n');
            }
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Перегрузка метода вывода всех студентов
    @Override
    public List<Student> getAllStudents() {
        if (students.isEmpty()) {
            readAllStudentsFromFile();
        }
        return students;
    }

    @Override
    public boolean createStudent(Student newStudent) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Unimplemented method 'createStudent'");
    }

    @Override
    public void updateStudentById(Long updateId, Student updatedStudent) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Unimplemented method 'updateStudentById'");
    }

    @Override
    public List<Student> getAllStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllStudent'");
    }
}
