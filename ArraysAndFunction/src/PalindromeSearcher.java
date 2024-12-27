import java.util.ArrayList;
import java.util.List;

public class PalindromeSearcher {
    public static void main(String[] args) {
        System.out.println(palindromeSearcher("dog goat dad duck doodle never"));
        System.out.println(palindromeSearcher("apple"));
        System.out.println(palindromeSearcher("racecar"));
        System.out.println(palindromeSearcher(""));
    }
    public static boolean isPalindrome(String input) {
        return input.substring(0, input.length() / 2).contentEquals(new StringBuilder(input.substring(input.length() - input.length() / 2)).reverse());
    }
    public static List<String> palindromeSearcher(String input) {
        List<String> palindromes = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 3 + i; j <= input.length(); j++) {
                if (isPalindrome(input.substring(i, j))) {
                    palindromes.add(input.substring(i, j));
                }
            }
        }
        return palindromes;
    }
}
