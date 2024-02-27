package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex06Test {
    @Test
    public void testFizzBuzz_negativeOrZero() {
        assertThrows(IllegalArgumentException.class, () -> Ex06.fizzBuzz(0));
        assertThrows(IllegalArgumentException.class, () -> Ex06.fizzBuzz(-1));
        assertThrows(IllegalArgumentException.class, () -> Ex06.fizzBuzz(1));
    }

    @Test
    public void testFizzBuzz_divisibleBy3And5() {
        assertEquals("FizzBuzz", Ex06.fizzBuzz(15));
        assertEquals("FizzBuzz", Ex06.fizzBuzz(30));
    }

    @Test
    public void testFizzBuzz_divisibleBy3() {
        assertEquals("Fizz", Ex06.fizzBuzz(3));
        assertEquals("Fizz", Ex06.fizzBuzz(6));
    }

    @Test
    public void testFizzBuzz_divisibleBy5() {
        assertEquals("Buzz", Ex06.fizzBuzz(5));
        assertEquals("Buzz", Ex06.fizzBuzz(10));
    }



}