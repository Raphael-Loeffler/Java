package Extension;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by aze on 2017.04.04..
 */
class ExtensionTest {

    Extension extension = new Extension();

    @Test
    void testAdd_2and3is5() {
        assertEquals(4, extension.add(1, 3));
    }

    @Test
    void testAdd_1and4is5() {
        assertEquals(5, extension.add(1, 4));
    }

    @Test
    void testMaxOfThree_first() {
        assertEquals(6, extension.maxOfThree(6, 4, 3));
    }

    @Test
    void testMaxOfThree_third() {
        assertEquals(7, extension.maxOfThree(5, 4, 7));
    }

    @Test
    void testMedian_four() {
        assertEquals(5, extension.median(Arrays.asList(5,7,5,5)));
    }

    @Test
    void testMedian_five() {
        assertEquals(3, extension.median(Arrays.asList(1,2,3,4,5)));
    }

    @Test
    void testIsVowel_t() {
        assertFalse(extension.isVowel('t'));
    }

    @Test
    void testIsVowel_u() {
        assertTrue(extension.isVowel('u'));
    }

    @Test
    void testTranslate_bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }

    @Test
    void testTranslate_lagopus() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
        //assertEquals("havallovo", extension.translate("hallo"));
    }
}