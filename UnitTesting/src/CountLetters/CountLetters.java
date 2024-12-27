package CountLetters;

import java.util.HashMap;

public class CountLetters {
    public HashMap<String, Integer> countLetters(String input) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] split = input.split("");
        for (int i = 0; i < split.length; i++) {
            if (map.containsKey(split[i])) {
                map.replace(split[i], map.get(split[i]) + 1);
            } else {
                map.put(split[i], 1);
            }
        }
        return map;
    }
}
