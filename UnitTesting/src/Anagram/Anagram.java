package Anagram;

public class Anagram {
    public static boolean isAnagram(String word1, String word2) {
        String[] spitted1 = word1.split("");
        String ignore1 = "";
        for (int i = 0; i < spitted1.length; i++) {
            if (spitted1[i].toLowerCase().hashCode() > 96 && spitted1[i].toLowerCase().hashCode() < 123) {
                ignore1 += spitted1[i];
            }
        }
        ignore1 = ignore1.toLowerCase();
        String[] spitted2 = word2.split("");
        String ignore2 = "";
        for (int i = 0; i < spitted2.length; i++) {
            if (spitted2[i].toLowerCase().hashCode() > 96 && spitted2[i].toLowerCase().hashCode() < 123) {
                ignore2 += spitted2[i];
            }
        }
        ignore2 = ignore2.toLowerCase();
        char[] final1 = ignore1.toCharArray();
        char[] final2 = ignore2.toCharArray();

        boolean contains = true;
        boolean containsChar = false;
        if (final1.length == final2.length) {
            for (int i = 0; i < final1.length; i++) {
                for (int j = 0; j < final2.length; j++) {
                    if (final1[i] == final2[j]) {
                        containsChar = true;
                    }
                }
                if (containsChar == false) {
                    contains = false;
                }
                containsChar = false;
            }
            return contains;
        } else {
            return false;
        }

    }
}
