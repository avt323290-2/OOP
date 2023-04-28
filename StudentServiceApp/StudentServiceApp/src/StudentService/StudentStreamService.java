package StudentService;

import StudentDomen.StudentGroup;
import StudentDomen.StudentStream;

import java.util.Iterator;

public class StudentStreamService {
    public void printGroups(StudentStream studentStream) {
        for (StudentGroup group : studentStream) {
            System.out.println(group.getGroupName() + ":");
            group.sort();
            group.printStudents();
            System.out.println();
        }
    }
}
