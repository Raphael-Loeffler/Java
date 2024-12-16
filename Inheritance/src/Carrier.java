import java.util.ArrayList;
import java.util.List;

public class Carrier {
    private List<Aircraft> aircrafts = new ArrayList<>();
    private int storedAmmo;
    private int healthPoints;
    public Carrier(int storedAmmo, int healthPoint) {
        this.storedAmmo = storedAmmo;
        this.healthPoints = healthPoint;
    }
    public void add(Aircraft aircraft) {
        this.aircrafts.add(aircraft);
    }
    public void fill() {
        int takenAmmo = 0;
        int index = 0;
        while (takenAmmo <= this.storedAmmo && index != this.aircrafts.size()) {
            if (this.aircrafts.get(index).isPriority()) {
                takenAmmo += this.aircrafts.get(index).maxAmmo - this.aircrafts.get(index).ammo;
                this.aircrafts.get(index).refill(this.aircrafts.get(index).maxAmmo - this.aircrafts.get(index).ammo);
            }
            index++;
        }
        index = 0;
        while (takenAmmo <= this.storedAmmo && index != this.aircrafts.size()) {
            if (!this.aircrafts.get(index).isPriority()) {
                takenAmmo += this.aircrafts.get(index).maxAmmo - this.aircrafts.get(index).ammo;
                this.aircrafts.get(index).refill(this.aircrafts.get(index).maxAmmo - this.aircrafts.get(index).ammo);
            }
            index++;
        }
        this.storedAmmo -= takenAmmo;
    }
    public void fight(Carrier carrier) {
        carrier.healthPoints -= this.totalDamage();
    }
    public int totalDamage() {
        int out = 0;
        for (Aircraft iterator: this.aircrafts) {
            out += iterator.ammo * iterator.baseDamage;
        }
        return out;
    }
    public void getStatus() {
        if (this.healthPoints > 0) {
            System.out.println("HP: " + this.healthPoints + ", Aircraft count: " + this.aircrafts.size() + ", Ammo Storage: " + this.storedAmmo + ", Total damage: " + this.totalDamage());
            System.out.println("Aircrafts:");
            for (Aircraft aircraft: aircrafts) {
                System.out.println(aircraft.status());
            }
        } else {
            System.out.println("It's dead Jim :(");
        }
    }
}
