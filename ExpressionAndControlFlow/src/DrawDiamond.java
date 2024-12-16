import java.util.Scanner;
public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a diamond of the specified height
        //
        // Example:
        //
        // Please enter the diamond height: 4
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // Note: the height of the diamond is taken from its base
        // (where it is the widest) to the top.
        // The total number of lines produced is 2*height-1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the diamond height: ");
        int diamondHeight = Integer.parseInt(scanner.nextLine());
        drawDiamond(diamondHeight);
    }

    public static void drawDiamond(int height){
        // Write your code to draw the diamond here
        int upHeight = (height + 1) / 2;
        int downHeight =  height / 2;
        upPyramid(upHeight);
        downPyramid(downHeight);
    }
    public static void upPyramid(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * (i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void downPyramid(int height) {
        for (int i = height; i > 0; i--) {
            for (int j = height + 2; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 2 * (i - 1); k + 1 > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
