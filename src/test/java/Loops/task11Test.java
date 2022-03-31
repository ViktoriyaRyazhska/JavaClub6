package Loops;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class task11Test {
    @Test
    public void tests() {

        assertEquals(30, Task11.TwiceAsOld(30, 0));
        assertEquals(16, Task11.TwiceAsOld(30, 7));
        assertEquals(15, Task11.TwiceAsOld(45, 30));
    }
}
