public class StringsAgainAndAgain {
    public static void main(String[] args) {
        // Given a string, write a recursive (no loops) method which returns a new
        // string with all adjacent chars separated by an `*`. Please note that there
        // should be no trailing `*` at the end of the returned string. For example,
        // the string `word` should be changed to `w*o*r*d`.
        System.out.println(addStars("abcdefghijklmnopqrstuvwxyz"));
    }
    public static String addStars(String word) {
        if (word.length() < 2) {
            return word;
        } else {
            return word.charAt(0) + "*" + addStars(word.substring(1));
        }
    }
}
