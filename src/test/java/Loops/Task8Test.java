package Loops;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task8Test {
    @Test
    public void testGrow() {
        assertEquals(0, Task8.grow(new int[]{1,2,0}));
        assertEquals(-16, Task8.grow(new int[]{-4,1,1,1,4}));
        assertEquals(64, Task8.grow(new int[]{2,2,2,2,2,2}));
    }
}
