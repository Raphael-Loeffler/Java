import java.util.HashMap;
import java.util.Scanner;

public class DummyData {
    public static void main(String[] args) {
        HashMap<String, String> telephoneBook = new HashMap<>();
        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");
        System.out.println(telephoneBook.size());
        System.out.print("Enter function: ");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        if (in.equals("extend")) {
            for (int i = 0; i < 10; i++) {
                telephoneBook.put("" + i, "example");
            }
        }
        System.out.println(telephoneBook.size());
    }
}
