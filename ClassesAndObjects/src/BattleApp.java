public class BattleApp {
    public static void main(String[] args) {
        /*
        System.out.println();
        System.out.println();
        Pirate pirate1 = new Pirate();
        Pirate pirate2 = new Pirate();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.drinkSomeRum();
        pirate1.howsItGoingMate();
        pirate1.drinkSomeRum();
        pirate1.howsItGoingMate();
        pirate1.getParrot();
        pirate1.getParrot();
        pirate1.die();
        Ship ship = new Ship();
        ship.fillShip();
        ship.represent();
         */
        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        ship1.fillShip();
        ship2.fillShip();
        ship1.represent();
        System.out.println(ship1.captain.intoxication);
        ship2.represent();
        System.out.println(ship2.captain.intoxication);
        System.out.println(ship1.battle(ship2));
    }
}
