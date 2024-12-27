//  Create the usual class wrapper (Factorial) and main method on your own

// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input
//
// - Example: calculateFactorial(5) = 1 * 2 * 3 * 4 * 5 = 120
public class Factorial {
    static int calculateFactiorial(int input) {
        int factorial = 1;
        for (int i = 1; i < input + 1; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactiorial(8));
    }
}