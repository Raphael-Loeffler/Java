import Flyable.ExetendedBird;
import Flyable.Helicopter;

public class TestFlyable {
    public static void main(String[] args) {
        ExetendedBird bird = new ExetendedBird("Parrot", 'w', 4, 13, "huge");
        Helicopter helicopter = new Helicopter();
        bird.takeOff();
        bird.fly();
        bird.land();
        helicopter.takeOff();
        helicopter.fly();
        helicopter.land();
    }
}
