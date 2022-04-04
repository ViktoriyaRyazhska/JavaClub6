package Loops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoopsTask41Test {
    @Test
    public void testSomething() {
        assertEquals(15, LoopsTask41.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, LoopsTask41.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, LoopsTask41.sum(new int[]{}));
        assertEquals(0, LoopsTask41.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, LoopsTask41.sum(new int[]{-1,2,3,4,-5}));
    }

}