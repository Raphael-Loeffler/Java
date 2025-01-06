package CAB;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CABTest {
    CowsAndBulls cab;
    @Test
    void testConstructor01() {
        cab = new CowsAndBulls(new int[]{1, 0, 5, 2});
        assertArrayEquals(cab.getToGuess(), new int[]{1, 0, 5, 2});
    }
    @Test
    void testConstructor02() {
        cab = new CowsAndBulls(new int[]{0, 9, 9, 9});
        assertArrayEquals(cab.getToGuess(), new int[]{0, 9, 9, 9});
    }
    @Test
    void testPlay01() {
        cab = new CowsAndBulls(new int[]{1, 2, 3, 4});
        assertEquals("1 Cows and 2 Bulls", cab.guess(new int[]{1, 3, 2, 0}));
    }
    @Test
    void testPlay02() {
        cab = new CowsAndBulls(new int[]{0, 2, 3, 4});
        assertEquals("1 Cows and 0 Bulls", cab.guess(new int[]{0, 1, 1, 1}));
    }
    @Test
    void testPlay03() {
        cab = new CowsAndBulls(new int[]{4, 5, 1, 0});
        assertEquals("4 Cows and 0 Bulls", cab.guess(new int[]{4, 5, 1, 0}));
    }
    @Test
    void testPlay04() {
        cab = new CowsAndBulls(new int[]{4, 3, 2, 1});
        assertEquals("0 Cows and 4 Bulls", cab.guess(new int[]{2, 4, 1, 3}));
    }
    @Test
    void testCounterAndState() {
        cab = new CowsAndBulls(new int[]{0, 1, 2, 3});
        cab.guess(new int[]{0, 0, 0, 0});
        cab.guess(new int[]{0, 0, 0, 0});
        cab.guess(new int[]{0, 0, 0, 0});
        assertEquals(3, cab.getGuessCounter());
        assertEquals("playing", cab.getState());
        cab.guess(new int[]{0, 1, 2, 3});
        assertEquals("finished", cab.getState());
    }
}
