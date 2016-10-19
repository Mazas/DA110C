package tadasIvanauskas;

/**
 * Created by hamekas on 10/11/16 @HKR ivanauskas15@gmail.com
 */
public class Student extends Person {
    private char grade;
    Months month = new Months();
    Student(){
        this(' ');
    }

    public Student(char grade) {
        this.grade = grade;
    }

    public Student(String name, char grade) {
        super(name);
        this.grade = grade;
    }

    public Student(String name, int age, char grade) {
        super(name, age);
        this.grade = grade;
    }

    public Student(String name, int age, String motto, char grade) {
        super(name, age, motto);
        this.grade = grade;
    }
    public Student(String name, int age, String motto, char grade, int month) {
        super(name, age, motto);
        this.grade = grade;
        setMonth(month);
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student: " +super.toString()+
                " grade: " + grade+" "+
                getMonth();
    }
    public void setMonth(int month){
        this.month.setMonth(month);
    }
    public Months.Month getMonth(){
        return this.month.getMonth();
    }
}
