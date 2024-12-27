package CountLetters;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLettersTest {
    @Test
    void testCountLetters() {
        CountLetters countLetters = new CountLetters();
        HashMap<String, Integer> map = countLetters.countLetters("abccddd");
        assertEquals(1, map.get("a"));
        assertEquals(1, map.get("b"));
        assertEquals(2, map.get("c"));
        assertEquals(3, map.get("d"));
    }
}
