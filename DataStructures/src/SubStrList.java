public class SubStrList {

    public static void main(String[] args) {

        //  Create a method that takes a string (`needle`) and a list of strings (`haystack`) as parameters
        //  and returns the index of the list element which contains the `needle` as a substring.
        //  You only need to find the first occurrence and return that index. The search should be case-sensitive!
        //  Return `-1` if none of the items in the list contain the `needle`.

        // Example

        String[] haystack = new String[] {"this", "is", "what", "I'm", "searching"};

        // Expected output: 4
        System.out.println(findIndex("ching", haystack));

        // Expected output: -1
        System.out.println(findIndex("not", haystack));
    }
    public static int findIndex(String needle, String[] haystack) {
        int out = -1;
        int counter = 0;
        for (String s : haystack) {
            if (s.contains(needle)) {
                out = counter;
            }
            counter++;
        }
        return out;
    }
}