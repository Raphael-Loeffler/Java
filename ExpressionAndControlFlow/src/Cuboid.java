public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid.
        //
        // Set the 3 sides to 10.4, 13.5, 8.2 and your program should
        // produce the following output:
        //
        // Surface Area: 672.76
        // Volume: 1151.28
        double length = 10.4;
        double width = 13.5;
        double height = 8.2;
        System.out.println("Surface Area: " + 2 * ((length * width) + (length * height) + (width * height)));
        System.out.println("Volume: " + length*width*height);
    }
}