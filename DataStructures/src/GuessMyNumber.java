import java.util.Map;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        int input = -1;
        int lives = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have 5 lives! Please enter the min and max for the guess range:");
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        double number = Math.random() * (max - min + 1) + min;
        number = (int) number;
        System.out.println("Guess a number between " + min + " and " + max);
        while (input != number && lives > 0) {
            input = scanner.nextInt();
            if (input < number) {
                lives--;
                System.out.println("Too low. You have " + lives + " lives left!");
            } else if (input > number) {
                lives--;
                System.out.println("To high. You have " + lives + " lives left!");
            }
        }
        if (lives > 0) {
            System.out.println("Congratulations. You've won!");
        } else {
            System.out.println("I'm sorry. You've run out of lives!");
        }
    }
}
