import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me the dimensions of the 2-D matrix: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];
        diagonalMatrix(matrix, size);
    }
    public static void diagonalMatrix(int[][] arr, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}