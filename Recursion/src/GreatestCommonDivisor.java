public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // Write a recursive method which returns the greatest common divisor (GCD)
        // of two numbers. The method should be able to handle negative numbers!
        System.out.println(gcd(56, 98));
    }
    public static int gcd(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        } else {
            return gcd(number2, number1 % number2);
        }
    }
}
