package Loops;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LoopsTask36Test {
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2, 4, 6}, LoopsTask36.map(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {8, 2, 2, 2, 8},LoopsTask36.map(new int[] {4, 1, 1, 1, 4}));
        assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, LoopsTask36.map(new int[] {1, 1, 1, 1, 1, 1}));
    }

}