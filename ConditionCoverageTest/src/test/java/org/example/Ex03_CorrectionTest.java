package org.example;

import org.example.Ex03_Correction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex03_CorrectionTest {

    private int[] array;
    private int element;

    @BeforeEach
    void setUp() {
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }

    @Test
    void testElementInArray() {
        element = 5;
        int expectedIndex = 4;
        assertEquals(expectedIndex, Ex03_Correction.binarySearch(array, element));
    }

    @Test
    void testElementNotInArray() {
        element = 11;
        int expectedIndex = -1;
        assertEquals(expectedIndex, Ex03_Correction.binarySearch(array, element));
    }

    @Test
    void testNullArray() {
        assertThrows(NullPointerException.class, () -> Ex03_Correction.binarySearch(null, element));
    }
    @Test
    void testElementSmallerThanMid() {
        int element = 3;
        int expectedIndex = 2;
        assertEquals(expectedIndex, Ex03_Correction.binarySearch(array, element));
    }
}

