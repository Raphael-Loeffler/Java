public class Power {
    public static void main(String[] args) {
        // Given base and n that are both 1 or more, write a recursive method (no loops)
        // which returns the value of base to the n-th power, so powerN(3, 2) is 9 (3 squared).
        System.out.println(powerN(5, 2));
    }
    public static int powerN(int base, int exponent) {
        if (exponent < 1) {
            return 1;
        } else if (exponent < 2) {
            return base;
        } else {
            return base * powerN(base, exponent - 1);
        }
    }
}
