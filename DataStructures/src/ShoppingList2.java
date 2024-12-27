import java.util.HashMap;

public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap<String, Float> prices = new HashMap<>();
        HashMap<String, Integer> bob = new HashMap<>();
        HashMap<String, Integer> alice = new HashMap<>();
        prices.put("Milk", 1.07F);
        prices.put("Rice", 1.59F);
        prices.put("Eggs", 3.14F);
        prices.put("Cheese", 12.60F);
        prices.put("Chicken Breasts", 9.40F);
        prices.put("Apples", 2.31F);
        prices.put("Tomato", 2.58F);
        prices.put("Potato", 1.75F);
        prices.put("Onion", 1.10F);
        bob.put("Milk", 3);
        bob.put("Rice", 2);
        bob.put("Eggs", 2);
        bob.put("Cheese", 1);
        bob.put("Chicken Breasts", 4);
        bob.put("Apples", 1);
        bob.put("Tomato", 2);
        bob.put("Potato", 1);
        alice.put("Rice", 1);
        alice.put("Eggs", 5);
        alice.put("Chicken Breasts", 2);
        alice.put("Apples", 1);
        alice.put("Tomato", 10);

        float bobSum = 0F;
        for (String key : bob.keySet()) {
            bobSum += bob.get(key) * prices.get(key);
        }
        System.out.println(bobSum);

        float aliceSum = 0F;
        for (String key : alice.keySet()) {
            aliceSum += alice.get(key) * prices.get(key);
        }
        System.out.println(aliceSum);


        if (alice.containsKey("Rice")) {
            if ((bob.containsKey("Rice"))) {
                if (bob.get("Rice") > alice.get("Rice")) {
                    System.out.println("Bob");
                } else {
                    System.out.println("Alice");
                }
            } else {
                System.out.println("Alice");
            }
        } else if (bob.containsKey("Rice")) {
            System.out.println("Bob");
        } else {
            System.out.println("no one");
        }

        if (alice.containsKey("Potato")) {
            if ((bob.containsKey("Potato"))) {
                if (bob.get("Potato") > alice.get("Potato")) {
                    System.out.println("Bob");
                } else {
                    System.out.println("Alice");
                }
            } else {
                System.out.println("Alice");
            }
        } else if (bob.containsKey("Potato")) {
            System.out.println("Bob");
        } else {
            System.out.println("no one");
        }

        if (alice.containsKey("Ham")) {
            if ((bob.containsKey("Ham"))) {
                if (bob.get("Ham") > alice.get("Ham")) {
                    System.out.println("Bob");
                } else {
                    System.out.println("Alice");
                }
            } else {
                System.out.println("Alice");
            }
        } else if (bob.containsKey("Ham")) {
            System.out.println("Bob");
        } else {
            System.out.println("no one");
        }

        if (alice.containsKey("Apples")) {
            if ((bob.containsKey("Apples"))) {
                if (bob.get("Apples") > alice.get("Apples")) {
                    System.out.println("Bob");
                } if (bob.get("Apples") == alice.get("Apples")) {
                    System.out.println("no one");
                } else {
                    System.out.println("Alice");
                }
            } else {
                System.out.println("Alice");
            }
        } else if (bob.containsKey("Apples")) {
            System.out.println("Bob");
        } else {
            System.out.println("no one");
        }

        if (bob.size() > alice.size()) {
            System.out.println("Bob");
        } else {
            System.out.println("Elise");
        }

        float bobItems = 0F;
        for (String key : bob.keySet()) {
            bobSum += bob.get(key);
        }
        float aliceItems = 0F;
        for (String key : alice.keySet()) {
            aliceSum += alice.get(key);
        }
        if (bobItems > aliceItems) {
            System.out.println("Bob");
        } else {
            System.out.println("Alice");
        }
    }
}