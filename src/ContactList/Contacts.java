package ContactList;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Contacts {
    private final IContactDataSource db;
    private final ArrayList<Person> contacts;

    public Contacts(IContactDataSource db) throws IOException {
        this.db = db;
        this.contacts = new ArrayList<Person>(Arrays.asList(db.Load()));
    }

    public void add(Person contact){
        this.contacts.add(contact);
    }

    public void delete(Person contact){
        this.contacts.remove(contact);
    }

    public List<Person> searchByName(String firstName, String lastName){
        List<Person> results = new ArrayList<>();
        for(var current : this.contacts){
            if (Objects.equals(current.getFirstName(), firstName) && Objects.equals(current.getLastName(), lastName)){
                results.add(current);
            }
        }
        return results;
    }

    public void save() throws IOException {
        this.db.Save(this.contacts);
    }
}
