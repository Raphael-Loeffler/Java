import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Lottery {
    public static void main(String[] args) {
        // Create a method which determines the 5 most common lottery numbers
        // in lottery.csv and returns them in an array.
        // If there were multiple numbers with the same occurrences then return any of them.
        // Return an empty array if the specified file does not exist
        // The lottery.csv format is as follows:
        // <year>;<week>;<date>;[<no_of_winners>;<winnings> 4x];[drawn number 5x]
        // i.e. the year; week number; date of the lottery draw;
        // the number of winners and their winnings matching (5, 4, 3 or 2 numbers);
        // the 5 drawn numbers
        // Change the path of the lottery.csv source file to the path
        // where you saved it on your computer.
        // You can find the source file in a link next to this exercise.
        // If you pass "lottery.csv" to your function, the result should be
        // either [3, 29, 75, 66, 77] or [3, 29, 75, 66, 86].
        int i1 = 5;
        int i2 = 4;
        System.out.println(Arrays.toString(getMostFrequentNumbers("files/lottery.csv")));
    }
    public static int[] getMostFrequentNumbers(String filename) {
        try {
            List<String> content = Files.readAllLines(Paths.get(filename));
            String[] split;
            HashMap<String, Integer> numberStringPlusCount = new HashMap<>();
            for (String line: content) {
                split = line.split(";");
                for (int i = 11; i < 16; i++) {
                    if (numberStringPlusCount.containsKey(split[i])) {
                        numberStringPlusCount.replace(split[i], numberStringPlusCount.get(split[i]) + 1);
                    } else {
                        numberStringPlusCount.put(split[i], 1);
                    }
                }
            }
            int[] out = new int[5];
            int[] valuesOut = new int[5];
            for (int i = 0; i < 5; i++) {
                out[i] = Integer.parseInt(calculateHighest(numberStringPlusCount));
                valuesOut[i] = numberStringPlusCount.get(calculateHighest(numberStringPlusCount));
                numberStringPlusCount.remove(calculateHighest(numberStringPlusCount));
            }
            return out;
        } catch (IOException e) {
            return new int[0];
        }
    }
    public static String calculateHighest(HashMap<String, Integer> map) {
        String out = "";
        int highest = 0;
        for (String key: map.keySet()) {
            if (map.get(key) > highest) {
                highest = map.get(key);
                out = key;
            }
        }
        return out;
    }
}