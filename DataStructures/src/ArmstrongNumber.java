import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(isArmstrongNumber(input));
    }
    public static String isArmstrongNumber(String input) {
        String[] digits = input.split("");
        double raised = 0;
        for (int i = 0; i < digits.length; i++) {
            raised += Math.pow(Integer.parseInt(digits[i]), digits.length);
        }
        int inputToInt;
        inputToInt = Integer.parseInt(input);
        if (inputToInt == raised) {
            return input + " is an Armstrong number";
        } else {
            return input + " ist not an Armstrong number";
        }
    }
}
