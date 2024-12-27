package Animal;

public class Animal {
    int hunger;
    int thirst;
    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
    }
    public void drink() {
        this.thirst--;
    }
    public void eat() {
        this.hunger--;
    }
    public void play() {
        this.thirst++;
        this.hunger++;
    }
}
