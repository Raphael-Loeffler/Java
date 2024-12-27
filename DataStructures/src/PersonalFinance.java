import java.util.ArrayList;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> finance = new ArrayList<>();
        Collections.addAll(finance, 500, 1000, 1250, 175, 800, 120);

        int all = 0;
        for (int i = 0; i < finance.size(); i++) {
            all += finance.get(i);
        }
        System.out.println("How much did we spent: " + all);

        int greatest = 0;
        for (int i = 0; i < finance.size(); i++) {
            if (finance.get(i) > greatest) {
                greatest = finance.get(i);
            }
        }
        System.out.println("Which was our greatest expense: " + greatest);

        int cheapest = greatest; //makes it greater than everything in finance
        for (int i = 0; i < finance.size(); i++) {
            if (finance.get(i) < cheapest) {
                cheapest = finance.get(i);
            }
        }
        System.out.println("Which was our greatest spending: " + cheapest);

        float average = 0;
        for (int i = 0; i < finance.size(); i++) {
            average += finance.get(i);
        }
        average = average / finance.size();
        System.out.println("Average: " + average);
    }
}
