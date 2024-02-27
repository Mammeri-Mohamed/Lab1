package org.example;

import org.example.Ex05;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex05_CorrectionTest {
    @Test
    public void testToRoman_outOfRange() {
        assertThrows(IllegalArgumentException.class, () -> Ex05.toRoman(0));
        assertThrows(IllegalArgumentException.class, () -> Ex05.toRoman(4000));
    }

    @Test
    public void testToRoman_inRange() {
        assertEquals("I", Ex05.toRoman(1));
        assertEquals("IV", Ex05.toRoman(4));
        assertEquals("V", Ex05.toRoman(5));
        assertEquals("IX", Ex05.toRoman(9));
        assertEquals("X", Ex05.toRoman(10));
        assertEquals("XL", Ex05.toRoman(40));
        assertEquals("L", Ex05.toRoman(50));
        assertEquals("XC", Ex05.toRoman(90));
        assertEquals("C", Ex05.toRoman(100));
        assertEquals("CD", Ex05.toRoman(400));
        assertEquals("D", Ex05.toRoman(500));
        assertEquals("CM", Ex05.toRoman(900));
        assertEquals("M", Ex05.toRoman(1000));
        assertEquals("MMMCMXCIX", Ex05.toRoman(3999));
    }
}