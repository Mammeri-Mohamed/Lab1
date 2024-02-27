package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Ex02Test {
    @Test
    public void testIsAnagrams() {
        assertTrue(Ex02.isAnagram("chien", "niche"));
        assertTrue(Ex02.isAnagram("Listen", "Silent"));
        assertTrue(Ex02.isAnagram("Debit Card", "Bad Credit"));
    }

    @Test
    public void testIsNotAnagrams() {
        assertFalse(Ex02.isAnagram("Hello", "World"));
        assertFalse(Ex02.isAnagram("Test", "Taste"));
    }

    @Test
    public void testDifferentLengths() {
        assertFalse(Ex02.isAnagram("Look", "Lookout"));
    }

    @Test
    public void testEmptyStrings() {
        assertTrue(Ex02.isAnagram("", ""));
    }

    @Test
    public void testSpaces() {
        assertTrue(Ex02.isAnagram("School master", "The classroom"));
    }

    @Test
    public void testNullStrings() {
        Ex02.isAnagram(null, "test");
        Ex02.isAnagram("test", null);
    }
}