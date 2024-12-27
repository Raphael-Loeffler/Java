import java.util.ArrayList;
public class FormatList {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("The Great Gatsby");
        movies.add("The Lord of the Rings");
        movies.add("To Kill a Mockingbird");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(i + 1 + "." + movies.get(i));
        }
    }
}
