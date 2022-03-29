package Loops;

import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class TestTask35 {
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {2, 4, 6}, Task35.map(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {8, 2, 2, 2, 8}, Task35.map(new int[] {4, 1, 1, 1, 4}));
        assertArrayEquals(new int[] {2, 2, 2, 2, 2, 2}, Task35.map(new int[] {1, 1, 1, 1, 1, 1}));
    }
}
