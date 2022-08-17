package ContactList;

import java.util.Date;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private List<String> phoneNumbers;
    private Date birthday;

    private String instagram;
    private String snapChat;
    private String tikTok;

    public Person (){
    }

    public Person(String firstName, String lastName, List<String> phoneNumbers, Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumbers = phoneNumbers;
        this.birthday = birthday;
    }

    public Person(String firstName, String lastName, List<String> phoneNumbers, Date birthday, String instagram, String snapChat, String tikTok){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumbers = phoneNumbers;
        this.birthday = birthday;
        this.instagram = instagram;
        this.snapChat = snapChat;
        this.tikTok = tikTok;
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getSnapChat() {
        return snapChat;
    }

    public void setSnapChat(String snapChat) {
        this.snapChat = snapChat;
    }

    public String getTikTok() {
        return tikTok;
    }

    public void setTikTok(String tikTok) {
        this.tikTok = tikTok;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", phoneNumbers=" + phoneNumbers +
                ", instagram='" + instagram + '\'' +
                ", snapChat='" + snapChat + '\'' +
                ", tikTok='" + tikTok + '\'' +
                '}';
    }
}
