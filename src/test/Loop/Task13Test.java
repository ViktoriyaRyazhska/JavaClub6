package test.Loop;

import main.Loop.Task13;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class Task13Test {
    @Test
    public void testSumTo1() {
        assertEquals(1, Task13.summation(1));
    }

    @Test
    public void testSumTo8() {
        assertEquals(36, Task13.summation(8));
    }

    @Test
    public void testSumToRandom() {
        Random rand = new Random();
        for (int i = 0; i < 50; ++i) {
            int n = rand.nextInt(100) + 1;
            assertEquals((int) (0.5*n*(1 + n)), Task13.summation(n));
        }
    }
}
