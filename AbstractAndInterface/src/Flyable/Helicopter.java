package Flyable;

public class Helicopter extends Vehicle implements Flyable {
    public Helicopter() {
        this.type = "Helicopter";
    }

    @Override
    public void land() {
        System.out.println("Helicopter landing...");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter flies width " + this.speed + " km/h");
    }

    @Override
    public void takeOff() {
        System.out.println("Helicopter can take off straight in the air");
    }
}
