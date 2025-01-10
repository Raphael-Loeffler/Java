public class Strings {
    public static void main(String[] args) {
        // Given a string, write a recursive (no loops) method which returns
        // a new string with the lowercase 'x' chars changed to 'y' chars.
        System.out.println(xToY("xXasdgxxx xgtaYysxxX"));
    }
    public static String xToY(String word) {
        if (word.isEmpty()) {
            return "";
        } else {
            return word.substring(0, 1).replace("x", "y") + xToY(word.substring(1));
        }
    }
}
