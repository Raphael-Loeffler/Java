import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a square of the specified size
        //
        // Example:
        //
        // Please enter the square size: 6
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide the size of the square: ");
        int squareSize = Integer.parseInt(scanner.nextLine());
        draw(squareSize);
    }

    public static void draw(int size){
        for (int i = 0; i < size; i++) {
            System.out.print("%");
        }
        System.out.println();
        for (int i = 0; i < size - 2; i++) {
            for (int j = 0; j < size; j++) {
                if (j == 0 || j == size - 1) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            System.out.print("%");
        }
        System.out.println();
    }
}
