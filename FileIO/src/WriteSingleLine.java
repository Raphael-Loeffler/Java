import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a program in the `main` method that is able to manipulate a file
        // by writing your name into it as a single line.
        // The file should be named "my-file.txt".
        // In case the program is unable to write the file,
        // it should print the following error message: "Unable to write file: my-file.txt".
        Path filePath = Paths.get("files/my-file.txt");
        List<String> content = Arrays.asList("1", "2", "3");
        try {
            Files.write(filePath, content);

        } catch (IOException e) {
            System.out.println("Could not write the file");
        } catch (Exception e) {
            System.out.println("Unknown Error");
        }

        try {
            List<String> list = Files.readAllLines(filePath);
            list.add("Raphael");
            Files.write(filePath, list);
            System.out.println(Files.readAllLines(filePath));
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        } catch (Exception e) {
            System.out.println("Other Exception");
        }
    }
}