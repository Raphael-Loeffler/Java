import java.util.*;

public class QuoteSwap {
    public static void main(String... args) {

        List<String> list = Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand.");
        List<String> l2 = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20");
        // Accidentally I messed up this quote from Richard Feynman
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // To do this: create a method called "swapQuote()"
        // it should return a sentence formed from the words separated by a single space

        // Expected output: "What I cannot create, I do not understand."
        System.out.println(swapQuote(list, 3, 6)); //--> upgraded function so you can define the words to switch
        System.out.println(swapQuote(l2, 1,1));
    }
    public static String swapQuote(List<String> inList, int w1, int w2) {
        String out = "";
        w1--;
        w2--;
        for (int i = 0; i < inList.size(); i++) {
            if (inList.get(i) == inList.get(w1)) {
                String temp = inList.get(i);
                inList.set(i,inList.get(w2));
                inList.set(w2, temp);
            }
            out += inList.get(i);
            if (i < inList.size() - 1) {
                out += " ";
            }
        }
        return out;
    }
}