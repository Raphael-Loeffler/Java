package Fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static int fibonacci(int index) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= index; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }
        return list.get(index);
    }
}
