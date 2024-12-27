public class Palindrome {
    public static void main(String[] args) {
        System.out.println(build(""));
    }
    public static String build(String input) {
        StringBuilder sb = new StringBuilder(input);
        return input + sb.reverse();
    }
}
