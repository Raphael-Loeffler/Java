import java.util.ArrayList;
import java.util.HashMap;

public class ClassDataStructures {
    public static void main(String[] args) {
        // Primitive data types
        int x = 5; // 4 bytes
        System.out.println("Primitive integer");
        System.out.println(x);
        Integer y = 5; // 16 bytes
        System.out.println("Non-primitive integer");
        System.out.println(y);

        // Array
        int[] numbers = new int[4];
        int[] birthday = {12, 9, 1984};
        String[] nameSurname = {"Michalis", "Karatsioris"};

        // List: index <---> data       []
        // Names of employees, groceries
        ArrayList<String> firstNamesEmployees = new ArrayList<>();
        System.out.println(firstNamesEmployees);
        firstNamesEmployees.add("Simon");
        System.out.println(firstNamesEmployees);
        firstNamesEmployees.add("Raphael");
        firstNamesEmployees.add("Michalis");
        firstNamesEmployees.add("Alejandra");
        firstNamesEmployees.add("Vit");
        System.out.println(firstNamesEmployees);
        firstNamesEmployees.add(2, "Tina");
        System.out.println(firstNamesEmployees);
        firstNamesEmployees.remove(3);
        System.out.println(firstNamesEmployees);
        System.out.println("Size of list: " + firstNamesEmployees.size());
        firstNamesEmployees.clear();
        System.out.println(firstNamesEmployees);
        System.out.println("Size of list: " + firstNamesEmployees.size());

        // Map: key-value pairs        {}
        // Name and phone/birthday/address
        /*
        {
            Michalis:   1234
            Simon:      495476
            Raphael:    3495865
        }
         */
        HashMap<String, Integer> phones = new HashMap<String, Integer>();
        System.out.println(phones);
        phones.put("Michalis", 1234);
        phones.put("Raphael", 374485);
        phones.put("Simon", 29345);
        System.out.println(phones);

        // Example comparing two different data structures
        HashMap<String, Integer> groceries = new HashMap<>();
        groceries.put("Bananas", 10);
        groceries.put("Chicken", 100);

        ArrayList<String> groceriesNames = new ArrayList<>();
        groceriesNames.add(0, "Bananas");
        groceriesNames.add(1, "Chicken");
        ArrayList<Integer> groceriesQuantities = new ArrayList<>();
        groceriesQuantities.add(0, 10);
        groceriesQuantities.add(1, 100);

    }
}