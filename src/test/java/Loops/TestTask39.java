package Loops;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTask39 {
    @Test
    public void testSomething() {
        assertEquals(6, Task39.grow(new int[]{1,2,3}));
        assertEquals(16, Task39.grow(new int[]{4,1,1,1,4}));
        assertEquals(64, Task39.grow(new int[]{2,2,2,2,2,2}));
    }
}
