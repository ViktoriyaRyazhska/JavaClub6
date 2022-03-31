package Loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTask34 {

    @Test
    void getAverage() {
        assertEquals(2,Task34.getAverage(new int[] {2,2,2,2}));
        assertEquals(3,Task34.getAverage(new int[] {1,2,3,4,5}));
        assertEquals(1,Task34.getAverage(new int[] {1,1,1,1,1,1,1,2}));
        assertEquals(10,Task34.getAverage(new int[] {1,1,1,1,1,1,1,74}));

    }
}