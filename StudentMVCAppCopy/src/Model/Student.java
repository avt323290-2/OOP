package Model;
/**
 * Класс Student представляет сущность студента и наследуется от класса User. Реализует интерфейс Comparable для сравнения студентов.
 */
public class Student extends User implements Comparable<Student>{
    private long studentID;
    /**
     * Конструктор класса Student.
     * 
     * @param firstName Имя студента
     * @param secondName Фамилия студента
     * @param age Возраст студента
     * @param studentID Идентификатор студента
     */
    
    public Student(String firstName, String secondName, int age, long studentID) {
        super(firstName, secondName, age);
        this.studentID = studentID;
    }


    public long getStudentID() {
        return studentID;
    }
    /**
     * Устанавливает идентификатор студента.
     * 
     * @param studentID Идентификатор студента
     */
    
    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" 
                
                +"firstName=" +super.getFirstName()
                +", secondName=" +super.getSecondName()
                +", age=" +super.getAge()+
                ", studentID=" + studentID +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        
        System.out.println(super.getFirstName()+" - "+o.getFirstName());
         if(super.getAge()==o.getAge())
         {
            if(this.studentID==o.studentID)
            {
                return 0;
            }
            if(this.studentID<o.studentID)
            {
                return -1;
            }
            return 1;
         } 
         if(super.getAge()<o.getAge())
         {
            return -1;
         }   
         return 1;
    }


    public Object getId() {
        return null;
    }
}