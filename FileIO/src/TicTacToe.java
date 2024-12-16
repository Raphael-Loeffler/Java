import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TicTacToe {
    public static void main(String[] args) {
        // Write a method `calculateTicTacResult` which takes a filename as a parameter,
        // and returns "X", "O" or "Draw" based on the input file's content
        // The file contains a finished Tic-Tac-Toe match
        // See the examples in draw.txt, win-x.txt, win-o.txt

        System.out.println(calculateTicTacResult("files/win-o.txt"));
        // Should print "O"

        System.out.println(calculateTicTacResult("files/win-x.txt"));
        // Should print "X"

        System.out.println(calculateTicTacResult("files/draw.txt"));
        // Should print "Draw"
    }
    public static String calculateTicTacResult(String fileName) {
        try {
            List<String> content = Files.readAllLines(Paths.get(fileName));
            String[] firstLine = content.get(0).split("");
            String[] secondLine = content.get(1).split("");
            String[] thirdLine = content.get(2).split("");
            return "-1";
        } catch (Exception e) {
            return "Help me";
        }
    }
}