package ContactList;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Path YouthGroupPath = Paths.get("data", "package.json");

        Contacts myList = new Contacts(YouthGroupPath);
        myList.add(new Student("Addison", "McNally", Arrays.asList("3136712701"), new Date(1991, Calendar.SEPTEMBER,26), '8'));
        myList.save();
    }
}
