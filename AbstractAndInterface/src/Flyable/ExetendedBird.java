package Flyable;

import Animal.Bird;

public class ExetendedBird  extends Bird implements Flyable {
    public ExetendedBird(String name, char gender, int weight, int age, String featherSize) {
        super(name, gender, weight, age, featherSize);
    }

    @Override
    public void land() {
        System.out.println("Bird is landing...");
    }

    @Override
    public void fly() {
        System.out.println(this.name + " is flying with " + this.getFeatherSize() + " feathers");
    }

    @Override
    public void takeOff() {
        System.out.println(this.name + " is taking off with a weight of " + this.weight + " kg");
    }
}
