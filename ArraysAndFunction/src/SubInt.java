import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubInt {
    public static void main(String[] args) {
        // Create a function that takes a number (a digit) and an array of integers
        // as parameters and returns the indices of the integers in the array
        // which contain the given digit or returns an empty array
        // (if no number in the array contains the given digit)

        // Examples:
        System.out.println(Arrays.toString(findMatchingIndexes(1, new int[] { 1, 11, 34, 52, 61})));
        // should print: `[0, 1, 4]`
        System.out.println(Arrays.toString(findMatchingIndexes(9, new int[] { 1, 11, 34, 52, 61 })));
        // should print: '[]'

        // Note: We are using Arrays.toString() function to print the returned array
        // You could just as well iterate over the array and print its items one by one
    }
    public static int[] findMatchingIndexes(int number, int[] arr) {
        List<Integer> winningIndices = new ArrayList<>();
        String stringForOnePartOfArray;
        char[] digitsInChar;
        int[] digits;
        for (int i = 0; i < arr.length; i++) {
            stringForOnePartOfArray = String.valueOf(arr[i]);
            digitsInChar = stringForOnePartOfArray.toCharArray();
            digits = new int[digitsInChar.length];
            for (int j = 0; j < digitsInChar.length; j++) {
                digits[j] = Integer.parseInt(String.valueOf(digitsInChar[j]));
            }
            for (int k = 0; k < digits.length; k++) {
                if (digits[k] == number) {
                    if (!winningIndices.contains(i)) {
                        winningIndices.add(i);
                    }
                }
            }
        }
        int[] indices = new int[winningIndices.size()];
        for (int i = 0; i < winningIndices.size(); i++) {
            indices[i] = winningIndices.get(i);
        }
        return indices;
    }
}