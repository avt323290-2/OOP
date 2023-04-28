package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroups;
    private int streamNumber;

    public StudentStream(int streamNumber) {
        this.studentGroups = new ArrayList<>();
        this.streamNumber = streamNumber;
    }

    public StudentStream(int i, List<StudentGroup> groups) {
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        this.studentGroups.add(studentGroup);
    }

    public void removeStudentGroup(StudentGroup studentGroup) {
        this.studentGroups.remove(studentGroup);
    }

    public int getStreamNumber() {
        return this.streamNumber;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }
}
