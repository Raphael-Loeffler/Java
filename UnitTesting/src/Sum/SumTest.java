package Sum;

import Anagram.Anagram;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SumTest {
    Sum sum = new Sum();
    @Test
    void testSumMultipleElements() {
        assertEquals(10, sum.sum(new ArrayList<>(Arrays.asList(5, 2, 2, 1))));
    }
    @Test
    void testSumEmptyList() {
        assertEquals(0, sum.sum(new ArrayList<>()));
    }
    @Test
    void testSumOneElement() {
        assertEquals(3, sum.sum(new ArrayList<>(Arrays.asList(3))));
    }
    @Test
    void testAnagram() { assertTrue(Anagram.isAnagram("dog", "god")); }
}
