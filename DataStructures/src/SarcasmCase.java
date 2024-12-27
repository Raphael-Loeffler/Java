import java.util.Scanner;
public class SarcasmCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = scanner.nextLine();
        capitalise(input);
    }

    public static void capitalise(String inString) {
        String[] arr = inString.split("");
        for(int i = 0; i < arr.length; i += 2) {
            arr[i] = arr[i].toUpperCase();
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}