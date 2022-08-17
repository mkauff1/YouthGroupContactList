package ContactList;

import com.google.gson.Gson;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class FileHelper {

    public static Path tryMakeFileDirectory(){
        String directory = "data";
        String filename = "package.json";

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);

        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }
            if (!Files.exists(dataFile)){
                Files.createFile(dataFile);
            }
            return dataFile
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public static void tryWriteFile(Path filePath, List<Person> personsToWrite){
        try {
            String personStr = new Gson().toJson(personsToWrite);
            Files.write(filePath, Stream.of(personStr).toList());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static List<Person> tryReadFile(Path filePath) {
        try {
            return Stream
                    .of(new Gson().fromJson(Files.readAllLines(filePath).get(0), Person[].class))
                    .toList();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
