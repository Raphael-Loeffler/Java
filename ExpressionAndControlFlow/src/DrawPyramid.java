import java.util.Scanner;
public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a pyramid of the specified height
        //
        // Example:
        //
        // Please enter the pyramid height: 4
        //    *
        //   ***
        //  *****
        // *******
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the pyramid height: ");
        int input = scanner.nextInt();
        draw(input);
    }

    public static void draw(int height){
        // Write your code to draw the pyramid here
        for (int row = 0; row < height; row++) {
            for (int collumn = 0; collumn < height * 2; collumn++) {
                if ((collumn >= height - row) && (collumn <= height + row)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}