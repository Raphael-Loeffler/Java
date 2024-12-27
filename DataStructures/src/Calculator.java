import java.util.*;

public class Calculator {
    public static void main(String... args) {

        // Create a simple calculator application which reads parameters from the prompt and prints the result back.
        // The calculator should support the following operators: +, -, *, /, %
        // The format of the input expressions must be: {operator} {operand} {operand}
        // Input examples:
        //    "+ 3 3" (the result will be 6)
        //    "* 4 4" (the result will be 16)
        //    "/ 4 3" (the result will be 1)
        //
        // In the division (/) case, the result should be a whole number, e.g. 20 / 8 = 2, 10 / 3 = 3, etc.

        // To make it work use the `Scanner` class to get input from the user. Create a method named `calculate()` and
        // pass the input as a parameter into it. The method should return a result of the calculation as an `Integer`.
        //
        // The process should work like this:
        // - Start the program
        // - Print: "Please type in the expression:" using System.out.println
        //   (Wait for the user input)
        // - After receiving the input print the result number to the prompt
        // - Exit the program


        // Input & Output
        //
        // Please type in the expression:
        // + 10 3
        // 13

        Scanner scanner = new Scanner(System.in);
        boolean b = false;
        while (!b) {
            System.out.print("Please type in the expression: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                b = true;
            } else {
                System.out.println(calculate(input));
            }
        }
    }
    public static int calculate(String i) {
        String[] o = i.split(" ");
        int out;
        int n1 = Integer.parseInt(o[1]);
        int n2 = Integer.parseInt(o[2]);
        if (o[0].equals("+")) {
            out = n1 + n2;
        } else if (o[0].equals("-")) {
            out = n1 - n2;
        } else if (o[0].equals("*")) {
            out = n1 * n2;
        } else {
            out = n1 / n2;
        }
        return out;
    }
}