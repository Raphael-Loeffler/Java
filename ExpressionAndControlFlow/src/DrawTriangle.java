import java.util.Scanner;
public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a triangle of the specified height
        //
        // Example:
        //
        // Please enter the triangle height: 4
        // *
        // **
        // ***
        // ****
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the triangle height: ");
        int input = scanner.nextInt();
        draw(input);
    }

    public static void draw(int height){
        // Write your code to draw the triangle here
        for(int i = 0; i<height; i++) {
            for(int iDraw = 0; iDraw < i+1; iDraw++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}