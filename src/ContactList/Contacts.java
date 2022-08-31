package ContactList;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Contacts {
    private final List<Person> contacts;
    private final Path fileName;

    public Contacts(Path fileName) throws IOException {
        if (!Files.exists(fileName)){
            Files.createFile(fileName);
        }

        this.contacts = Stream
                .of(new Gson().fromJson(Files.readAllLines(fileName).get(0), Person[].class))
                .toList();

        this.fileName = fileName;
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
        String personStr = new Gson().toJson(this.contacts);
        Files.write(this.fileName, Stream.of(personStr).toList());
    }
}
