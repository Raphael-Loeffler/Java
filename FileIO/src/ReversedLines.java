import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        // Create a method called `decryptReversed` that takes a filename string
        // as a parameter and decrypts the file's content.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should print this message: "File not found"
        // The (decrypted) result should be saved in the "output.txt" file (don't change the path).
        // Change the path of the reversed-lines.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
        Path filePath = Paths.get("files/reversed-lines.txt");
        decryptReversed("files/reversed-lines.txt");
    }
    public static void decryptReversed(String filename) {
        try {
            List<String> content = Files.readAllLines(Paths.get(filename));
            StringBuilder sb;
            for (int i = 0; i < content.size(); i++) {
                sb =  new StringBuilder(content.get(i));
                content.set(i, sb.reverse().toString());
            }
            Path out = Paths.get("files/out.txt");
            Files.write(out, content);
        } catch (IOException e) {
            System.out.println("Can't read file");
        }
    }
}