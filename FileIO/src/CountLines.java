import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function called countLines() that takes a filename as string as a parameter
        // and returns the number of lines the file contains.
        // It should return zero if it can't open the file
        // and should not raise any error.
        Path filePath = Paths.get("files/text.txt");
        List<String> content = Arrays.asList("1", "2", "3", "4", "5", "6", "7");
        try {
            Files.write(filePath, content);
        } catch (IOException e) {
            System.out.println("Could not write the file");
        }
        System.out.println(countLines("files/text.txt"));
    }
    public static int countLines(String filename) {
        try {
            Path filePath = Paths.get(filename);
            List<String> list = Files.readAllLines(filePath);
            return list.size();
        } catch (IOException e) {
            return 0;
        }
    }
}
