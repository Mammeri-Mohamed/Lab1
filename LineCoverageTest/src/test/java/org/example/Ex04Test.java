package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex04Test {
    @Test
    public void testSolve_zeroA() {
        assertThrows(IllegalArgumentException.class, () -> Ex04.solve(0, 1, 1));
    }

    @Test
    public void testSolve_negativeDelta() {
        assertNull(Ex04.solve(1, 1, 1));
    }

    @Test
    public void testSolve_zeroDelta() {
        assertArrayEquals(new double[]{-1}, Ex04.solve(1, 2, 1), 0.00001);
    }

    @Test
    public void testSolve_positiveDelta() {
        assertArrayEquals(new double[]{1, -3}, Ex04.solve(1, 2, -3), 0.00001);
    }

}