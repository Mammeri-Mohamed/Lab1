package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EX6_Correction_Test {
    @Test
    public void testFizzBuzz_negativeOrZero() {
        assertThrows(IllegalArgumentException.class, () -> EX06_Correction.fizzBuzz(0));
        assertThrows(IllegalArgumentException.class, () -> EX06_Correction.fizzBuzz(-1));
        assertThrows(IllegalArgumentException.class, () -> EX06_Correction.fizzBuzz(1));
    }

    @Test
    public void testFizzBuzz_divisibleBy3And5() {
        assertEquals("FizzBuzz", EX06_Correction.fizzBuzz(15));
        assertEquals("FizzBuzz", EX06_Correction.fizzBuzz(30));
    }

    @Test
    public void testFizzBuzz_divisibleBy3() {
        assertEquals("Fizz", EX06_Correction.fizzBuzz(3));
        assertEquals("Fizz", EX06_Correction.fizzBuzz(6));
    }

    @Test
    public void testFizzBuzz_divisibleBy5() {
        assertEquals("Buzz", EX06_Correction.fizzBuzz(5));
        assertEquals("Buzz", EX06_Correction.fizzBuzz(10));
    }



}