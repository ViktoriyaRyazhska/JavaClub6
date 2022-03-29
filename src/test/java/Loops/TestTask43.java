package Loops;

import org.testng.annotations.Test;
import static org.junit.Assert.*;

public class TestTask43 {
    @Test
    public void basicTests() {
        assertEquals(1, Task43.nearestSq(1));
        assertEquals(1, Task43.nearestSq(2));
        assertEquals(9, Task43.nearestSq(10));
        assertEquals(121, Task43.nearestSq(111));
        assertEquals(10000, Task43.nearestSq(9999));
    }
}
