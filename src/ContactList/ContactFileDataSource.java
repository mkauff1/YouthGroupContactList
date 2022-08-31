package ContactList;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ContactFileDataSource implements IContactDataSource {
    private final Path path;

    public ContactFileDataSource(Path path) {
        this.path = path;
    }

    @Override
    public void Save(List<Person> list) throws IOException {
        String personStr = new Gson().toJson(list);
        Files.write(this.path, Stream.of(personStr).toList());
    }

    @Override
    public Person[] Load() throws IOException {
        if (!Files.exists(this.path)){
            Files.createFile(this.path);
        }
        var list = new Gson().fromJson(Files.readString(this.path), Person[].class);

        if (list == null)
            list = new Person[0];

        return list;
    }
}
