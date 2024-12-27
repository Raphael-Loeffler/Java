import java.util.ArrayList;
import java.util.Collections;

public class ShoppingList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "eggs", "milk", "fish", "apples", "bread", "chicken");
        System.out.println(toYesNo(list.contains("milk")));
        System.out.println(toYesNo(list.contains("bananas")));
    }
    public static String toYesNo(boolean in) {
        String out = "no";
        if (in == true) {
            out = "yes";
        }
        return out;
    }
}
