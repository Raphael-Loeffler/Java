import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class EncodedLines {
    public static void main(String[] args) {
        // Create a method called `decryptEncoded` that takes a filename string
        // as a parameter and decrypts the file's content.
        // Decryption is the process reversing an encryption, i.e. the process
        // which converts encrypted data into its original form.
        // If the file can't be opened it should print this message: "File not found"
        // The (decrypted) result should be saved in the "output.txt" file (don't change the path).
        // Change the path of the encoded-lines.txt source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
        // You have to figure out the encryption logic by yourself.
        decryptEncoded("files/decryptShiftedChars.txt");
    }
    public static void decryptEncoded(String filename) {
        try {
            List<String> content = Files.readAllLines(Paths.get(filename));
            for (int i = 0; i < content.size(); i++) {
                String[] characters = content.get(i).split("");
                if (!content.get(i).isEmpty()) {
                    for (int j = 0; j < characters.length; j++) {
                        if (characters[j].hashCode() != 32) {
                            int hashValue = characters[j].hashCode() - 1;
                            characters[j] = Character.toString((char) hashValue);
                        }
                    }
                }
                content.set(i, "");
                for (String character : characters) {
                    content.set(i, content.get(i) + character);
                }
            }
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Could not find the file");
        }
    }
}