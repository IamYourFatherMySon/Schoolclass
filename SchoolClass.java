import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class SchoolClass {

    Scanner sc = new Scanner(System.in);
    DateTimeFormatter f = DateTimeFormatter.ofPattern("d/MM/yyyy");
    private ArrayList<Student> studentList = new ArrayList<>();
    private Student classRepresentative;


    private Teacher mainTeacher;
    private String dateOfBirth;
    private Student s;

    public void addStudent(){

        System.out.println("Vorname:");
        String firstName = sc.next();

        System.out.println("Nachname:");
        String name = sc.next();

        System.out.println("Geburtsdatum:");
        String date = sc.next();
        LocalDate dateOfBirth = LocalDate.parse(date, f);

        System.out.println("E-Mail:");
        String email = sc.next();

        System.out.println("Studentennumber:");
        int studentNumber = sc.nextInt();

        s = new Student(firstName, name, dateOfBirth, email, studentNumber);
        studentList.add(s);
    }


    public void ShowClassroom(){
        for(Student s : studentList){
            System.out.println(s);
        }
    }


    public Student getClassRepresentative(){
        return classRepresentative;
    }


    public Teacher getMainTeacher() {
        return mainTeacher;
    }

}
