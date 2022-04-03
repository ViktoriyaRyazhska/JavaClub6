package Loops;

import static org.junit.Assert.assertEquals;

class LoopsTask39Test {

    @org.junit.jupiter.api.Test
    public void betterThanAverage() {
        assertEquals(true, LoopsTask39.betterThanAverage(new int[]{2, 3}, 5));
        assertEquals(true, LoopsTask39.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertEquals(true, LoopsTask39.betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertEquals(false, LoopsTask39.betterThanAverage(new int[]{100, 90}, 11));
    }
}