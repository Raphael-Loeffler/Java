public class Swap {
    public static void main(String[] args) {
        // Swap the values of the variables without changing the following 2 lines of code
        int a = 123;
        int b = 526;

        // Write your code here:
        /*
        int formerA = a;
        a = b;
        b = formerA;
        */
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);
    }
}
