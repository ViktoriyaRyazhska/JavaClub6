package Basic;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Task8Test {
    @Test
    public void testCentury() {
        assertEquals(1, Task8.century(10));
        assertEquals(17, Task8.century(1601));
        assertEquals(20, Task8.century(2000));
        assertEquals(1, Task8.century(89));
    }
}
