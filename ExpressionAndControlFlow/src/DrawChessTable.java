import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input and
        // then draws a chess table of the specified size
        //
        // Example:
        //
        // Please enter the chess table size: 8
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        drawChessLinear(3); // Linear in time, linear in space
        drawChessSquare(3);
        /*              Size    Size   Difference
                         3 -----> 9         3
        drawLinear       3" ----> 9"        3¹
        drawSquare       9" ----> 81"       3²
         */
    }
    public static void drawChessLinear(int size){
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                System.out.println("% % % %");
            } else {
                System.out.println(" % % % %");
            }
        }
    }
    public static void drawChessSquare(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}