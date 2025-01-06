import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LicencePlate {
    public static void main(String[] args) {
        licencePlate();
    }
    public static void licencePlate() {
        Scanner scanner = new Scanner(System.in);
        try {
            String input = scanner.nextLine();
            List<String> wordsFromFile = Files.readAllLines(Paths.get("files/words.txt"));
            List<String> words = new ArrayList<>();
            for (String word: wordsFromFile) {
                words.addAll(Arrays.asList(word.split(" ")));
            }
            System.out.println(words);
        } catch (IOException e) {
            System.out.println("IOException:");
            System.out.println(e);
        }
    }
    public static boolean isVowel(String character) {
        return character.equals("a") || character.equals("e") || character.equals("i") || character.equals("o") || character.equals("u");
    }
}
