package ContactList;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Path YouthGroupPath = Paths.get("data", "package.json");
        var db = new ContactFileDataSource(YouthGroupPath);

        Contacts myList = new Contacts(db);
        myList.add(new Student("Addison", "Moe", Arrays.asList("3137348375"), new Date(1996, Calendar.SEPTEMBER,8), '8'));
        myList.save();
    }
}
