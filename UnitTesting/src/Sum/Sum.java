package Sum;

import java.util.ArrayList;

public class Sum {
    public int sum(ArrayList<Integer> input) {
        int sum = 0;
        for (Integer i: input) {
            sum += i;
        }
        return sum;
    }
}
