import java.util.*;

public class HeWillNever {
    public static void main(String... args){

        String output = "";
        int[] notSoCrypticMessage = {1, 12, 1, 2, 11, 1, 7, 11, 1, 49, 1, 3, 11, 1, 50, 11};

        Map<Integer, String> map = new HashMap<>();

        map.put(7, "run around and desert you");
        map.put(50, "tell a lie and hurt you");
        map.put(49, "make you cry, ");
        map.put(2, "let you down");
        map.put(12, "give you up, ");
        map.put(1, "Never gonna ");
        map.put(11, "\n");
        map.put(3, "say goodbye");

        for (int i : notSoCrypticMessage) {
            output += map.get(i);
        }

        // Things are a bit messed up here
        // Your job is to decode the `notSoCrypticMessage` by using the hashmap as a lookup table
        // Assemble the fragments into the `output` variable

        // Expected output:
        // Never gonna give you up, Never gonna let you down
        // Never gonna run around and desert you
        // Never gonna make you cry, Never gonna say goodbye
        // Never gonna tell a lie and hurt you
        //
        System.out.println(output);
    }
}