import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program which prompts the user for a double value
        // specifying a distance in miles, converts that value
        // to kilometers and prints it
        //
        // Example:
        //
        // Please enter a distance in miles: 1.8
        // The distance in km: 2.88
        //
        Scanner mileInput = new Scanner(System.in);
        System.out.print("Please enter a distance in miles: ");
        double mileNumber = mileInput.nextDouble();
        System.out.print("The distance in km: ");
        System.out.println(mileNumber*1.609344);
    }
}