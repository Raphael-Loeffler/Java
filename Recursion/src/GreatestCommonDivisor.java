public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // Write a recursive method which returns the greatest common divisor (GCD)
        // of two numbers. The method should be able to handle negative numbers!
        //TODO: Fix Code!
        System.out.println(gcd(14, 24));
    }
    public static int gcd(int number1, int number2) {
        if (number1 < 6 && number2 < 6) {
            return number1 * number2;
        } else {
            return gcd(number1 / (2 + (number1 % 2)), number2 / (2 + (number2 % 2)));
        }
    }
}
