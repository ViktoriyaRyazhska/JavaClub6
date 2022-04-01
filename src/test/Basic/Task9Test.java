package test.Basic;

import main.Basic.Task9;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task9Test {

    @Test
    public void testMakeNegativeWhenPositive() {
        assertEquals(-42, Task9.makeNegative(42));
        assertEquals(-9, Task9.makeNegative(9));
    }

    @Test
    public void testMakeNegativeWhenNegative() {
        assertEquals(-42, Task9.makeNegative(-42));
        assertEquals(-9, Task9.makeNegative(-9));
    }

    @Test
    public void testDoNothingWhenZero() {
        assertEquals(0, Task9.makeNegative(0));
    }

}
