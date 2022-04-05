package Loops;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoopsTask38Test {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1}, LoopsTask38.reverse(5));
    }

}