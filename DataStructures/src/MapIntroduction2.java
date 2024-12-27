import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> simpleMap = new HashMap<>();
        simpleMap.put("978-1-60309-452-8", "A Letter to Jo");
        simpleMap.put("978-1-60309-459-7", "Lupus");
        simpleMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        simpleMap.put("978-1-60309-461-0", "The Lab");
        for (String key : simpleMap.keySet()) {
            System.out.println(simpleMap.get(key) + " (ISBN: " + key + ")");
        }
        simpleMap.remove("978-1-60309-444-3");
        simpleMap.remove("978-1-60309-461-0", "The Lab");
        simpleMap.put("978-1-60309-450-4", "They Called Us Enemy");
        simpleMap.put("978-1-60309-453-5", "Why Did We Trust Him?");
        System.out.println(simpleMap.containsKey("478-0-61159-424-8"));
        System.out.println(simpleMap.get("978-1-60309-453-5"));
    }
}
