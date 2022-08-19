package ContactList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Path newPath = FileHelper.tryMakeFileDirectory();

        Path YouthGroupPath = Paths.get("data", "package.json");
        List<String> groceryList = Files.readAllLines(YouthGroupPath);
    }
}
