public class StringsAgain {
    public static void main(String[] args) {
        // Given a string, write a recursive (no loops) method which returns
        // a new string with the lowercase 'x' chars removed.
        System.out.println(xRemove("xXxxfdar dfga_ !xXtagyYyyxxx"));
    }
    public static String xRemove(String word) {
        if (word.isEmpty()) {
            return "";
        } else {
            return word.substring(0, 1).replace("x", "") + xRemove(word.substring(1));
        }
    }
}
