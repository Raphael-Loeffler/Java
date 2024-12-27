package Anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {
    @Test
    void testAnagram() {
        assertEquals(true, Anagram.isAnagram("dog", "god_!$§%&/("));
        assertEquals(false, Anagram.isAnagram("test", "_"));
    }
}
