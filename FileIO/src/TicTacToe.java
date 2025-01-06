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
            String[] top = content.getFirst().split("");
            String[] mid = content.get(1).split("");
            String[] bot = content.getLast().split("");
            if (content.getFirst().equals("XXX") || content.get(1).equals("XXX") || content.getLast().equals("XXX") || (top[0].equals("X")&&mid[0].equals("X")&bot[0].equals("X")) || (top[1].equals("X")&&mid[1].equals("X")&&bot[1].equals("X")) || (top[2].equals("X")&&mid[2].equals("X")&&bot[2].equals("X")) || (top[0].equals("X")&&mid[1].equals("X")&&bot[2].equals("X")) || (top[2].equals("X")&&mid[1].equals("X")&&bot[0].equals("X"))) {
                return "X";
            } else if (content.getFirst().equals("OOO") || content.get(1).equals("OOO") || content.getLast().equals("OOO") || (top[0].equals("O")&&mid[0].equals("O")&bot[0].equals("O")) || (top[1].equals("O")&&mid[1].equals("O")&&bot[1].equals("O")) || (top[2].equals("O")&&mid[2].equals("O")&&bot[2].equals("O")) || (top[0].equals("O")&&mid[1].equals("O")&&bot[2].equals("O")) || (top[2].equals("O")&&mid[1].equals("O")&&bot[0].equals("O"))) {
                return "O";
            } else {
                return "Draw";
            }
        } catch (Exception e) {
            return "Exception";
        }
    }
}