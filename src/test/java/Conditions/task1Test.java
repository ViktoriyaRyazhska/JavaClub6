package Conditions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class task1Test {
    @Test
    public void tests() {
        assertEquals(-1, Task1.opposite(1));
        assertEquals(1, Task1.opposite(-1));
        assertEquals(0, Task1.opposite(0));
    }
}
