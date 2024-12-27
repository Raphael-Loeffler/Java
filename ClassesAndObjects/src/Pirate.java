public class Pirate {
    public int intoxication;
    public boolean dead;
    private boolean hasParrot;
    public Pirate() {
        this.intoxication = 0;
        this.dead = false;
        this.hasParrot = false;
    }
    public void drinkSomeRum() {
        if (this.dead == false) {
            this.intoxication++;
        } else {
            System.out.println("he's dead");
        }
    }
    public void howsItGoingMate() {
        if (this.dead == false) {
            if (this.intoxication < 4) {
                System.out.println("Pour me anudder!");
            } else {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                this.intoxication = 0;
            }
        } else {
            System.out.println("he's dead");
        }
    }
    public void brawlPirate(Pirate enemy) {
        if (this.dead == false) {
            int ran = (int) (Math.random() * 3 + 1);
            if (ran == 1) {
                this.dead = true;
            } else if (ran == 2){
                enemy.dead = true;
            } else {
                this.intoxication = 0;
            }
        } else {
            System.out.println("he's dead");
        }
    }
    public void die() {
        if (this.dead == false) {
            this.dead = true;
            if (this.hasParrot) {
                System.out.println("Squawk! Farewell to the Cap'n! Gone with the tide, he is!");
            }
        } else {
            System.out.println("He's already dead, Mates!");
        }
    }
    public void getParrot() {
        if (!this.hasParrot) {
            this.hasParrot = true;
            System.out.println("Squawk!");
        } else {
            System.out.println("I'm already here folks! Squawk!");
        }
    }
}
