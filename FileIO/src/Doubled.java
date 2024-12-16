import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method called `decryptDoubled` that takes a filename string
        // as a parameter and decrypts the file's content.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should print this message: "File not found"
        // The (decrypted) result should be saved in the "output.txt" file (don't change the path).
        // Change the path of the duplicated-chars.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
        Path filePath = Paths.get("files/duplicated-chars.txt");
        decryptDoubled("files/duplicated-chars.txt");
    }
    public static void decryptDoubled(String filename) {
        try {
            List<String> content = Files.readAllLines(Paths.get(filename));
            for (int i = 0; i < content.size(); i++) {
                String[] characters = content.get(i).split("");
                String finishedLine = "";
                for (int j = 0; j < characters.length; j += 1) {
                    if (j % 2 == 0) {
                        finishedLine += characters[j];
                    }
                }
                content.set(i, finishedLine);
            }
            Files.write(Paths.get("files/outputDoubled.txt"), content);
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}