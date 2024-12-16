import java.util.Scanner;
public class SubStr {
    public static void main(String[] args) {
        // Create a function that takes two strings as a parameter
        // Returns the starting index where
        // the second one is starting in the first one
        // Returns `-1` if the second string is not in the first one
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter text: ");
        String firstText = scanner.nextLine();
        System.out.print("Please enter word to find: ");
        String secondText = scanner.nextLine();

        int result = subStr(firstText, secondText);
        System.out.println(result);
    }

    public static int subStr(String input, String q) {
        return input.indexOf(q);
    }
}