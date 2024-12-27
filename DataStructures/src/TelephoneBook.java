import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> telephoneBook = new HashMap<>();
        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");
        System.out.println(telephoneBook.get("John K. Miller"));
        System.out.println(getKey(telephoneBook, "307-687-2982"));
        System.out.println(toYesNo(telephoneBook.containsKey("Chris E. Myers")));
    }
    public static String getKey(HashMap input, String value) {
        HashMap<String, String> map = new HashMap<>();
        map.putAll(input);
        String output = "";
        for (String key : map.keySet()) {
            if (map.get(key) == "307-687-2982") {
                output = key;
            }
        }
        return output;
    }
    public static String toYesNo(boolean in) {
        String out = "no";
        if (in == true) {
            out = "yes";
        }
        return out;
    }
}
