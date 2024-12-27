import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {
        HashMap<Integer, String> simpleMap = new HashMap<>();
        System.out.println(simpleMap.isEmpty());
        simpleMap.put(97, "a");
        simpleMap.put(98, "b");
        simpleMap.put(99, "c");
        simpleMap.put(65, "A");
        simpleMap.put(66, "B");
        simpleMap.put(67, "C");
        System.out.println(simpleMap.keySet());
        System.out.println(simpleMap.values());
        simpleMap.put(68, "D");
        System.out.println(simpleMap.size());
        System.out.println(simpleMap.get(99));
        simpleMap.remove(97);
        System.out.println(simpleMap.containsKey(100));
        simpleMap.clear();
        System.out.println(simpleMap.size());
    }
}
