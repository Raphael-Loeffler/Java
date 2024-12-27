import java.util.ArrayList;
import java.util.List;

public class Ship {
    private List<Pirate> crew = new ArrayList<>();
    public Pirate captain;
    public void fillShip() {
        this.captain = new Pirate();
        for (int i = 0; i < (int) (Math.random() * 11303 + 1); i++) {
            this.crew.add(new Pirate());
        }
    }
    public void represent() {
        if (this.captain.dead) {
            System.out.println("The Cap'n struck his last sail - he's gone to the deep!");
        } else {
            System.out.println("The Cap'n is alive!");
        }
        System.out.println("There are " + this.crew.size() + " salty dogs aboard!");
    }
    public boolean battle(Ship enemy) {
        int ownAlive = 0;
        int enemyAlive = 0;
        for (int i = 0; i < this.crew.size(); i++) {
            if (!this.crew.get(i).dead) {
                ownAlive++;
            }
        }
        for (int i = 0; i < enemy.crew.size(); i++) {
            if (!enemy.crew.get(i).dead) {
                enemyAlive++;
            }
        }
        if (ownAlive - this.captain.intoxication > enemyAlive - enemy.captain.intoxication) {
            enemy.lost();
            this.party();
            return true;
        } else if (ownAlive - this.captain.intoxication < enemyAlive - enemy.captain.intoxication) {
            this.lost();
            enemy.party();
            return false;
        } else {
            enemy.lost();
            this.party();
            return true;
        }
    }
    public void lost() {
        for (int i = 0; i < (int) (Math.random() * this.crew.size()); i++) {
            this.crew.remove(i);
            i--;
        }
    }
    public void party() {
        for (int j = 0; j < (int) (Math.random() * 20); j++) {
            this.captain.drinkSomeRum();
        }
        for (int i = 0; i < crew.size(); i++) {
            for (int j = 0; j < (int) (Math.random() * 10); j++) {
                this.crew.get(i).drinkSomeRum();
            }
        }
    }
}
