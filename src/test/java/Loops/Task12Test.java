package Loops;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task12Test {
    @Test
    public void basicTests() {
        assertEquals(1, Task12.nearestSq(0));
        assertEquals(1, Task12.nearestSq(-2));
        assertEquals(9, Task12.nearestSq(10));
        assertEquals(121, Task12.nearestSq(111));
        assertEquals(10000, Task12.nearestSq(9999));
    }
}
