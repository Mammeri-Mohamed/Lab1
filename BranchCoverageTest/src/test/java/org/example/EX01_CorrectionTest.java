package org.example;

import org.example.EX01_Correction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EX01_CorrectionTest {
    @Test
    public void testIsPalindrome() {
        assertTrue(EX01_Correction.isPalindrome("kayak"));
        assertTrue(EX01_Correction.isPalindrome("Esope reste ici et se repose"));
        assertFalse(EX01_Correction.isPalindrome("Bonjour"));
    }

    @Test
    public void testIsPalindromeWithSpacesAndCase() {
        assertTrue(EX01_Correction.isPalindrome("Able was I ere I saw Elba"));
        assertTrue(EX01_Correction.isPalindrome("A man a plan a canal Panama"));
        assertFalse(EX01_Correction.isPalindrome("Hello World"));
    }


    @Test
    public void testIsPalindromeWithNull() {
        assertThrows(NullPointerException.class, () -> EX01_Correction.isPalindrome(null));
    }

}