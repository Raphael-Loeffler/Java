package Sharpie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SharipeTest {
    Sharpie sharpie;
    @BeforeEach
    void init() {
        sharpie = new Sharpie(100);
    }
    @Test
    void testUse01() {
        assertEquals(100, sharpie.inkAmount);
        sharpie.use();
        assertEquals(90, sharpie.inkAmount);
    }
    @Test
    void testUse02() {
        assertEquals(100, sharpie.inkAmount);
        for (int i = 0; i < 10; i++) {
            sharpie.use();
        }
        assertEquals(0, sharpie.inkAmount);
    }
}
