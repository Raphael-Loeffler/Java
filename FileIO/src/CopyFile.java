import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CopyFile {
    // Write a `copy` function that copies the contents of a file into another file.
    // The function should take two filenames (strings) as parameters:
    //  - path and name of the source file
    //  - path and name of the target file
    // It should return a boolean that shows whether the copy was successful or not.
    public static void main(String[] args) {
        Path copyFileSource = Paths.get("files/copyFileSource");
        Path copyFileTarget = Paths.get("files/copyFileTarget");
        List<String> content = Arrays.asList("1", "2", "3", "4", "5");
        try {
            Files.write(copyFileSource, content);
            Files.write(copyFileTarget, content);
        } catch (IOException e) {
            System.out.println("ahh");
        }
        copy("files/copyFileSource", "files/copyFileTarget");
    }
    public static void copy(String source, String target) {
        try {
            List<String> sourceAsList = Files.readAllLines(Paths.get(source));
            List<String> targetAsList = Files.readAllLines(Paths.get(target));
            targetAsList.addAll(sourceAsList);
            Files.write(Paths.get(target), targetAsList);
            System.out.println(true);
        } catch (IOException e) {
            System.out.println("Could not read Files or get Path");
            System.out.println(false);
        }
    }
}