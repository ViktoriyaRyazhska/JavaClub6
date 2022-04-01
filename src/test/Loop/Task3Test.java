package test.Loop;

import main.Loop.Task3;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task3Test {

    @Test
    public void simpleTest() {
        assertEquals(2, Task3.getAverage(new int[] {2,2,2,2}));
        assertEquals(3, Task3.getAverage(new int[] {1,2,3,4,5}));
        assertEquals(1, Task3.getAverage(new int[] {1,1,1,1,1,1,1,2}));
    }
}
