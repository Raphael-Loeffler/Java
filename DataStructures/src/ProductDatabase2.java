import java.util.HashMap;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String, Integer> prices = new HashMap<>();
        prices.put("Eggs", 200);
        prices.put("Milk", 200);
        prices.put("Fish", 400);
        prices.put("Apples", 150);
        prices.put("Bead", 50);
        prices.put("Chicken", 550);
        for (String key : prices.keySet()) {
            if (prices.get(key) < 201) {
                System.out.println(key);
            }
        }
        for (String key : prices.keySet()) {
            if (prices.get(key) > 150) {
                System.out.println(key + ": " + prices.get(key));
            }
        }
    }
}
