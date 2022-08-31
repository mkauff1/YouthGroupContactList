package ContactList;

import java.io.IOException;
import java.util.List;

public interface IContactDataSource {
    void Save(List<Person> list) throws IOException;
    Person[] Load() throws IOException;
}

