package ContactList;

import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private Byte grade;
    private String schoolAttending;

    private List<String> phoneNumbers;


    public Person (){
    }

    public Person(String firstName, String lastName, Byte grade, String schoolAttending, List<String> phoneNumbers){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.schoolAttending = schoolAttending;

        this.phoneNumbers = phoneNumbers;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Byte getGrade() {
        return grade;
    }

    public void setGrade(Byte grade) {
        this.grade = grade;
    }

    public String getSchoolAttending() {
        return schoolAttending;
    }

    public void setSchoolAttending(String schoolAttending) {
        this.schoolAttending = schoolAttending;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                ", schoolAttending='" + schoolAttending + '\'' +
                ", phoneNumber='" + phoneNumbers + '\'' +
                '}';
    }
}
