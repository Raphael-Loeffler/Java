package Animal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {
    Animal animal = new Animal();
    @Test
    void testThirst() {
        assertEquals(50, animal.thirst);
        animal.drink();
        assertEquals(49, animal.thirst);
        for (int i = 0; i < 49; i++) {
            animal.drink();
        }
        assertEquals(0, animal.thirst);
        animal.play();
        assertEquals(1, animal.thirst);
        for (int i = 0; i < 29; i++) {
            animal.play();
        }
        assertEquals(30, animal.thirst);
    }
    @Test
    void testHunger() {
        assertEquals(50, animal.hunger);
        animal.eat();
        assertEquals(49, animal.hunger);
        for (int i = 0; i < 49; i++) {
            animal.eat();
        }
        assertEquals(0, animal.hunger);
        animal.play();
        assertEquals(1, animal.hunger);
        for (int i = 0; i < 29; i++) {
            animal.play();
        }
        assertEquals(30, animal.hunger);
    }

}
