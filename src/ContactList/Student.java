package ContactList;

import java.util.Date;
import java.util.List;

public class Student extends Person {
    private Character grade;
    private String schoolAttending;

    public Student() {
    }

    public Student(String firstName, String lastName, List<String> phoneNumbers, Date birthday, Character grade) {
        super(firstName, lastName, phoneNumbers, birthday);
        this.grade = grade;
    }
}
