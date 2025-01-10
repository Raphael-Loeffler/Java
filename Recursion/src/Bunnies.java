public class Bunnies {
    public static void main(String[] args) {
        // We have a number of bunnies and each bunny has two big floppy ears. Write
        // a recursive method (no loops or multiplication) which takes the number of
        // bunnies as its sole parameter and returns the total number of ears
        // the bunnies have. The method should be able to handle invalid input
        // (e.g. negative numbers)
        System.out.println(bunny(4));
    }
    public static int bunny(int number) {
        if (number < 1) {
            return 0;
        } else {
            return 2 + bunny(number - 1);
        }
    }
}
