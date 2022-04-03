package Loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {
    @Test
    public void firstTest() {
        assertTrue(Task7.betterThanAverage(new int[]{10, 9, 8, 6, 4, 9}, 10));
    }
    @Test
    public void secondTest() {
        assertTrue(Task7.betterThanAverage(new int[]{10, 10, 10, 10}, 11));
    }
    @Test
    public void thirdTest() {
        assertTrue(Task7.betterThanAverage(new int[]{100, 90, 90, 76, 34, 100}, 100));
    }
    @Test
    public void fourthTest() {
        assertFalse(Task7.betterThanAverage(new int[]{60, 70, 40, 100}, 20));
    }
    @Test
    public void fifthTest() {
        assertFalse(Task7.betterThanAverage(new int[]{20, 60, 40, 100}, 10));
    }
}