import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program prompts the user for 5 integers in a row,
        // then it prints their sum and their average:
        //
        // Please enter a number: 3
        // Please enter a number: 7
        // Please enter a number: 1
        // Please enter a number: 6
        // Please enter a number: 5
        // Sum: 22, Average: 4.4
        //
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberInputs[] = new int[5];
        for(int i = 0;i<numberInputs.length;i++) {
            System.out.print("Please enter a number: ");
            numberInputs[i] = scanner.nextInt();
            sum += numberInputs[i];
        }
        System.out.println("Sum: " + sum + ", Average: " + (float) sum / numberInputs.length);
    }
}