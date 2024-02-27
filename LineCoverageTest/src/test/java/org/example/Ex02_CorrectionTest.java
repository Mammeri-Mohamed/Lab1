package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Ex02_CorrectionTest {
    @Test
    public void testIsAnagrams() {
        assertTrue(Ex02_Correction.isAnagram("chien", "niche"));
        assertTrue(Ex02_Correction.isAnagram("Listen", "Silent"));
        assertTrue(Ex02_Correction.isAnagram("Debit Card", "Bad Credit"));
    }

    @Test
    public void testIsNotAnagrams() {
        assertFalse(Ex02_Correction.isAnagram("Hello", "World"));
        assertFalse(Ex02_Correction.isAnagram("Test", "Taste"));
    }

    @Test
    public void testDifferentLengths() {
        assertFalse(Ex02_Correction.isAnagram("Look", "Lookout"));
    }

    @Test
    public void testEmptyStrings() {
        assertTrue(Ex02_Correction.isAnagram("", ""));
    }

    @Test
    public void testSpaces() {
        assertTrue(Ex02_Correction.isAnagram("School master", "The classroom"));
    }

    @Test
    public void testNullStrings() {
        assertThrows(NullPointerException.class, () ->Ex02_Correction.isAnagram(null, "test"));
        assertThrows(NullPointerException.class, () ->Ex02_Correction.isAnagram(null, "test"));
    }

}