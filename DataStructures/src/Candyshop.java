import java.util.*;

public class Candyshop {
    public static void main(String... args) {

        ArrayList<Object> sweets = new ArrayList<>();
        sweets.add("Cupcake");
        sweets.add(2);
        sweets.add("Brownie");
        sweets.add(false);
        /*
        sweets.add(true);
        sweets.add("Cake");
        sweets.add(100);
        sweets.add(2);
        sweets.add(false);
        sweets.add("2");
        */

        // Accidentally we added "2" and "false" to the sweets list
        // Your task is to change the "2" to "Croissant" and the "false" to "Ice cream"
        // No, don't just edit the lines above! :)
        // Create a method called "repairSweetList()" which takes the list as a parameter
        // and returns a list with the items "2" and "false" replaced (with "Croissant" and "Ice cream")

        // Expected output: [Cupcake, Croissant, Brownie, Ice cream]
        System.out.println(repairSweetList(sweets));
    }
    public static List<Object> repairSweetList(List<Object> in) {
        for (Object o : in) {
            if (o.equals(2)) {
                in.set(in.indexOf(o), "Croissant");
            } else if (o.equals(false)) {
                in.set(in.indexOf(o), "Ice cream");
            }
        }
        return in;
    }
}