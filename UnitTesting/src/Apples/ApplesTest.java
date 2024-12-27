package Apples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplesTest {
    @Test
    void testGetApples() {
        Apples apples = new Apples();
        assertEquals("apple", apples.getApples());
    }
}
