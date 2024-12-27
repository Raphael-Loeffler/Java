import java.util.HashMap;

public class ProductDatabase1 {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();
        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);
        System.out.println(products.get("Fish"));
        int mostExpensiveValue = 0;
        String mostExpensive = "";
        float average = 0;
        int howManyPricedBelow300 = 0;
        boolean anythingForExactly125 = false;
        String cheapestProduct = "";
        int cheapestProductValue = 1000000000;
        for (String key : products.keySet()) {
            if(products.get(key) > mostExpensiveValue) {
                mostExpensiveValue = products.get(key);
                mostExpensive = key;
            }
            if (products.get(key) < 300) {
                howManyPricedBelow300++;
            }
            if (products.get(key) == 125) {
                anythingForExactly125 = true;
            }
            if (products.get(key) < cheapestProductValue) {
                cheapestProductValue = products.get(key);
                cheapestProduct = key;
            }
            average += products.get(key);
        }
        average /= products.size();
        System.out.println(mostExpensive);
        System.out.println(average);
        System.out.println(howManyPricedBelow300);
        System.out.println(toYesNo(anythingForExactly125));
        System.out.println(cheapestProduct);
    }
    public static String toYesNo(boolean in) {
        String out = "no";
        if (in) {
            out = "yes";
        }
        return out;
    }
}
