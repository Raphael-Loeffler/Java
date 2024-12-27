import java.util.*;

public class IsInList {
    public static void main(String... args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16);

        // Write a method called `checkNumbers` (with a list of numbers as a parameter), which will return `true`
        // if the list `numbers` contains all the following elements: 4, 8, 12, 16; `false` otherwise.

        // The output should be "true"
        System.out.println(checkNumbers(numbers));

        // Bonus: write a method called `checkAllNumbers` with 2 lists as parameters, which will return `true`
        // if the first list contains all the elements of the second list; `false` otherwise.
        List<Integer> haystack = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21);
        List<Integer> needles = Arrays.asList(1, 3, 13);

        // The output should be "true"
        System.out.println(checkAllNumbers(haystack, needles));
    }
    public static boolean checkNumbers(List<Integer> inList) {
        if (inList.contains(4) && inList.contains(8) && inList.contains(12) && inList.contains(16)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean checkAllNumbers(List<Integer> h, List<Integer> n) {
        int c = 0; //counts
        for (Integer i : n) {
            if (h.contains(i)) {
                c++;
            }
        }
        if (c == n.size()) { //if counter c is equal to n, every element in n is in h
            return true;
        } else {
            return false;
        }
    }
}