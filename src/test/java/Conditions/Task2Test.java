package Conditions;

import static org.junit.Assert.*;
import org.junit.Test;

public class Task2Test {
    @Test
    public void testIsDivisibleTrue() {
        assertEquals(true, Task2.isDivisible(12,4,4));
        assertEquals(true, Task2.isDivisible(12,4,3));
    }
    @Test
    public void testIsDivisibleFalse() {
        assertEquals(false, Task2.isDivisible(3,3,4));
        assertEquals(false, Task2.isDivisible(2,4,3));
    }
}
