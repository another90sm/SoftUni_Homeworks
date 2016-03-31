
public class Course implements java.io.Serializable {

    public String name;
    public int studentsNumber;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentsNumber() {
        return this.studentsNumber;
    }

    public void setStudentsNumber(int studentsNumber) {
        this.studentsNumber = studentsNumber;
    }

    public Course() {
        this.name = "Unnamed";
        this.studentsNumber = 0;
    }

    public Course(String name, int studentsNumber) {
        this.name = name;
        System.out.println(name);
        this.studentsNumber = studentsNumber;
        System.out.println(studentsNumber);
    }
}
