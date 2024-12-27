public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements of `numbers` programmatically
        // - Print the elements of the reversed `numbers`:
        //   [7, 6, 5, 4, 3]
        int[] numbers = {3, 4, 5, 6, 7, 8, 9};
        //reverse(numbers);
        //printArray(numbers);
        printArray(reverse2(numbers));
        /*
        int[] test = {1, 2, 3, 4};
        reverse(test);
        printArray(test);
        */
    }
    static int[] reverse2(int[] input) {
        //a = 3
        //b = 4
        // a = formerA (formerA = 3, a = 3, b = 4)
        // a = b (formerA = 3, a = 4, b = 4)
        // b = formerA (formerA = 3, a = 4, b = 3)
        for (int i = 0; i < input.length / 2; i++) {
            int former;
            former = input[i];
            input[i] = input[input.length - i - 1];
            input[input.length - i - 1] = former;
        }
        return input;
    }
    static int[] reverse(int[] input) {
        /*
        a = 3
        b = 4
        1. a = a + b (3 + 4 = *7*)
        2. b = a - b (7 - 4 = *3*)
        3. a = a - b (7 - 3 = *4*)
        4. (print)
         */
        for(int i = 0; i < (int) input.length / 2; i++) {
            input[i] += input[input.length - 1 - i];
        }

        if (input.length % 2 == 0) {
            for (int i = input.length - 1; i > (int) input.length / 2 - 1; i--) {
                input[i] = input[input.length - i - 1] - input[i];
            }
        } else {
            for (int i = input.length - 1; i > (int) input.length / 2; i--) {
                input[i] = input[input.length - i - 1] - input[i];
            }
        }

        for (int i = 0; i < (int) input.length / 2; i++) {
            input[i] -= input[input.length - i - 1];
        }
        return input;
    }
    static void printArray(int[] input) {
        System.out.print('[');
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            if (i != input.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(']');
    }
}