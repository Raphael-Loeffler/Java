public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above
        System.out.print("Remaining seconds for today: ");
        System.out.println((int) 86400 - (currentSeconds + 60 * currentMinutes + 3600 * currentHours));
    }
}