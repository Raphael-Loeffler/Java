import java.util.ArrayList;

public class ListIntroduction1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("William");
        System.out.println(names.isEmpty());
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2));
        for(String s : names) {
            System.out.println(s);
        }
        for(int i = 0; i < names.size(); i++) {
            System.out.println(i + 1 + ". " + names.get(i));
        }
        names.remove(1);
        for(int i = 0; i < names.size(); i++) {
            System.out.println(names.get(names.size() - i - 1));
        }
        names.removeAll(names);
        System.out.println(names.size());
    }
}
