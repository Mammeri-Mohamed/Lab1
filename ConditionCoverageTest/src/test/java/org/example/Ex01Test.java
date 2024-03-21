package org.example;

import org.example.Ex01;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex01Test {
    @Test
    public void testIsPalindrome() {
        assertTrue(Ex01.isPalindrome("kayak"));
        assertTrue(Ex01.isPalindrome("Esope reste ici et se repose"));
        assertFalse(Ex01.isPalindrome("Bonjour"));
    }

    @Test
    public void testIsPalindromeWithSpacesAndCase() {
        assertTrue(Ex01.isPalindrome("Able was I ere I saw Elba"));
        assertTrue(Ex01.isPalindrome("A man a plan a canal Panama"));
        assertFalse(Ex01.isPalindrome("Hello World"));
    }

    @Test
    public void testIsPalindromeWithNull() {
        assertThrows(NullPointerException.class, () -> Ex01.isPalindrome(null));
    }
}