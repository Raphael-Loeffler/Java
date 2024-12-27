import java.util.HashMap;

public class MostFrequentPhrase {
    public static void main(String[] args) {
        System.out.println(mostFrequentPhrase("But then they were married (she felt awful about being pregnant before but\n" +
                "Harry had been talking about marriage for a while and anyway laughed when\n" +
                "she told him in early February about missing her period and said Great she\n" +
                "was terribly frightened and he said Great and lifted her put his arms around\n" +
                "under her bottom and lifted her like you would a child he could be so\n" +
                "wonderful when you didn’t expect it in a way it seemed important that you\n" +
                "didn’t expect it there was so much nice in him she couldn’t explain to\n" +
                "anybody she had been so frightened about being pregnant and he made her\n" +
                "be proud) they were married after her missing her second period in March\n" +
                "and she was still little clumsy dark-complected Janice Springer and her\n" +
                "husband was a conceited lunk who wasn’t good for anything in the world Daddy\n" +
                "said and the feeling of being alone would melt a little with a little drink."));
        System.out.println(mostFrequentPhrase("a (a) a, b b c"));
        System.out.println(mostFrequentPhrase("a a b b"));
    }
    public static String mostFrequentPhrase(String input) {
        input = input.toLowerCase();
        String[] splittedWithSpecialCaracters = input.split(" ");
        String[] finalWords = new String[splittedWithSpecialCaracters.length];
        char[] splittedWord;
        for (int i = 0; i < splittedWithSpecialCaracters.length; i++) {
            splittedWord = splittedWithSpecialCaracters[i].toCharArray();
            finalWords[i] = "";
            for (int j = 0; j < splittedWord.length; j++) {
                if ((int) splittedWord[j] > 96 && (int) splittedWord[j] < 123) {
                    finalWords[i] += splittedWord[j];
                }
            }
        }
        HashMap<String, Integer> frequencyOfWords = new HashMap<>();
        for (int i = 0; i < finalWords.length; i++) {
            if (frequencyOfWords.containsKey(finalWords[i])) {
                frequencyOfWords.replace(finalWords[i], frequencyOfWords.get(finalWords[i]) + 1);
            } else {
                frequencyOfWords.put(finalWords[i], 1);
            }
        }
        int mostOften = 0;
        for (Integer i: frequencyOfWords.values()) {
            if (i > mostOften) {
                mostOften = i;
            }
        }
        input = "";
        for (String s: frequencyOfWords.keySet()) {
            if (frequencyOfWords.get(s).equals(mostOften)) {
                input += s + " ";
            }
        }
        return input;
    }
}
