import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        //
        // Example:
        //
        // Please enter your name: John Doe
        // Hello, John Doe!
        //
        System.out.println("Please enter your name: ");
        String nameEnter = scanner.next();
        System.out.println("Hello, "+ nameEnter + "!");
    }
}