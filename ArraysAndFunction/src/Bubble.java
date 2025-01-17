import java.util.Arrays;
public class Bubble {
    public static void main(String[] args) {
        // Create a function that takes an array of numbers as parameter
        // and returns an array where the elements are sorted in ascending numerical
        // order
        // When you are done, add a second boolean parameter to the function
        // If it is `true` sort the array descending, otherwise ascending

        // Example:
        System.out.println(Arrays.toString(bubble(new int[] { 34, 12, 24, 9, 5 })));
        // should print [5, 9, 12, 24, 34]
        System.out.println(Arrays.toString(advancedBubble(new int[] { 34, 12, 24, 9, 5 }, true)));
        // should print [34, 24, 12, 9, 5]
    }
    public static int[] bubble(int[] input) {
        Arrays.sort(input);
        return input;
    }
    public static int[] advancedBubble(int[] input, boolean reverse) {
        Arrays.sort(input);
        int temp;
        if (reverse) {
            for (int i = 0; i < input.length / 2; i++) {
                temp = input[i];
                input[i] = input[input.length - i - 1];
                input[input.length - i - 1] = temp;
            }
        }
        return input;
    }
}