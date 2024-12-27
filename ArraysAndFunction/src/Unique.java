import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unique {
    public static void main(String[] args) {
        // Create a function that takes an array of numbers as a parameter
        // and returns an array of integers where every integer is unique
        // (occurs only once)

        // Example
        System.out.println(Arrays.toString(findUniqueItems(new int[] { 1, 11, 34, 11, 52, 61, 1, 34 })));
        // should print: `[1, 11, 34, 52, 61]`
    }
    public static int[] findUniqueItems(int[] inputArray) {
        List<Integer> uniqueOnes = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (!uniqueOnes.contains(inputArray[i])) {
                uniqueOnes.add(inputArray[i]);
            }
        }
        int[] out = new int[uniqueOnes.size()];
        for (int i = 0; i < uniqueOnes.size(); i++) {
            out[i] = uniqueOnes.get(i);
        }
        return out;
    }

}