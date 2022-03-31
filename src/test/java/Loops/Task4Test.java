package Loops;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Task4Test {
    @Test
    public void TestDoubledArray() {
        assertArrayEquals(new int[] {0, 0, 0}, Task4.map(new int[] {0, 0, 0}));
        assertArrayEquals(new int[] {8, 2, 4, 6, 466}, Task4.map(new int[] {4, 1, 2, 3, 233}));
    }
}
