import java.util.ArrayList;
import java.util.List;

public class MaxSum {
    public static void main(String[] args) {
        // Create a function called `maxSum` which
        // expects an array of five integers as an input parameter and
        // returns the maximum values that can be
        // calculated by summing exactly four of the five integers.
        //
        // Examples
        //
        // [1 2 3 4 5] -> 14
        //
        // We can calculate the following sums using four of the five integers:
        //
        // 1 + 2 + 3 + 4 = 10
        // 1 + 2 + 3 + 5 = 11
        // 1 + 2 + 4 + 5 = 12
        // 1 + 3 + 4 + 5 = 13
        // 2 + 3 + 4 + 5 = 14
    }
    public static int maxSum(int[] arr) {
        if (arr.length == 4) {

        } else {
            //return maxFinder(arr) + maxSum();
        }
        return -1;
    }
    public static int maxFinder(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i: arr) {
            list.add(i);
        }
        if (list.size() == 1) {
            return list.getFirst();
        } else {
            if (list.get(0) > list.get(1)) {
                list.remove(1);
            } else {
                list.remove(0);
            }
            int[] out = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                out[i] = list.get(i);
            }
            return maxFinder(out);
        }
    }
}
