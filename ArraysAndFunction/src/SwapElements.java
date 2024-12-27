import java.util.Arrays;
import java.util.Comparator;

public class SwapElements {
    public static void main(String[] args) {
        // - Create an array variable named `orders`
        //   with the following content: `["first", "second", "third"]`
        // - Swap the first and the third element of `orders` programmatically
        // - Print the swapped array into the console:
        //   [third, second, first]
        String[] orders = {"first", "second", "third"};
        // Arrays.sort(orders, 0, 3, Comparator.comparing(String::toString).reversed());
        String formerOrder0 = orders[0];
        orders[0] = orders[2];
        orders[2] = formerOrder0;
        // Print the list in a different way.
        System.out.print("[");
        for (int i = 0; i < orders.length; i++) {
            System.out.print(orders[i]);
            if (i != orders.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}