import java.time.LocalDate;

public class Teacher extends Person {

    private int roomNumber;

    public Teacher(String name, String firstName, LocalDate dateOfBirth, String email) {
        super(name, firstName, dateOfBirth, email);
    }
}
