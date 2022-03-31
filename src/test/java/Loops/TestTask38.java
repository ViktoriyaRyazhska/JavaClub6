package Loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTask38 {

    @Test
    void betterThanAverage() {
        assertEquals(true, Task38.betterThanAverage(new int[] {2, 3}, 5));
        assertEquals(true, Task38.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertEquals(true, Task38.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertEquals(false, Task38.betterThanAverage(new int[] {100, 90}, 11));
    }
}