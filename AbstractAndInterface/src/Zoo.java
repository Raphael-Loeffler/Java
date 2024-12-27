import Animal.*;

public class Zoo {
    public static void main(String[] args) {
        Reptile reptile = new Reptile("Crocodile", 'm', 90, 31, "rough");
        Bird bird = new Bird("Parrot", 'm', 4, 5, "large");
        Mammal mammal = new Mammal("Monkey", 'm', 75, 62, "Chill");
        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
    }
}
