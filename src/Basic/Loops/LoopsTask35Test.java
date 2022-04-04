package Loops;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LoopsTask35Test {
    @Test
    public void simpleTest() {
        assertEquals(2,LoopsTask35.getAverage(new int[] {2,2,2,2}));
        assertEquals(3,LoopsTask35.getAverage(new int[] {1,2,3,4,5}));
        assertEquals(1,LoopsTask35.getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }

}