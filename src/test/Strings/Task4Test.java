package test.Strings;

import main.Strings.Task4;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task4Test {

    @Test
    public void testReturnPositiveWhenNegative(){
        assertEquals(1, Task4.opposite(-1));
    }

    @Test
    public void testReturnNegativeWhenPositive(){
        assertEquals(-34, Task4.opposite(34));
    }

    @Test
    public void testReturnZeroWhenZero(){
        assertEquals(0, Task4.opposite(0));
    }
}
