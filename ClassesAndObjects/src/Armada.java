import java.util.ArrayList;
import java.util.List;

public class Armada {
    private List<Ship> ships = new ArrayList<>();
    public boolean war(Armada enemy) {
        int indexOwn = 0;
        int indexEnemy = 0;
        while (indexOwn < this.ships.size() && indexEnemy < enemy.ships.size()) {
            if (this.ships.get(indexOwn).battle(enemy.ships.get(indexEnemy))) {
                indexEnemy++;
            } else {
                indexOwn++;
            }
        }
        if (indexOwn < this.ships.size()) {
            return true;
        } else {
            return false;
        }
    }
    public void fillArmada() {
        for (int i = 0; i < (int) (Math.random() * 500); i++) {
            this.ships.add(new Ship());
        }
        for (Ship ship: this.ships) {
            ship.fillShip();
        }
    }
    public void status() {
        System.out.println("There are " + ships.size() + " Ships in the Armada.");
    }
}
