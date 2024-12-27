import java.lang.StringBuilder;
public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        /*
         Add "My todo:" to the beginning of the `todoText'
         Add " - Download games" to the end of the `todoText`
         Add " - Diablo" to the end of the `todoText` applying an extra 4 space indention

         Expected output:

         My todo:
          - Buy milk
          - Download games
              - Diablo
        */
        StringBuilder t = new StringBuilder(todoText);
        t.insert(0,"My todo:\n");
        t.insert(21," - Download games\n");
        t.insert(39,"     - Diablo\n");
        System.out.println(t);
    }
}