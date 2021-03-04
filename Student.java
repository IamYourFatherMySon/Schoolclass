import java.time.LocalDate;

public class Student extends Person {

    private String schoolClass;

    public int getStudentNumber() {
        return studentNumber;
    }

    private int studentNumber;


    public Student(String name, String firstName, LocalDate dateOfBirth, String email, int studentNumber) {
        super(name, firstName, dateOfBirth, email);
        this.studentNumber = studentNumber;
    }

    public String toString(){
        return "Studenten:\nName: " + getName() + getFirstName() + "\nGeburtsdatum: " + getDateOfBirth() + "\nE-Mail: " + getEmail()+"\nStudentennummer: "+getStudentNumber()+"\n";
    }

}
