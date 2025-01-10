import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumFinder {
    public static void main(String[] args) {
        // Write a function which returns the largest element of an array using recursion.
        System.out.println(maxFinder(new int[] {4, -5, 1, -3, 37, -935, 2, 14, 4, 128, 2}));
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
